

public class Statement {
     int kl;
    private static void arrayFound( int[] arrayOfInts){
        int searchFor=10;
        
    boolean isFound=false;
    int i;
    for ( i = 0; i < arrayOfInts.length; i++) {
        if (arrayOfInts[i]==searchFor) {
            isFound=true;
            break;
            
        }
    }
    if(isFound){
        System.out.println("Number :"+searchFor+" is found on array on index of :"+i);
    }else{
        System.out.println("Number :"+searchFor+" is not in array");
    }
    }
    //ArrayExample
    private static void arrayExample(){
  int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[4];
        anArray[0]=1;
        anArray[1]=5;
        anArray[2]=3;
        anArray[3]=9;
        for (int i : anArray) {
            System.out.println(i);
        }
    }
public static void main(String[] args) {
    int[] arrayOfInts={12,5,6,7,9,0};
arrayFound(arrayOfInts);
System.out.println("============================");
arrayExample();
      String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println("Length of array:"+names.length); 
System.arraycopy(names, 0, names, 0, 0);
    
}
}
