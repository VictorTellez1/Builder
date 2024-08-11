package com.builder;

import com.builder.domain.Address;
import com.builder.domain.Contact;
import com.builder.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phones = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();

    public Employee() {
    }

    public Employee(int age, String name, String gender, Address address, List<Phone> phones, List<Contact> contacts) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
        this.contacts = contacts;
    }

    //Desde aqui vamos a implementar los sets del objeto
    public static class EmployeeBuilder implements IBuilder{
        private int age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone> phones;
        private List<Contact> contacts;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setAge(int age){
            this.age = age;
            return this; //Retorna el objeto con el que estamos trabajando
        }

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this; //Retorna el objeto con el que estamos trabajando
        }
        public EmployeeBuilder setGender(String gender){
            this.gender = gender;
            return this; //Retorna el objeto con el que estamos trabajando
        }

        public EmployeeBuilder setAddress(Address address){
            this.address = address;
            return this; //Retorna el objeto con el que estamos trabajando
        }
        public EmployeeBuilder setAddress(String address,String city,String country,String cp){
            this.address = new Address(address,city,country,cp);
            return this; //Retorna el objeto con el que estamos trabajando
        }
        public EmployeeBuilder setPhone(Phone phone){
            this.phones.add(phone); //Como es una lista simplemente lo agregamos
            return this; //Retorna el objeto con el que estamos trabajando
        }
        public EmployeeBuilder setPhone(String phoneNumber,String ext,String phoneType){
            this.phones.add(new Phone(phoneNumber,ext,phoneType)); //Como es una lista simplemente lo agregamos
            return this; //Retorna el objeto con el que estamos trabajando
        }
        public EmployeeBuilder setContact(Contact contact){
            this.contacts.add(contact); //Como es una lista simplemente lo agregamos
            return this; //Retorna el objeto con el que estamos trabajando
        }
        public EmployeeBuilder setContact(String name,Phone phone,Address address){
            this.contacts.add(new Contact(name,phone,address)); //Como es una lista simplemente lo agregamos
            return this; //Retorna el objeto con el que estamos trabajando
        }



        @Override
        public Employee build() {
            return new Employee(age,name,gender,address,phones,contacts);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", phones=" + phones +
                ", contacts=" + contacts +
                '}';
    }
}
