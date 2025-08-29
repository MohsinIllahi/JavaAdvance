public class InstanceOfOperatorExample {
    /*
     * This class holds an example of instanceOf operator which is a type
     * comparision operator.
     * basically we check that if an object is an instence of a class or its sub
     * class or an interface
     * which is implemented by that class.
     */
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
       
        System.out.println("obj1 is instanceOf Parent " + (obj1 instanceof Parent));
        System.out.println("obj1 is instanceOf Child " + (obj1 instanceof Child));
        System.out.println("obj1 is instanceOf Parent " + (obj1 instanceof myInterface));
        System.out.println("");
        System.out.println("obj2 is instanceOf Parent " + (obj2 instanceof Parent));
        System.out.println("obj2 is instanceOf Child " + (obj2 instanceof Child));
        System.out.println("obj2 is instanceOf myInterface " + (obj2 instanceof myInterface));
    }

}

class Parent {
}

class Child extends Parent implements myInterface {
}

interface myInterface {
}