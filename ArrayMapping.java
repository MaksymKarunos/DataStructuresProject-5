public class ArrayMapping {
    // Container of node
    private int[] myArr;

    private int size;
    
    private int currentSize;

    public ArrayMapping(int size){
        this.size = size;
        myArr = new int[size];
    }
    
    int getSize(){
        return size;
    }
    void insert(int element){
        if ( currentSize >= size){
            return;
        }
        myArr[currentSize] = element;
        currentSize++;
        return;
    }
    void remove(int inedx){
        
    }
}