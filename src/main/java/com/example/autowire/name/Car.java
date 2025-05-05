package com.example.autowire.name;

public class Car {
    private Specification specification;

    public void setSpecification1(Specification specification) {
        this.specification = specification;
    }

//    --------------1st it make order so that that run 1st(last one) this-----
//    public void setSpecification158(Specification specification) {
//        this.specification = specification;
//    }


    public void displayDetails(){
        System.out.println("Car details : " + specification.toString());
    }


}
