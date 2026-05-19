class Node{
    private HashMap<Character,Node> children = new HashMap<>();
    private boolean endofw = false;
}


class WordDictionary {

    private Node root;

    public WordDictionary() {
        this.root = new Node();
    }

    public void addWord(String word) {
        
        Node curr = root;

        for (char c : word.toCharArray()){
            curr.children.putIfAbsent(c,new Node());
            curr = curr.children.get(c);
        }

        curr.endofw = true;

    }

    public boolean search(String word) {
        
        return dfs(word,0,root);

    }

    public boolean dfs(String word, int index, Node node){
        
        if (node == null){
            return false;
        }

        if (index == word.length()){
            return node.endofw;
        }
        char c = word.charAt(index);

        if (c=='.'){
            for (Node child : node.children.values()){
                if(dfs(word,index+1,child)){
                    return true;
                }
            }
            return false;
        }
        else{
            Node next = node.children.get(c);
            return dfs(word,index+1,next);
        }
    }
}
