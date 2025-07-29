public class gridWays {
    public static int gridWay(int i, int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1){ // if we are at the ending point, then there is only one way to reach the target
            return 1;
        } else if(i > n || j > m){ // if we move out of the boundary of the GRID, then there are 0 ways
            return 0;
        }

        // recursive call
        int way1 = gridWay(i+1, j, n, m);
        int way2 = gridWay(i, j+1, n, m);

        return way1 + way2;
    }
    public static void main(String[] args) {
        int n = 2, m = 3;
        // int grid[][] = new int[n][m];
        System.out.println(gridWay(0,0,n,m));
    }
}
