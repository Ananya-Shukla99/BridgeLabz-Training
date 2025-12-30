class Solution {
    public int strStr(String s, String t) {
 
        for(int i=0,j=t.length() ; j<=s.length();i++, j++){

            if(s.substring(i, j).equals(t)){
                return i;
            }
        }
        return -1;
    }
}