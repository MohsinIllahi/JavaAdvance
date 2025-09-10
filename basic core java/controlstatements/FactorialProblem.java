package controlstatements;

public class FactorialProblem {
    int factRecursion = 1;

    // factorial: 5!=5*4*3*2*1
    // i will practice two examples how to solve the factorial problem
    // 1st one is by for loop and 2nd one will be by recursion
    public static void main(String[] args) {

        int fact = 1;
        int no = 5;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("By using Forward loop :Factorial of " + no + " is " + fact);
        int factBackward = 1;
        for (int i = no; i >= 1; i--) {
            factBackward = factBackward * i;
        }
        System.out.println("By using Backward loop :Factorial of " + no + " is " + fact);
        // there is 2nd method recursion:method calling itself repeatedly
        FactorialProblem factorialProblem = new FactorialProblem();

        System.out.println("By recursion method: " + factorialProblem.callingFactorial(no));

    }

    int callingFactorial(int no) {
        if (no > 1) {
            factRecursion = factRecursion * no;
            callingFactorial(no - 1);
        }
        return factRecursion;
    }
}
