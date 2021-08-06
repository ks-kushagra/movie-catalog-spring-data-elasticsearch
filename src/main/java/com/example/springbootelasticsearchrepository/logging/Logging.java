package com.example.springbootelasticsearchrepository.logging;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Logging {
    static public Logger logger = Logger.getLogger(Logging.class);
    
    static String path = "E:\\Netbeans\\SpringBootElasticSearchRepository\\src\\main\\java\\log4j.properties";
    public static void  run(){
       PropertyConfigurator.configure(path);
    }

}
