package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class worldarea {

    String china= "\"中国\"";
    String Denmark= "\"丹麦\"";
    String Ukraine= "\"乌克兰\"";
    String Uzbekistan= "\"乌兹别克斯坦\"";
    String Uruguay= "\"乌拉圭\"";
    String Armenia= "\"亚美尼亚\"";
    String Israel= "\"以色列\"";
    String Iraq= "\"伊拉克\"";
    String Iran= "\"伊朗\"";
    String Russia= "\"俄罗斯\"";
    String Bulgaria= "\"保加利亚\"";
    String Croatia= "\"克罗地亚\"";
    String Guam= "\"关岛\"";
    String Iceland= "\"冰岛\"";
    String Guinea= "\"几内亚\"";
    String Congo= "\"刚果（金）\"";
    String Canada= "\"加拿大\"";
    String Ghana= "\"加纳\"";
    String Hungary= "\"匈牙利\"";
    String NorthMacedonia= "\"北马其顿\"";
    String SouthAfrica= "\"南非\"";
    String Qatar= "\"卡塔尔\"";
    //String Rwanda= "\"卢旺达\"";
    String Luxembourg= "\"卢森堡\"";
    String India= "\"印度\"";
    String Indonesia= "\"印度尼西亚\"";
    String Guatemala= "\"危地马拉\"";
    String Ecuador= "\"厄瓜多尔\"";
    String Cuba= "\"古巴\"";
    String Kyrgyzstan= "\"吉尔吉斯斯坦\"";
    String Djibouti= "\"吉布提\"";
    String Kazakhstan= "\"哈萨克斯坦\"";
    String Columbia= "\"哥伦比亚\"";
    String CostaRica= "\"哥斯达黎加\"";
    String Cameroon= "\"喀麦隆\"";
    String Turkey= "\"土耳其\"";
    String SanMarino= "\"圣马力诺\"";
    String Egypt= "\"埃及\"";
    String Senegal= "\"塞内加尔\"";
    String Serbia= "\"塞尔维亚\"";
    String Cyprus= "\"塞浦路斯\"";
    String Mexico= "\"墨西哥\"";
    String Dominican= "\"多米尼加\"";
    String Austria= "\"奥地利\"";
    String Venezuela= "\"委内瑞拉\"";
    String Bangladesh= "\"孟加拉国\"";
    String Andorra= "\"安道尔\"";
    String Nigeria= "\"尼日利亚\"";
    String Niger = "\"尼日尔\"";
    String Palestine= "\"巴勒斯坦\"";
    String Pakistan= "\"巴基斯坦\"";
    String Paraguay= "\"巴拉圭\"";
    String Panama= "\"巴拿马\"";
    String Bahrain= "\"巴林\"";
    String Brazil= "\"巴西\"";
    String burkinafaso= "\"布基纳法索\"";
    String Greece= "\"希腊\"";
    String Germany= "\"德国\"";
    String Italy= "\"意大利\"";
    String Latvia= "\"拉脱维亚\"";
    String Norway= "\"挪威\"";
    String Czech= "\"捷克\"";
    String Moldova= "\"摩尔多瓦\"";
    String Morocco= "\"摩洛哥\"";
    String Slovakia= "\"斯洛伐克\"";
    String Slovenia= "\"斯洛文尼亚\"";
    String SriLanka= "\"斯里兰卡\"";
    String Singapore= "\"新加坡\"";
    // String NewZealand= "\"新西兰\"";
    String Japan= "\"日本\"";
    String Chile= "\"智利\"";
    String Guernsey= "\"根西岛\"";
    String Georgia= "\"格鲁吉亚\"";
    String Belgium= "\"比利时\"";
    // String Mauritius= "\"毛里求斯\"";
    String SaudiArabia= "\"沙特阿拉伯\"";
    String France= "\"法国\"";
    String FaroeIslands= "\"法罗群岛\"";
    String poland= "\"波兰\"";
    String PuertoRico= "\"波多黎各\"";
    String Bosnia= "\"波黑\"";
    String Thailand= "\"泰国\"";
    String Jersey= "\"泽西岛\"";
    String Honduras= "\"洪都拉斯\"";
    String Australia= "\"澳大利亚\"";
    String Ireland= "\"爱尔兰\"";
    String Estonia= "\"爱沙尼亚\"";
    String TrinidadandTobago= "\"特立尼达和多巴哥\"";
    String bolivia= "\"玻利维亚\"";
    String Sweden= "\"瑞典\"";
    String Switzerland= "\"瑞士\"";
    String Guadeloupe= "\"瓜德罗普岛\"";
    String Reunion= "\"留尼旺\"";
    String Belarus= "\"白俄罗斯\"";
    String Gibraltar= "\"直布罗陀\"";
    String Kuwait= "\"科威特\"";
    String CotedIvoire= "\"科特迪瓦\"";
    String Peru= "\"秘鲁\"";
    String Tunisia= "\"突尼斯\"";
    String Lithuania= "\"立陶宛\"";
    String Jordan= "\"约旦\"";
    String Romania= "\"罗马尼亚\"";
    String USA= "\"美国\"";
    String Kenya= "\"肯尼亚\"";
    String Finland= "\"芬兰\"";
    String UK= "\"英国\"";
    String Netherlands= "\"荷兰\"";
    String Philippines= "\"菲律宾\"";
    String Salvatore= "\"萨尔瓦多\"";
    String Portugal= "\"葡萄牙\"";
    String Spain= "\"西班牙\"";
    String Vietnam= "\"越南\"";
    String Azerbaijan= "\"阿塞拜疆\"";
    String Afghanistan= "\"阿富汗\"";
    String Algeria= "\"阿尔及利亚\"";
    String Albania= "\"阿尔巴尼亚\"";
    String Oman= "\"阿曼\"";
    String Argentina= "\"阿根廷\"";
    String TheUnitedArabEmirates= "\"阿联酋\"";
    String Korea= "\"韩国\"";
    String Isleofman= "\"马恩岛\"";
    String Martinique= "\"马提尼克\"";
    String Malaysia= "\"马来西亚\"";
    String Mayotte= "\"马约特\"";
    String Malta= "\"马耳他\"";
    String Lebanon= "\"黎巴嫩\"";
    String Montenegro= "\"黑山\"";


    Map<String,String> world = new HashMap<String,String>();
    public worldarea(){
        world.put("china",china);
        world.put("Denmark",Denmark);
        world.put("Ukraine",Ukraine);
        world.put("Uzbekistan",Uzbekistan);
        world.put("Uruguay",Uruguay);
        world.put("Armenia",Armenia);
        world.put("Israel",Israel);
        world.put("Iraq",Iraq);
        world.put("Iran",Iran);
        world.put("Russia",Russia);
        world.put("Bulgaria",Bulgaria);
        world.put("Croatia",Croatia);
        world.put("Guam",Guam);
        world.put("Iceland",Iceland);
        world.put("Guinea",Guinea);
        world.put("Congo",Congo);
        world.put("Canada",Canada);
        world.put("Ghana",Ghana);
        world.put("Hungary",Hungary);
        world.put("NorthMacedonia",NorthMacedonia);
        world.put("SouthAfrica",SouthAfrica);
        world.put("Qatar",Qatar);
    //world.put("Rwanda",Rwanda);
        world.put("Luxembourg",Luxembourg);
        world.put("India",India);
        world.put("Indonesia",Indonesia);
        world.put("Guatemala",Guatemala);
        world.put("Ecuador",Ecuador);
        world.put("Cuba",Cuba);
        world.put("Kyrgyzstan",Kyrgyzstan);
        world.put("Djibouti",Djibouti);
        world.put("Kazakhstan",Kazakhstan);
        world.put("Columbia",Columbia);
        world.put("CostaRica",CostaRica);
        world.put("Cameroon",Cameroon);
        world.put("Turkey",Turkey);
        world.put("SanMarino",SanMarino);
        world.put("Egypt",Egypt);
        world.put("Senegal",Senegal);
        world.put("Serbia",Serbia);
        world.put("Cyprus",Cyprus);
        world.put("Mexico",Mexico);
        world.put("Dominican",Dominican);
        world.put("Austria",Austria);
        world.put("Venezuela",Venezuela);
        world.put("Bangladesh",Bangladesh);
        world.put("Andorra",Andorra);
        world.put("Nigeria",Nigeria);
        world.put("Niger",Niger);
        world.put("Palestine",Palestine);
        world.put("Pakistan",Pakistan);
        world.put("Paraguay",Paraguay);
        world.put("Panama",Panama);
        world.put("Bahrain",Bahrain);
        world.put("Brazil",Brazil);
        world.put("burkinafaso",burkinafaso);
        world.put("Greece",Greece);
        world.put("Germany",Germany);
        world.put("Italy",Italy);
        world.put("Latvia",Latvia);
        world.put("Norway",Norway);
        world.put("Czech",Czech);
        world.put("Moldova",Moldova);
        world.put("Morocco",Morocco);
        world.put("Slovakia",Slovakia);
        world.put("Slovenia",Slovenia);
        world.put("SriLanka",SriLanka);
        world.put("Singapore",Singapore);
    //world.put("NewZealand",NewZealand);
        world.put("Japan",Japan);
        world.put("Chile",Chile);
        world.put("Guernsey",Guernsey);
        world.put("Georgia",Georgia);
        world.put("Belgium",Belgium);
    // world.put("Mauritius",Mauritius);
        world.put("SaudiArabia",SaudiArabia);
        world.put("France",France);
        world.put("FaroeIslands",FaroeIslands);
        world.put("poland",poland);
        world.put("PuertoRico",PuertoRico);
        world.put("Bosnia",Bosnia);
        world.put("Thailand",Thailand);
        world.put("Jersey",Jersey);
        world.put("Honduras",Honduras);
        world.put("Australia",Australia);
        world.put("Ireland",Ireland);
        world.put("Estonia",Estonia);
        world.put("TrinidadandTobago",TrinidadandTobago);
        world.put("bolivia",bolivia);
        world.put("Sweden",Sweden);
        world.put("Switzerland",Switzerland);
        world.put("Guadeloupe",Guadeloupe);
        world.put("Reunion",Reunion);
        world.put("Belarus",Belarus);
        world.put("Gibraltar",Gibraltar);
        world.put("Kuwait",Kuwait);
        world.put("CotedIvoire",CotedIvoire);
        world.put("Peru",Peru);
        world.put("Tunisia",Tunisia);
        world.put("Lithuania",Lithuania);
        world.put("Jordan",Jordan);
        world.put("Romania",Romania);
        world.put("USA",USA);
        world.put("Kenya",Kenya);
        world.put("Finland",Finland);
        world.put("UK",UK);
        world.put("Netherlands",Netherlands);
        world.put("Philippines",Philippines);
        world.put("Salvatore",Salvatore);
        world.put("Portugal",Portugal);
        world.put("Spain",Spain);
        world.put("Vietnam",Vietnam);
        world.put("Azerbaijan",Azerbaijan);
        world.put("Afghanistan",Afghanistan);
        world.put("Algeria",Algeria);
        world.put("Albania",Albania);
        world.put("Oman",Oman);
        world.put("Argentina",Argentina);
        world.put("TheUnitedArabEmirates",TheUnitedArabEmirates);
        world.put("Korea",Korea);
        world.put("Isleofman",Isleofman);
        world.put("Martinique",Martinique);
        world.put("Malaysia",Malaysia);
        world.put("Mayotte",Mayotte);
        world.put("Malta",Malta);
        world.put("Lebanon",Lebanon);
        world.put("Montenegro",Montenegro);}
}