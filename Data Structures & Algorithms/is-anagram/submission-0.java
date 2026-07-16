class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> hm =new HashMap<>();
       for(Character ch: s.toCharArray()){
        hm.put(ch ,hm.getOrDefault(ch,0)+1);
       }
       for(Character ch:t.toCharArray()){
        if(!hm.containsKey(ch)){
            return false;
        }
        hm.put(ch,hm.getOrDefault(ch,0)-1);
        if(hm.get(ch)==0){
            hm.remove(ch);
        }
       }
       return hm.isEmpty();
    }
}
