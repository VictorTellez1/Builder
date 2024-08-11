package com.builder;

import com.builder.domain.Address;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder()
                .setAge(10)
                .setName("Penny")
                .setGender("Femenino")
                .setAddress(new Address("Calle 9","Medillin","Colombia","050030"))
                .build();

        //Una ventaja es que puedes settear los valores unicos que requieras, por ejemplo si solo quieres el nombre los demas
        //van a quedar en null
    }
}