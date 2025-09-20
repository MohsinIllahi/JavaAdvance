package oop;

public class Animal {
    public void eat() {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        /*
         * In Java, Animal dog; declares a reference variable of type Animal.
         * To create an actual object, we use the new keyword like this: dog = new
         * Animal();.
         * This not only allocates memory for the object on the heap, but also calls the
         * constructor to initialize it.
         * The full expression Animal dog = new Animal(); both declares the reference
         * and initializes it with a new object.
         */
        /*
         * In Java, a method is a block of code that performs a specific task.
         * When a method is called, memory is allocated on the stack for its local
         * variables and parameters.
         * After the method finishes execution, that stack memory is automatically
         * freed.
         */
        Animal dog = new Animal();

        dog.eat();
        // by using . operator we can call attr/state/behaviour of an object
        dog.run();

        //
        System.out.println("Bird");
        Bird bird= new Bird();
        bird.fly();
    }

    public void run() {
        System.out.println("I am running");
    }

}
class Bird{
void fly(){
    System.out.println("I am flying");
}
    
}
