// public class inp_out {
//     public static void main(String[] args) {
//       String message = sum();
//       System.out.println(message + "World!");
//     }
    
//       static String sum(){
//         String a = "Hello, ";
//         return a ;

//       }
//     }

// class inp_out {
//     static void swap(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;
//     }

//     public static void main(String[] args) {
//         int x = 10, y = 20;
//         swap(x, y);
//         System.out.println(x + " " + y);
//     }
// }

// shadoing 
public class inp_out{
  static int x = 10; // global variable

  static void func(){ 
    System.out.println(x + " global");
  }

  public static void main(String[] args) {
    System.out.println(x + " global");
    int x = 20; // local variable
    System.out.println(x + " local");
    func();

  }
}