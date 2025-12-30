class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String word[]=s.split(" ");
        if(word.length != pattern.length()){
            return false;
        }
        Map index =new HashMap();
        for( Integer i=0;i<word.length; i++){
            if(index.put(pattern.charAt(i), i) != index.put(word[i],i)){
                return false;
            }
        }
        return true;
    }
}