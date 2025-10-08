package oop;
//this is used as current class reference as a argument to a method or constructor
class Student {
    void display() {
        System.out.println("Display method called");
    }

    void callHelper() {
        Helper h = new Helper();
        h.help(this); // passing current object to Helper
    }
}

class Helper {
    void help(Student s) {
        System.out.println("Helper received a Student object");
        s.display(); // calling Student’s method using the passed object
    }
}

public class UsagesOfthisKeyword {
    public static void main(String[] args) {
        Student std = new Student();
        std.callHelper();
    }

}
