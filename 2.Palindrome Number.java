class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        
        if(x>=0){
        while(x!=0)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
        
        }
        else{
            return false;
        }
        if(rev!=temp)
        {
            return false;
        }
        return true;
        
        
    }
}
//java
