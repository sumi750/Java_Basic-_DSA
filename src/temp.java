public class temp {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};

        String s1 = "Sumit";
        StringBuilder sb = new StringBuilder(" ");
        for(int i = s1.length()-1; i>=0; i--){
            char ch = s1.charAt(i);
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
