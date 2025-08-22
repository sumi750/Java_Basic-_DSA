package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueInString {
    public static void main(String[] args) {
        String str = "level";
        System.out.println(firstUniqe(str));
    }

    public static Character firstUniqe(String str){
        int[] freq = new int[26];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;

            q.offer(i);   //Add index

            while(!q.isEmpty() && freq[str.charAt(q.peek())-'a']  > 1){
                q.poll();
            }
        }

        if(q.isEmpty()) return null;
        return str.charAt(q.peek());
    }
}
