package oop;
/*
Association (HAS-A relationship)
Definition :
Association is a relationship where one class uses or interacts with another class by holding a reference to it. It represents a HAS-A relationship in object-oriented programming.
Example :
.Student HAS-A Address
.Car HAS-A Engine.
.Laptop HAS-A Processor.
How to achieve association ?
Association is achieved by declaring object references as instance variables inside a class.
We can inject dependent objects using:
Direct Reference Variables
Creating the object directly inside the class
Constructor Injection
Passing the dependent object through the constructor
Setter Injection
Injecting the dependent object using a public setter method */

//Direct Reference Variables
class Address {
    String country="Pakistan";
    String city="Karachi";

    public void displayAddress() {
        System.out.println("City: " + city + ", Country: " + country);

    }

}
class Student{
    String name;
    int id;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    Address address= new Address();
    void displayInfo(){
        System.out.println("id "+id+" and name is "+name);
        address.displayAddress();
    }
}
public class Association {
    public static void main(String[] args) {
        Student std=new Student("Mohsin", 71);
        std.displayInfo();
    }

}
