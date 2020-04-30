package com.example.demo;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import com.example.demo.Request;

public class Tellingtime implements Job
{
	static String time;
	

    public void execute(JobExecutionContext context)
    throws JobExecutionException {

		//����ʱ�������ʽ
    	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��");
         time = simpleDateFormat.format(new Date());
		//��ӡ����ִ��ʱ��
    	Request re=new Request();
    	try {
			re.China("script[ id=getAreaStat]");
			re.world("script[ id=getListByCountryTypeService2true]");			
			 System.out.println("Hello Quartz!"+time);  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
    }
 
}
