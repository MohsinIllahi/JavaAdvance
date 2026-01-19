public class ThreadGroupConstructors
{
    public static void main(String[] args)
    {
        ThreadGroup g1 = new ThreadGroup("First ThreadGroup");
        System.out.println(g1.getName()+"  parent:"+ g1.getParent().getName());
        ThreadGroup g2 = new ThreadGroup(g1, "2nd ThreadGroup");
        System.out.println(g2.getName()+"  parent:"+g2.getParent().getName());
    }
}
