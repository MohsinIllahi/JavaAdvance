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
}
}
