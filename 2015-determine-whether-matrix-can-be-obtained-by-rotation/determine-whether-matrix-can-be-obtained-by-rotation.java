class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean res = false;
        //looping 4 times to check all 360 degree
        for(int i=0;i<4;i++){
            boolean res1=true;
            for(int j=0;j<mat.length;j++){
                for(int k=0;k<mat.length;k++){
                    if(mat[j][k] != target[j][k]){
                        res1 = false;
                        break;
                    }
                }
                if(res1 == false) break;
            }
           if(res1 == true){
            res = true;
            break; 
           } 
            //finding the transpose:
            for(int j=0;j<mat.length;j++){
                for(int k=j+1;k<mat.length;k++){
                    
                        int temp = mat[j][k];
                        mat[j][k] = mat[k][j];
                        mat[k][j] = temp;
                    
                }
            }
            // System.out.println( " trans mat" + i );
            // for(int j=0;j<mat.length;j++){
            //     for(int k=0;k<mat.length;k++){
            //         System.out.print(mat[j][k]+ " " );
                    
            //     }
            //     System.out.println();
            // }
            // reversing the array
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
            // System.out.println( "rev mat" + i );
            // for(int j=0;j<mat.length;j++){
            //     for(int k=0;k<mat.length;k++){
            //         System.out.print(mat[j][k]+ " " );
                    
            //     }
            //     System.out.println();
            // }
            // checking if equal
            
        }
        return res;
    }
}