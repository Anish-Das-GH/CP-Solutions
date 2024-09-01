class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      String str1[] =s1.split(" ");
      String str2[] =s2.split(" ");
      String str3[] = new String[str1.length+str2.length];
      HashMap <String,Integer> map = new HashMap<>();
      for(String x:str1)
      {
        map.put(x,map.getOrDefault(x,0)+1);
      }
     for(String x:str2)
      {
        map.put(x,map.getOrDefault(x,0)+1);
      }

      List<String> arr=new ArrayList<>();
        for(String x:map.keySet()){
            if(map.get(x)==1){
            arr.add(x);
            }
        }
     return arr.toArray(new String[arr.size()]);
    }
}