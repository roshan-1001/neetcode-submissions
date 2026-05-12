public class Node{
    
    int value;
    int key;
    Node prev;
    Node next;

    public Node(int key, int value){
        this.value = value;
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    int cap;
    HashMap<Integer,Node> cache;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node){
        node.prev = this.right.prev;
        node.prev.next = node;
        node.next = this.right;
        this.right.prev = node;
    }
    
    public int get(int key) {
        if(this.cache.containsKey(key)){
            remove(this.cache.get(key));
            insert(this.cache.get(key));
            return cache.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(this.cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node node = new Node(key,value);
        
        insert(node);
        cache.put(key,node);
        
        if(this.cache.size()>cap){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
