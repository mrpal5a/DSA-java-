public class QueueUsingLL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static Node tail = null;
    
    // emtpy Queue
    public boolean isEmpty(){
        return head == null && tail == null;
    }

    // add element in Queue
    public void add(int data){ //O(1)
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //remove 
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        // last element to remove
        if(head == tail){
            int lastelement = head.data;
            head = tail = null;
            return lastelement;
        }else{
            int el = head.data;
            head = head.next;
            return el;
        }
    }
    public int peek(){
        if(isEmpty())   {
            System.out.println("Queue is Empty");
            return 0;
        }else{
            return head.data;
        }
    }
    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}