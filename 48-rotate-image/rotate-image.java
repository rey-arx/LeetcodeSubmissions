class Solution {
    public void rotate(int[][] mat) {
            //finding the transpose:
            for(int j=0;j<mat.length;j++){
                for(int k=0;k<mat.length;k++){
                    if(k>j){
                        int temp = mat[j][k];
                        mat[j][k] = mat[k][j];
                        mat[k][j] = temp;
                    }
                }
            }

            for(int l=0;l<mat.length;l++){
            int j =0;
            int k = mat.length-1;
            while(j<k){
                int temp = mat[l][k];
                mat[l][k] = mat[l][j];
                mat[l][j] = temp;
                j++;
                k--;
            }
            }
        }
    
}