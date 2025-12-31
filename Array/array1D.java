import java.net.SocketPermission;
import java.util.Arrays;
import java.util.Scanner;

public class array1D{
    public static void main(String[] args) {

        // Array of primitive
        Scanner in = new Scanner(System.in);
       
        int[] arr = new int[5];
        System.out.println("For primitive data integer ");
        
        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        //  for(int i =0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println(Arrays.toString(arr)); // with correct formate to print o/p shortcut  

        
       
   
    // array of object
     System.out.println("For object data String ");
        String str[] = new String[4];

        for(int j=0;j<str.length;j++){
            str[j]= in.next();
    }

    System.out.println(Arrays.toString(str));

    str[1] = "Sunil"; // modify data 
    System.out.println(Arrays.toString(str));


    
} }
// For primitive data integer 
// 1 2 3 4 5
// [1, 2, 3, 4, 5]
// For object data String 
// ram sita gita shyam
// [ram, sita, gita, shyam]
// [ram, Sunil, gita, shyam]