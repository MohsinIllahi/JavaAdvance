package controlstatements;

public class ReverseInteger {
public static void main(String[] args) {
    int number=321;
    int rem,reverse=0;
    while (number!=0) {
        //reminder
        rem=number%10;
        //we multiply the reverse number with 10 to add the reminder in it
        reverse=reverse*10+rem;
        //quotient is obtained by dividing the divident by divisor 
        number=number/10;
    }System.out.println(reverse);

    //another method by using for loop
    System.out.println("2nd method");
    int reminder=0;
    int reverseNumber=0;
    int numbers=122;
    for (int i = numbers; i >0; i/=10) {
        reminder=i%10;
        reverseNumber=reverseNumber*10+reminder;
        System.out.println("in loop");
    }
    System.out.println(reverseNumber);
    //third method
      int orig = 123456789;   //assume > 0  
    int num = 0;
    for(int temp = orig;temp > 0;temp/=10)
    {
        num = num * 10 + temp % 10;
    }
    System.out.println(orig + " reversed is " + num);
}
}
