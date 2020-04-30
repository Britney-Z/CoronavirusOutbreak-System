package com.example.demo;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import com.example.demo.Tellingtime;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class Quarttest extends Thread {
      public void run(){
 //   public static void main(String[] args) {
        try {
            //����scheduler
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            //����һ��JobDetail
            JobDetail job = newJob(Tellingtime.class) //����Job��ΪHelloQuartz�࣬����������ִ���߼�����
                .withIdentity("job1", "group1") //����name/group
                .usingJobData("name", "quartz") //��������
                .build();
          //����һ��Trigger
            Trigger trigger = newTrigger().withIdentity("trigger1", "group1") //����name/group   
                .withSchedule(CronScheduleBuilder.cronSchedule("0 10 12 ? * *")) //�涨ÿ��20��50����һ��
                .build();
            
            mysql.updatechartchina();
            mysql.deletechartchina();
            mysql.chartchina();
          
            
            mysql.updatechartworld();
            mysql.deletechartworld();
            mysql.chartworld();

            //�����������
            scheduler.scheduleJob(job, trigger);

            //start scheduler
            scheduler.start();

            //����һ��ʱ���ر�
           // Thread.sleep(10000);
            //scheduler.shutdown(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}