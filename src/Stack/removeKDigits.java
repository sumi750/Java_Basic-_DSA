package Stack;
import java.util.*;

public class removeKDigits {
    public static void main(String[] args) {
        String st = "1432219";
        int k =3;
        System.out.println(removeK(st, k));
    }

    public static String removeK(String num, int k){
        Stack<Character> st = new Stack<>();
        int n = num.length();

        for(int i=0; i<n; i++){
            while(k>0 && !st.isEmpty() && st.peek()-'0' > num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k > 0){
            st.pop();
            k--;
        }

        if(st.isEmpty()) return "0";
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            if(ch == '0' && sb.isEmpty()) continue;
            sb.append(ch);
        }
        return sb.isEmpty()  ? "0" : sb.toString();
    }
}
