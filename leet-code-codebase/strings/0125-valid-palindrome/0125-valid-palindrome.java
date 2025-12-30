class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int n = str.length();

        for(int i =0 ;i<n/2;i++){
            char char1 = str.charAt(i);
            char char2 = str.charAt(n-1-i);

            if(char1 != char2){
                return false;
            }
        }

        return true;
    }
}