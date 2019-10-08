package Mycollections;

/**
 * 自定义实现一个ArrayList
 */
public class TestCollections<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFALT_CAPACITY=10;
    public TestCollections(){
        elementData =new Object[DEFALT_CAPACITY];
    }
    public TestCollections(int capacity){
        elementData =new Object[capacity];
    }
    public void add(E element){
        if(size==elementData.length){
            Object[] new_array=new Object[elementData.length+(elementData.length>>1)];
            System.arraycopy(elementData,0,new_array,0,elementData.length);
            elementData=new_array;
        }
        elementData[size++]=element;
    }
    public E get(int index){
        checkRange(index);
        return (E)elementData[index];
    }
    public void remove(E element){
        for(int i=0;i<size;i++){
            if(element.equals(get(i))){
                remove(i);
            }
        }
    }
    public void remove(int index){
        System.arraycopy(elementData,index+1,elementData,index,elementData.length-index-1);
        elementData[size-1]=null;
        size--;
    }
    public void set(E element,int index){
        //索引判断[0,size)
        checkRange(index);
        elementData[index]=element;
    }
    public void checkRange(int index){
        if(index<0||index>size-1){
            throw new RuntimeException("索引不合法:"+index);
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0?true:false;
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        TestCollections s1 = new TestCollections();
        s1.add("aa");
        s1.add("bb");
        for(int i=0;i<10;i++){
            s1.add("gao"+i);
        }
//        s1.set("朱烨",90);
        s1.remove("gao9");
        System.out.println(s1.isEmpty());
        System.out.println(s1.toString());
    }
}
