package Stack;
import java.util.*;
public class BasicStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(5);
        st.push(9);
        st.push(3);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            rt.push(x);
            st.pop(); // also contains the value of pop element
        }
        System.out.println(rt);

        Stack<Integer> ct = new Stack<>();
        while(rt.size()>0){
            int x = rt.peek();
            ct.push(x);
            rt.pop(); // also contains the value of pop element
        }
        System.out.println(ct);


    }
}
