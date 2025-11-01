package strings;

public class EualsMethodInString {
    
    public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    //== is for checking refernce of object (if they are on same location in memory.)
    //== in string will be true because String literal will be stored in string literal/constant pool which is inside heap memory but special for string.
    System.out.println(s1==s2); //true
    System.out.println(s1.equals(s2)); //true 
    /*
    .equals() method will check content of objects but it internally is == in String because Object is parent class
    String class and String is providing own implemtation of .equals method */
    String s3= new String("mohsin");
    String s4= new String("mohsin");
    System.out.println("s3.equals(s4)"+s3.equals(s4));//true because content is same.
    System.out.println("s3==s4 check");
        System.out.println(s3==s4);//false because they own different memory in heap separately

    }

}
