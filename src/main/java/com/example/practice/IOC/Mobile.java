package com.example.practice.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        //the usual way of creating objects
        Airtel airtel = new Airtel();
        airtel.calling();
        airtel.data();
        /*
        without making changes, can we use vodaphone instead of airtel?
        no.
        this means, all 3 lines need to be modified each time
         */

        Sim sim = new Vodaphone();
        sim.calling();
        sim.data();
        /*
        By using an interface instead, we have runtime polymorphism
        Only 1 line of code needs to be changed (which object is created vodaphone/airtel)
        This is still not ideal
         */

        /*
        With Spring Inversion of Control (IOC), NO MORE CREATING OBJECTS ON OUR OWN
        1) Define all the classes from which objects need to be created in a conf file
        2) IOC Container will create and manage those objects
        3) We can use the objects
        How do we do (2) and (3)?
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");
        /*
        Create the container. beans.xml must be in the classpath (created under src)
        beans.xml is the config file
        define all the classes for which we want an object created here
        place this file in the resources folder
         */

        Airtel air = (Airtel) context.getBean("airtel");
        Vodaphone voda = context.getBean("Vodaphone",Vodaphone.class);
        /*
        Use context.getBean to get the object
        This is not ideal as we still need to change the sourcecode
         */

        Sim sim2 = context.getBean("Sim",Sim.class);
        sim2.calling();
        sim2.data();
        /*
        use the interface to create the object
        if we need a vodaphone or airtel, amend only the bean in beans.xml
        no change to source code at all
         */
    }
}
