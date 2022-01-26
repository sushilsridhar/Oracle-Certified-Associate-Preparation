import java.util.Arrays;

class DataTypes {
    public static void main(String[] args) {
        
        int intNumber = 5; // int is default type for number
        
        //int 1intNumber = 5;  ---> name can't start with a number
        
        long longNumber = 112233444L; //-----> use L for long & f for Float ( default is double )
        
        System.out.println(intNumber);
        System.out.println(longNumber);
        
        //---------------- CHAR 
        char A = 65;
        System.out.println(A);
        
        
        //----------- prefix and postfix
        int x = 5; // x = 6
        int y = x++; // y = 5
        
        System.out.println("x "+x);
        System.out.println("y "+y);
        
        //----------- Array copy
        
        int[] source = {3,2,1};
        int[] destination = new int[source.length + 1];
        
        System.arraycopy(source, 0, destination, 0, source.length);
        
        System.out.println(Arrays.toString(destination));
        
        Arrays.sort(destination);
            
        System.out.println("After sorting :"+Arrays.toString(destination));
        
        System.out.println("binary search :"+ Arrays.binarySearch(destination, 11)); 
        // Binary Search----> if value is positive - true, if negative - false 
        
        Arrays.fill(destination, 0, 2, 7); // first two values are 7
        
        System.out.println(Arrays.toString(destination));
    }
}