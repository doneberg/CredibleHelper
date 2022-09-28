package org.example;

public class Person {
    private String firstName;
    private boolean isMale;

    public Person(String firstName, boolean isMale){
        this.firstName = firstName;
        this.isMale = isMale;
    }

    public String name(){
        return firstName;
    }

    public boolean isMale(){
        return isMale;
    }
}
