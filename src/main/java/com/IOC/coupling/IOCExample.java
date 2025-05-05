package com.IOC.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main (String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationCLooseCoupling.xml");

        UserManager managerWithDB = (UserManager)context.getBean("managerWithDB");
        System.out.println(managerWithDB.getUserInfo());

        UserManager managerWithWS = (UserManager) context.getBean("managerWithWS");
        System.out.println(managerWithWS.getUserInfo());

        UserManager managerWithNP = (UserManager) context.getBean("mangerWithNP");
        System.out.println(managerWithNP.getUserInfo());





//--------Without spring containers-------------

//        UserDataProvider DataProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(DataProvider);
//        System.out.println(userManagerWithDB.getUserInfo());
//
//
//        UserDataProvider WebServiceProvider = new WebServiceDatabaseProvider();
//        UserManager userManagerWithWS = new UserManager(WebServiceProvider);
//        System.out.println(userManagerWithWS.getUserInfo());
//
//        UserDataProvider newServiceProvider =new NewDatabaseProvider();
//        UserManager userManagerWithNP = new UserManager(newServiceProvider);
//        System.out.println(userManagerWithNP.getUserInfo());

    }
}
