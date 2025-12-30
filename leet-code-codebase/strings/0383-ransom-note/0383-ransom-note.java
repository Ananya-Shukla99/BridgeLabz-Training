class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int []brr =new int [26];

        for(int i=0;i<magazine.length(); i++){
            char ch=magazine.charAt(i);
            brr[ch-'a']++;
        }
        for(int i=0;i<ransomNote.length(); i++){
            char ch=ransomNote.charAt(i);
            brr[ch-'a']--;
            if(brr[ch-'a']<0){
                return false;
            }
        } 
          
        return true;
    }
}