package com.ani.spring;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ani.spring.config.AppConfig;
import com.ani.spring.excel.XLManager;
import com.ani.spring.excel.XlConfig;
import com.ani.spring.util.FileChecker;
import com.ani.spring.util.FileUtil;



/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
   
        public static void normal() {
            FileUtil util = new FileUtil();
    
            FileChecker checker = new FileChecker(util);
            checker.checkFileValidity();
        }
    
        public static void withSpring() {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    
            FileChecker checker = ctx.getBean(FileChecker.class);
            checker.checkFileValidity();
        }
        public static void withSpringXmlConfig() {
            System.out.println("🔥 Providing Dependencies With Xml Config 🔥");
            ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    
            FileChecker checker = ctx.getBean(FileChecker.class);
            checker.checkFileValidity();
        }
        public static void withSpringAnnotationConfig() {
            System.out.println("🔥 Providing Dependencies With Annotation Config 🔥");
            ApplicationContext ctx = new AnnotationConfigApplicationContext(XlConfig.class);
    
            String[] names = ctx.getBeanDefinitionNames();
            System.out.println(Arrays.toString(names));
            XLManager manager = ctx.getBean(XLManager.class);
            System.out.println(manager);
             manager.configXL();
        }
        public static void name() {
            
        }
    
        public static void main(String[] args) {
          //  withSpring();
           // withSpringXmlConfig();
           withSpringAnnotationConfig();
        }
    }

   

