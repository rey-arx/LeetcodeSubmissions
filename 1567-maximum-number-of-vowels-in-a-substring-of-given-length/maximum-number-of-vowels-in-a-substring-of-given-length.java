class Solution {
    public int maxVowels(String s, int k) {
        int sum = 0;
        int res=0;
        int[] arr = new int[s.length()];
        int i=0;
        String vowel = "aeiou";
        // first window:
        boolean chk = false;
        for(;i<k;i++){
            if(vowel.contains(""+s.charAt(i))) chk = true;
            else chk = false;
            if(chk){
                arr[i] =1;
                sum++;
            }
            else{
                arr[i]=0;
            }
        }
        // System.out.println(sum);
        if(sum>res) res = sum;
        for(;i<s.length();i++){
            if(vowel.contains(""+s.charAt(i))){
            chk = true;    
            }
            else chk=false;
            if(chk){
                arr[i] =1;
            }
            else{
                arr[i]=0;
            }
            sum+=arr[i]-arr[i-k];
            // System.out.println(sum);
            if(sum>res) res = sum;
        }
            // System.out.println(Arrays.toString(arr)) ;
        return res;
    }
}