
package com.guppy.spring3beans.configurationInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author kemalsamikaraca
 */
public class SpringApp {
    
    public static void main(String[] args){
        
        System.out.println("--- --- --- Spring 3 Bean Tutorial--- --- ---");
               
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(new String[]{"Beans.xml"});
        
        // --- Configuration Inheritance Example --- 
        Customer childObj = (Customer)context.getBean("childBean");
        childObj.printCustomerInfo();
        
        
    }
    
}



