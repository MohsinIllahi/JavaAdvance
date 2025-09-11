package controlstatements;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
          System.out.println("1st method");
        int temp=1;
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp += 1;
                }
            }
            
            if (temp == 0) {
                System.out.print(i + " ");
            } else {
                temp = 0;
            }
        }
        // 2nd method
        System.out.println();
        System.out.println("2nd method");
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count==2) {
     System.out.print(i+" "); 
     count=0;  
    }else{
        count=0;
               

    }
        }

    }

}
