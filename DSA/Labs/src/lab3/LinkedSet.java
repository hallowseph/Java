package lab3;

/**
 *
 * @author xxg8089
 */
public class LinkedSet<E extends Comparable> {
    SetNode head;
    int size;
    
    public LinkedSet()
    {
        head = null;
        size = 0;
    }
    
    
    public void add(E data)
    {
        SetNode<E> newNode = new SetNode();
        newNode.data = data;
        if(size == 0){
            head = newNode;
            size = 1;
        }
        else{
            if(!contains(data)){
                SetNode currentNode =head;
                for(; currentNode.next != null; currentNode = currentNode.next);
                currentNode.next = newNode;
                size++;
            }
        }
    }
    
    public boolean contains(E data)
    {
        
    }
    
    public String toStringReversely()
    {
        return toStringReversely(SetNode head);
    }
    
    private String toStringReversely(SetNode head)
    {
        
    }
    
    public String toString()
    {
        
    }
    
    public class SetNode <E extends Comparable> implements Comparable <SetNode>{
        public E data;
        public SetNode <E> next;
        
        @Override
        public int compareTo(SetNode Enode){
            return this.data.compareTo(Enode.data);
        }
    }
   
}
