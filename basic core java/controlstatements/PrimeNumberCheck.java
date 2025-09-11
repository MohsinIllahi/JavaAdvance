package controlstatements;

public class PrimeNumberCheck {
public static void main(String[] args) {
    int number=7,temp=0;
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

    //another simple method
    //if count is equal to 2 then it is prime otherwise not
    System.out.println("2nd Method");
    int count=0;
    for (int i = 1; i <=number; i++) {
        if (number%i==0) {
            count+=1;
        }
    }
    if (count==2) {
        System.out.println("Prime");
    }else{
        System.out.println("Not a prime");
    }
}
}
