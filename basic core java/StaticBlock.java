public class StaticBlock {
    /*(All static blocks more than 1 also)
    Static block executes before the main method while executing program. 
    Statements written inside the static block will execute first. However both are static. */
    static{
        System.out.println("Hello welcome to static block.");
    }
    public static void main(String[] args) {
        System.out.println("Hello I am main method run after the static block.");
    }
}
