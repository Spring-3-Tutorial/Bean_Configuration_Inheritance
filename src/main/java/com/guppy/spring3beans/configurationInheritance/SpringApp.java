
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
        
        // --- Configuration Inheritance Example --- (not abstract parent Bean)
        Customer parentObj = (Customer)context.getBean("parentBean");
        parentObj.printCustomerInfo();
        
        // --- Configuration Inheritance Example --- (abstract parent Bean)
        // --- This will occur run time error because of abstraction
        //Customer abstractParentObj = (Customer)context.getBean("abstractParentBean");
        //abstractParentObj.printCustomerInfo();
        
        // --- Configuration Inheritance Example --- (child Bean)
        Customer childObj = (Customer)context.getBean("childBean");
        childObj.printCustomerInfo();
        
        // --- Configuration Inheritance Override Example --- 
        Customer childObjTwo = (Customer)context.getBean("childBeanTwo");
        childObjTwo.printCustomerInfo();
        
        
    }
    
}



