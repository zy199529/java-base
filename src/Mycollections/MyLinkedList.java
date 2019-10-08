package Mycollections;

public class MyLinkedList<E> {
    private Node first;
    private Node last;
    private int size;
    public void add(E element){
        Node node = new Node(element);
        if(first==null){
            node.previous=null;
            node.next=null;
            first=node;
            last=node;
        }else{
            node.previous=last;
            node.next=null;
            last.next=node;
            last = node;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp=first;
        sb.append("[");
        while(temp!=null){
            sb.append(temp.element+",");
            temp=temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }
    public void checkRange(int index){
        if(index<0||index>size-1){
            throw new RuntimeException("索引不合法:"+index);
        }
    }
    public void add(int index,E element){
        checkRange(index);
        Node new_node = new Node(element);
        Node temp=getNode(index);
        if(index ==0){
            new_node.next=temp;
            temp.previous=new_node;
            first = new_node;
        }
        if(index ==size-1){
            temp.next=new_node;
            new_node.previous=temp;
            last=new_node;
        }
        if(index!=0&&index!=size-1&&temp!=null){
            Node up = temp.previous;
            up.next=new_node;
            new_node.previous=up;
            new_node.next=temp;
            temp.previous=new_node;
        }

    }
    public void remove(int index){
        checkRange(index);
        Node temp =getNode(index);
        if(temp!=null){
            Node up = temp.previous;
            Node down = temp.next;
            if(up!=null){
                up.next=down;
            }
            if(index==0){
                first=down;
            }
            if(index==size-1){
                last=up;
            }
            if(down!=null){
                down.previous=up;
            }
            size--;
        }
    }
    private Node getNode(int index){
        checkRange(index);
        Node temp=null;
        if(index<(size>>1)){
            temp = first;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
        }else {
            temp = last;
            for(int i=size-1;i>index;i--){
                temp=temp.previous;
            }
        }
        return temp;
    }
    public Object get(int index){
        checkRange(index);
        Node temp =getNode(index);
        return temp!=null?temp.element:null;
    }
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.get(1));
//        list.remove(0);
        list.add(2,"wer");
        System.out.println(list.toString());
    }
}
