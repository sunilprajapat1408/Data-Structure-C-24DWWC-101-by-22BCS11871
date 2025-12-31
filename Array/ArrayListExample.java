import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

    //     list.add(5);
    //     list.add(51);
    //     list.add(3);
    //     list.add(74);
    //     list.add(3);
    //     list.add(56);
    // list.add(1, 55);
        
    //     System.out.println("Contails or not check "+list.contains(3));
    //     System.out.println(list);

        // user input 
        System.out.println("Enter the Array ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
        sc.close();
    }
} 
