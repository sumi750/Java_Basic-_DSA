package GRAPHS;
import java.util.*;
import java.util.Queue;

class Ppair{
    String first;
    int second;
    Ppair(String f, int s){
        this.first = f;
        this.second = s;
    }
}

public class Word_Ladder {
    public static int ladder(String beginWord, String endWord, String[] list){
        Queue<Ppair> q = new LinkedList<>();
        q.add(new Ppair(beginWord, 1));

        Set<String> st = new HashSet<>(Arrays.asList(list));

        if (!st.contains(endWord)) return 0;

//        st.remove(beginWord);

        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();

            if(word.equals(endWord)) return steps;

            //word = hat
            for(int i=0; i<word.length(); i++){
                char[] replacedArray = word.toCharArray();
                for(char ch = 'a'; ch <= 'z'; ch++){
                    replacedArray[i] = ch;
                    String replacedWord = new String(replacedArray);

                    if(st.contains(replacedWord)){
                        st.remove(replacedWord);
                        q.add(new Ppair(replacedWord, steps+1));
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "fog";
        String[] list = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println("Shortest Transformation " + ladder(beginWord, endWord, list));
    }
}
