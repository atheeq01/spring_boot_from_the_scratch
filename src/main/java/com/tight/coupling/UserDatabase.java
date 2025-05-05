package com.tight.coupling;

// when I change the database future then it change everything
// A - postgres,mysql
// B - Web Service, MongoDB



public class UserDatabase {
    public String getUserDetails(){
        // Directly Access database here
        return "User Details From Database";
    }
}
