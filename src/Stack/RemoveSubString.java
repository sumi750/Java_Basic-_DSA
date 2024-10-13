package Stack;
import java.util.*;
public class RemoveSubString {
    public static int remove(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            if(ch == 'B' && st.peek() == 'A') st.pop();
            else if(ch == 'D' && st.peek() == 'C') st.pop();
            else{
                st.push(ch);
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        String s = "CDABCDD";
        int n = remove(s);
        System.out.println(n);
    }
}
