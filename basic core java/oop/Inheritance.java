package oop;
class A 
{
    void showA()
    {
    System.out.println("A class method");
    }    
}
class B extends A 
{
    void showB()
    {
    System.out.println("B class method");
    }    
}
public class Inheritance extends B 
{
    public static void main(String[] args) 
    {
        Inheritance inherit= new Inheritance();
        inherit.showA();
        inherit.showB();
    }

}
