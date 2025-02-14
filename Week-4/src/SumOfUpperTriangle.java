public class SumOfUpperTriangle {
    public static void main(String[] args){
        int[][] mat = {{2,3,7},{9,7,4},{4,7,8}};
        int result=0;
        for (int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat.length;j++){
                result += mat[i][j];
                
            }
        }
        System.out.println("the sum of upper triangle is:"+result);

    }
}
