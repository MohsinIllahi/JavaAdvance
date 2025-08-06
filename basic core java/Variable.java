 class Student {

    int a;
    static int id=35;
    void change(){
        System.out.println(id);
    }

    
}
public class Variable {
public static void main(String[] args) {
    Student obj1= new Student();
    Student obj2= new Student();
/*Suppose you make 2 objects of class Student and you change the value of static variable from one object. 
Now when you print it from other object, it will display the changed value. This is because it was declared static 
i.e it is constant for every object created. */
    obj1.change();
    Student.id=1;
    obj2.change();
     
}
    
}