class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(wordList.get(i), Integer.MAX_VALUE);
        }
        if(!map.containsKey(endWord))return 0;
        map.put(beginWord, 1);

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        while(!q.isEmpty()){
            String s = q.poll();
            if(s.equals(endWord))return map.get(endWord);
            for(int i=0;i<s.length();i++){
                for(char j='a';j<='z';j++){
                    String word = s.substring(0, i)+j+s.substring(i+1);
                    if(map.containsKey(word) && map.get(word)>map.get(s)+1){
                        map.put(word, map.get(s)+1);
                        q.offer(word);
                    }
                }
            }
        }
        return map.get(endWord) == Integer.MAX_VALUE?0:map.get(endWord);
    }
}