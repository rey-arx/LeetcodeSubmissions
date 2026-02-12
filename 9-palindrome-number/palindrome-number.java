class Solution {
    public boolean isPalindrome(int x) {
       boolean res = true;
       String num =""+x;
       int i=0;
       int j=num.length()-1;
       while(i<j){
        if(num.charAt(i) != num.charAt(j)){
            res = false;
            break;
        }
        else{
            i++;
            j--;
        }
       }
       return res;
    }
}