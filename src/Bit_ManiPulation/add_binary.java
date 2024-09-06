package Bit_ManiPulation;
public class add_binary {
    public static String addbin(String a , String b){
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0 || j>=0 || carry == 1){
            if(i>=0){
                carry = carry + a.charAt(i--)-'0';
            }
            if(j>=0){
                carry = carry + b.charAt(j--)-'0';
            }
            sb.append(carry % 2);
            carry /=2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        String add = addbin(a,b);
        System.out.println(add);
    }
}
