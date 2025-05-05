package com.loose.coupling;

// when I change the database future easy to change loose coupling
// A - postgres,mysql
// B - Web Service, MongoDB



public class UserDatabaseProvider  implements UserDataProvider{

    public String getUserDetails(){
        // Directly Access database here
        return "User Details From Database";
    }
}
