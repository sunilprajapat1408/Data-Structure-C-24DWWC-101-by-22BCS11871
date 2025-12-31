import java.util.Arrays;
// variable arguments (varArg) -> ek function me kitne bhi arguments pass kar sakte hai
public class varArg {
    public static void main(String[] args) {
        // varArg obj = new varArg();
        // obj.fun(2,7,8,9);   // agar fun() ko static na banate to hume object create karna padta
        fun(2,3,4,5,6,7,8,9);
        fun2("Hello ",1,2,3,4,5,6,7,8,9);
    }

     static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun2(String msg, int ...v){
        System.out.println(msg + Arrays.toString(v));
    }
}
