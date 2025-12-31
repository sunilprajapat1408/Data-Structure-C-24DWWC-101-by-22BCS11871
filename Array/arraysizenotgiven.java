import java.util.ArrayList;
import java.util.Scanner;

public class arraysizenotgiven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // 1 2 3 4 5
        String[] nums = str.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for (String num  : nums) {
            list.add(Integer.parseInt(num));
        }

        for (int ele : list) {
            System.out.print(ele+" "); // 1 2 3 4 5
        }

    }
}
