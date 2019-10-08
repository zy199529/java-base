package MyMap;

public class Node<K,V> {
    K key;
    int hash;
    V value;
    Node next;

    public void setKey(K key) {
        this.key = key;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getKey() {
        return key;
    }

    public int getHash() {
        return hash;
    }

    public Object getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }


}
