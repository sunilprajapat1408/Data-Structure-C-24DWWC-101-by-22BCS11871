
public class Reverse_Word {
    public static void main(String[] args) {
        String str = "I am Sunil Prajapat";
        String reversed = "";  // for  reversed += word[i]+" "; this line 

        String[] word = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = word.length -1; i >= 0; i--) {
            // sb.append(word[i]).append(" ");  // append use for add space in last "am "
            reversed += word[i]+" "; 
        }

        System.out.println(str);
        // System.out.println(sb.toString().trim());  // trim remove unwanted space 
        System.out.println(reversed);
    }
}
