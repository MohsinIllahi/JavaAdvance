public class InitilizerBlock {
    {
        System.out.println("Inside Initilizer Block");
    }
    public InitilizerBlock()
{
    System.out.println("Default constructor called.");
}
public static void main(String[] args) {
    InitilizerBlock object= new InitilizerBlock();
    System.out.println(object instanceof Object);
    System.out.println("inside main method");
}
}
