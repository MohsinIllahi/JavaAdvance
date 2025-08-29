public class MainMethodPractice {
  public native int my();
int instanceVariable = 10;
public void instaMethod(){
 int instanceVariable = 5;
 System.out.println(instanceVariable);
 System.out.println(this.instanceVariable);
}
  public static void main(String[] args) {
    if(args.length==0){
       System.out.println("No args passed"); 
    }else{
        System.out.println("args passed"); 
    }
    for(String arg:args){
        System.out.println("list of args:"+arg);
    }
  }
}

