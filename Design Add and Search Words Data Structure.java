//Trie Node Structure
class Node{
    Node links[] = new Node[26];
    boolean flag = false;
}

class WordDictionary {
    private static Node root;
    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node node = root;
        for(int i=0; i<word.length();i++){
            char ch =  word.charAt(i);
            //if the node is null only, then we will add our character and create it's reference node
            if(node.links[ch-'a'] == null){
                node.links[ch-'a'] = new Node();
            }
            //Now we will go to the reference of the node
            node = node.links[ch-'a'];
        }
        //Atlast, we have completely inserted our word in the trie, so mark the flag as true
        node.flag = true;
    }
    
    public boolean search(String word) {
        //Here we have created our dfs method which will search our word in the trie and 
        //it will handle the situation, if '.' comes in the word
        //if '.' comes in the word, it means we can have any words between a to z
        return dfs(word, root, 0);
    }

    public boolean dfs(String word, Node curr, int idx){
        Node node = curr;
        //we will start traversing the entire word
        for(int i=idx; i<word.length();i++){
            char ch =  word.charAt(i);
            //if the word contains '.', then we will traverse all the characters from a to z
            if(ch=='.'){
                //Traverse all the child of node
                for(Node child: node.links){
                    //if the child is not null, then we will traverse the next characters of words
                    //if both are true then return true
                    if(child != null && dfs(word, child, i+1)) return true;
                } 
        //Atlast, if we traverse all the childs of node, and we did not get anything we will return false
                return false;
            }
            //If we did not get '.' in words, then we will do normal search in trie
            else{
    //if node doesn't contains the character, it means the word is not there in Trie, so return false
                if(node.links[ch-'a']==null) return false;
                //else go to the refrence of that node
                node = node.links[ch-'a'];
            }
        }
        //If we traverse the entire word, then return the flag 
        return node.flag;
    }
}