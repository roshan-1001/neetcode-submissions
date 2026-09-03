class Node{
    private final int key;
    int value;
    Node left = null;
    Node right = null;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public int getKey(){
        return this.key;
    }


}

class LRUCache {

    private final Map<Integer,Node> map = new HashMap<>();
    private final int capacity; 

    Node begin = new Node(0,0);
    Node end = new Node(0,0);

    

    int size = 0;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        begin.right = end;
        end.left = begin;
    }
    
    public int get(int key) {

        int res = -1;

        if (map.containsKey(key)){
            res = map.get(key).getValue();

            Node currNode = map.get(key);

            currNode.left.right = currNode.right;
            currNode.right.left = currNode.left;

            currNode.left = begin;
            currNode.right = begin.right;
            begin.right.left = currNode;
            begin.right = currNode;
        }
        return res;
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            
            Node currNode = map.get(key);
            currNode.value = value;
            currNode.left.right = currNode.right;
            currNode.right.left = currNode.left;

            currNode.left = begin;
            currNode.right = begin.right;
            begin.right.left = currNode;
            begin.right = currNode;


        }

        else{
            Node currNode = new Node(key,value);
            currNode.left = begin;
            currNode.right = begin.right;
            begin.right.left = currNode;
            begin.right = currNode;
            map.put(key,currNode);

            this.size++;

            if(size>capacity){
                Node remNode = end.left;
                remNode.left.right = end;
                end.left = remNode.left;
                map.remove(remNode.getKey());
                this.size--;
            }
        }
        
    }
}
