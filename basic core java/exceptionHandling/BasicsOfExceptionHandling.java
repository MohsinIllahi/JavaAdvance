package exceptionHandling;

public class BasicsOfExceptionHandling {
    public static void main(String[] args) {
        //exception is an unexpected event occur in between execution of our program
    //there are two types of exception in java 1. checked exception and 2. unchecked exception 
    //checked exception are exceptions which will be checked by compiler at the time of compilation 
    // compiler will ask to handle it before execution of program
    // 2. Unchecked are the ones which will not be checked by compiler at the time of execution
    //to handle that exception we can use try-catch , throw, finally,throws keyword
    //try-catch
    try
    {
        Class.forName("jdk");
    }
    catch(Exception e)
    {
        //here exception object is created in method where exception is occured then it is referenced to e variable of Exception type 
        // in object there will be three things exceptionName , description , strackTrace
        //if we use method :printStackTrace we will get all three things in that object 
        //if we use e directly we will not get any stackTrace of that exception
        //and by using .getMessage() method we will get only description of that exception.
        // try must be followed by catch 
        //catch will be executed when exception occurs otherwise not.
        //in try block line where exception is occuring the code after exception will not be executed .
        //directly it will go to catch 
        //catch can be multiple with a try.
        //but it must follow like in first catch there should be child class of exception in 2nd catch so it must follow this thing 

        e.printStackTrace();
    }
    }
}

