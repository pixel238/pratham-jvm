package com.tavisca.workshops.pratham.Hello;

public class helloWorld {
    public static void main(String args[]) {
        Person firstHuman = new Person();
        firstHuman.setName("Chaman");
        firstHuman.setAge(21);
        firstHuman.setGender("Male");
        firstHuman.setCountry("India");
        System.out.println(sayHello(firstHuman));
    }

    public static String sayHello(Person firstHuman)
    {
        //System.out.println(firstHuman.getName());
        String value="";
        if(firstHuman.getCountry().toLowerCase().equals("india"))
            value+="Namaste ";
        else if (firstHuman.getCountry().toLowerCase().equals("spain"))
            value+="Hola ";

        if(firstHuman.getGender().toLowerCase().equals("female")||firstHuman.getGender().toLowerCase().equals("f"))
        {
            value+="Miss "+firstHuman.getName();
        }

        else if(firstHuman.getGender().toLowerCase().equals("male")||firstHuman.getGender().toLowerCase().equals("m"))
        {
            if(firstHuman.getAge()<18)
                value+= "Master "+firstHuman.getName();
            else
                value+= "Mr "+firstHuman.getName();
        }
        else
            value+= firstHuman.getName();

        return value;
    }
}

