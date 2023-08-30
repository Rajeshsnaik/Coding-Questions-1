//print matrix values in a snake order
import java.util.ArrayList;

public class tcs6 {
    public static void main(String[] args) {
        int[][] m= {{1,2,3},{6,5,4},{7,8,9},{12,11,10}};
        ArrayList<Integer> res=new ArrayList<>();
        System.out.println(solve(m, res));
    }

    public static ArrayList<Integer> solve(int[][] m,ArrayList<Integer> res)
    {
        int n=m.length;
        int p=m[0].length;
        for(int i=0;i<n;i++)
        {
            if(i%2 != 0)
            {
                for(int j=p-1;j>=0;j--)
                {
                    res.add(m[i][j]);
                }
            }
            if(i%2 == 0)
            {
                for(int j=0;j<p;j++)
                {
                    res.add(m[i][j]);
                }
            }
        }
        return res;
    }

}
