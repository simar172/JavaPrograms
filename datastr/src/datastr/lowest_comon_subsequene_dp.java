package datastr;

public class lowest_comon_subsequene_dp {
	static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp[][]=new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                dp[i][j]=-1;
            }
        }
        return lcsutil(x,y,s1,s2,dp);
    }
    
    static int lcsutil(int x, int y, String s1, String s2,int dp[][]){
        if(x==0 || y==0){
            return 0;
        }
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        if(s1.charAt(x-1)==s2.charAt(y-1)){
            return dp[x][y]=1+lcsutil(x-1,y-1,s1,s2,dp);
        }
        return dp[x][y]=Math.max(lcsutil(x-1,y,s1,s2,dp),lcsutil(x,y-1,s1,s2,dp));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ABCDGH";
		String b="AEDFHR";
		System.out.println(lcs(a.length(), b.length(), a, b));
	}

}
