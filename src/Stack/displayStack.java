package Stack;
import java.util.*;
public class displayStack {
    public static void displayRec(Stack<Integer> s){
        //Display Stack Recursively
        if(s.size() == 0){
            return;
        }
         int top = s.pop();
         System.out.print(top+ " ");
         displayRec(s);
         s.push(top);
    }
    public static void pushAtBootom(Stack<Integer> st, int x){
        if(st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBootom(st,x);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverseStack(st);
        pushAtBootom(st, top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(5);
        st.push(9);
        st.push(3);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
