package controlstatements;

public class PrimeNumberCheck {
public static void main(String[] args) {
    int number=8,temp=0;
    outer:
    for(int i=2;i<=number-1;i++){
        if (number%i==0) {
            temp+=i;
            break outer;
        }
    }
    if (temp>0) {
        System.out.println("Not a prime number.");
    }else{
        System.out.println("Prime number.");
    }
}
}
