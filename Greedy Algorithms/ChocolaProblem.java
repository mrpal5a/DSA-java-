import java.util.*;
public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer horCos[] = {2,1,3,1,4}; // m - 1 // horizontal cost
        Integer verCos[] = {4,1,2}; // n - 1 // vertical cost

        //sorting in descending order
        Arrays.sort(horCos, Collections.reverseOrder());
        Arrays.sort(verCos, Collections.reverseOrder());

        int h = 0, v = 0; // horizontal and vertical pointers
        int hp = 1, vp = 1; // initial horizontal and vertical pieces
        int cost = 0;

        while(h < horCos.length && v < verCos.length){
            if(horCos[h] >= verCos[v]){ // horizontal cut
                cost += (horCos[h] * vp);
                hp++;
                h++;
            }else{ // vertical cut
                cost += (verCos[v] * hp);
                vp++;
                v++;
            }
        }

        //remaining vertical pieces
        while(v < verCos.length){
             cost += (verCos[v] * hp);
                vp++;
                v++;
        }

        // remaining horizontal pieces
        while(h < horCos.length){
            cost += (horCos[h] * vp);
                hp++;
                h++;
        }
        System.out.println("Minimum cost : " +cost);
    }
}
