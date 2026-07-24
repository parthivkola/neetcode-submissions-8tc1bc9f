class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String mot : strs){
            char[] chars = mot.toCharArray();
            Arrays.sort(chars);
            String cle = new String(chars);
            if(map.containsKey(cle)){
                map.get(cle).add(mot);
            }
            else{
                List<String> nouvelleListe = new ArrayList<>();
                nouvelleListe.add(mot);
                map.put(cle, nouvelleListe);
            }
        }
    return new ArrayList<>(map.values());
    }
}
