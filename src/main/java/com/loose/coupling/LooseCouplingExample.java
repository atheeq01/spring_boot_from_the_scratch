package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main (String[] args){

        UserDataProvider DataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(DataProvider);
        System.out.println(userManagerWithDB.getUserInfo());


        UserDataProvider WebServiceProvider = new WebServiceDatabaseProvider();
        UserManager userManagerWithWS = new UserManager(WebServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newServiceProvider =new NewDatabaseProvider();
        UserManager userManagerWithNP = new UserManager(newServiceProvider);
        System.out.println(userManagerWithNP.getUserInfo());

    }
}
