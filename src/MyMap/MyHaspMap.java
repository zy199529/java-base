package MyMap;
//自定义一个HashMap
public class MyHaspMap<K,V> {
    Node[] table;//位桶数组
    int size;
    public MyHaspMap(){
        table =new Node[16];
    }
    public void put(K key,V value){
        Node new_node = new Node();
        new_node.hash=myHash(key.hashCode(),table.length);
        new_node.key=key;
        new_node.next=null;
        new_node.value=value;
        boolean keyRepeat = false;
        Node last =null;
        Node temp = table[new_node.hash];
        if(temp==null){
            //数组
            table[new_node.hash]=new_node;
            size++;
        }else{
            //链表
            while(temp!=null){
                //判断key是否重复覆盖
                if(temp.key.equals(new_node.key)){
                    keyRepeat=true;
                    temp.value=value;
                    break;
                }else{
                    last=temp;
                    size++;
                    temp=temp.next;
                }
            }
            if(!keyRepeat){
                last.next=new_node;
            }

        }
    }
    public static int myHash(int v,int length){
        System.out.println("hash in myhash:"+(v&(length-1)));
        System.out.println("hash in myhash:"+(v%(length-1)));
        return v&(length-1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<table.length;i++){
            Node temp=table[i];
            while (temp!=null){
                sb.append(temp.key+":"+temp.value+",");
                temp=temp.next;
            }

        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }
    public V get(K key){
        int hash = myHash(key.hashCode(),table.length);
        V value = null;
        if(table[hash]!=null){
            Node temp = table[hash];
            while(temp!=null){
                if(temp.key.equals(key)){
                    value=(V)temp.value;
                    break;
                }
                else{
                    temp=temp.next;
                }
            }
        }
        return value;
    }
    public static void main(String[] args) {
        MyHaspMap<Integer,String> m = new MyHaspMap<>();
        m.put(10,"aa");
        m.put(20,"bb");
        m.put(30,"cc");
        m.put(30,"dd");
        m.put(53,"gg");
        m.put(69,"hh");
        m.put(85,"kk");
//        for(int i=10;i<100;i++){
//            System.out.println(i+myHash(i,16));
//        }
        System.out.println(m.get(69));
        System.out.println(m.toString());
    }
}

