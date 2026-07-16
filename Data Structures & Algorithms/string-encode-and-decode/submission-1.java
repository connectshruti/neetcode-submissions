class Solution {

    public String encode(List<String> strs) {
      StringBuilder encodedStr= new StringBuilder();
      for(String str: strs){
        int currentLength= str.length();
        encodedStr.append(currentLength);
        encodedStr.append("#");
        encodedStr.append(str);
      }
      System.out.println(encodedStr);
      return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> list= new ArrayList<String>();
        StringBuilder sb= new StringBuilder(str);
        int i=0;
        while(i<sb.length()){
        int j =i;
        while(sb.charAt(j)!='#'){
          j++;
        }
        int size = Integer.parseInt(sb.substring(i,j));
        j++;
          String current=sb.substring(j,j+size);
          list.add(current);
          System.out.println(current);
          i=j+size;
        }
        
        return list;

    }
}
