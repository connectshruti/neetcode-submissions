class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<String,ArrayList<String>> hs= new HashMap<>();
        for(String str : strs){
        String currentSorted=sortTheString(str);
        if(hs.containsKey(currentSorted)){
            ArrayList<String> list=hs.get(currentSorted);
            list.add(str);
            hs.put(currentSorted,list);
        }else{
            ArrayList<String> list=new ArrayList<>();
            list.add(str);
            hs.put(currentSorted,list);
        }
    }
    for(Map.Entry<String,ArrayList<String>> entry:hs.entrySet()){
        
    result.add(entry.getValue());

    }
    return result;
    }
    private String sortTheString(String str){
        char[] charsArray= str.toCharArray();
        Arrays.sort(charsArray);
        String sorted= new String(charsArray);
        return sorted;
    }
}

