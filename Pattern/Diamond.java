// public class Diamond {
//     public static void main(String[] args) {
//         int n =4;
//         for(int i=1;i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             } //formula 2*i-1
//             for(int j=2;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// // inverse 
//         for(int i=n;i>=1; i--){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


public class Diamond {
    public static void main(String[] args) {
        int n =4;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            } //formula 2*i-n
           
            System.out.println();
        }
// inverse 
        for(int i=n;i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}


