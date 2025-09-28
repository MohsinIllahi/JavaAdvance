package oop;
class X {
void show(){
    System.out.println("A");
}
    
}
public class MethodOverriding extends X{
    
    void show(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        X a = new X();
        a.show();//A
        X b= new MethodOverriding();
        b.show();//B
        MethodOverriding c= new MethodOverriding();
        c.show();//B
    }
}

