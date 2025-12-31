import java.util.*;

public class arraygiven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); //4
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 1 2 3 4
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" "); //output 1 2 3 4
        }
    }
}