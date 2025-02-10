//Question
//Given route containing 4 directions (N,E,W,S) find the shortest path to reach the destination "WNEENESENNN"

public class shortestPath {
    public static void roughWork(){            //|(3,4)
//             N                                 |   
//             ^                              |- | 
//             |                            |--|-
//             |(0,0)                       -
//   W<--------|---------->E         forumal to find shortest path or DISPLACEMENT:
//             |                    
//             |                    Math.sqrt[(x2-x1)^2 + (y2-y1)^2]
//             v
//             S
// so the logic is clear we take two variable x and y
// if we move toward N then y++ and if we move in S then y--,
// similarly for West and East, for E we will x++ and for W we will do x--
    }
    public static void shortPath(String str){
        int x2 = 0;
        int y2 = 0;
        int x1 = 0;
        int y1 = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            switch (ch) {
                case 'N': y2++;   
                    break;
                case 'S': y2--;
                break;
                case 'W': x2--;
                break;
                case 'E':x2++;
                break;
                default:
                    break;
            }
        }
        int x = x2-x1;
        int y = y2 - y1;
        System.out.println("("+x +", "+y+")");
       int total = x*x + y*y;
        double DISPLACEMENT = Math.sqrt(total);
        System.out.println("Shortes Path is "+DISPLACEMENT);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortPath(str);
    }
}
