package String;
import java.util.*;

public class ShortPath {

    public static float shortPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='W'){
                x--;
            } else if (path.charAt(i) =='N' ) {
                y++;
            } else if (path.charAt(i) =='S') {
                y--;
            } else if (path.charAt(i) =='E') {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float displacment = shortPath(path);

        System.out.println(displacment);

    }
}
