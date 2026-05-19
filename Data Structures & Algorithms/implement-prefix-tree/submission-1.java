class TreeNode{
    HashMap<Character,TreeNode> children = new HashMap<>();
    boolean endofw = false;
}


class PrefixTree {

    private TreeNode root;

    public PrefixTree() {
        root = new TreeNode();
    }

    public void insert(String word) {
        
        TreeNode curr = root;
        
        for (char c : word.toCharArray()){
            curr.children.putIfAbsent(c, new TreeNode());
            curr = curr.children.get(c);
        }

        curr.endofw = true;
    }

    public boolean search(String word) {
        TreeNode curr = root;
        for (char c : word.toCharArray()){
            if (!curr.children.containsKey(c)){
                return false;
            }
            curr = curr.children.get(c);
        }
        return curr.endofw;
    }

    public boolean startsWith(String prefix) {
        TreeNode curr = root;
        for (char c : prefix.toCharArray()){
            if (!curr.children.containsKey(c)){
                return false;
            }
            curr = curr.children.get(c);
        }
        return true;
    }
}
