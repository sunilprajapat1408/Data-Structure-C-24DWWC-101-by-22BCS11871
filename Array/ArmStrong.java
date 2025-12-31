import java.util.Scanner;

public class ArmStrong {

    static boolean isArmStrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem * rem * rem;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        for(int i = 100; i <= 999; i++){
            if(isArmStrong(i)){
                System.out.println(i + " ");
            }
        }

        // if (isArmStrong(number)) {
        //     System.out.println(number + " is an Armstrong number.");
        // } else {
        //     System.out.println(number + " is not an Armstrong number.");
        // }
    }
}
