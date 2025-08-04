public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Methods to add and remove elements in the linkedlist
    
    //Add method
    //add First  O(1);
    public void addFirst(int data){ // now we don't need to write static, because if we have to call some fnx from main fnx then we have to add static keyword, but as now we are going to call this method using LinkedList method or using ll.addfirst() something like that, so it is not compulsary to write static keyword
    size++;
    //step1 = create new Node
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    //step2 - newNode next = head
    newNode.next = head;

    //step3 - head = newNode
    head = newNode;
    }

    //add Last O(1)
    public void addLast(int data){
        size++;
        //step1 = create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 - tail next = newNode
        tail.next = newNode;

        //step3 - tail = newNode
        tail = newNode;
    }

    //print the linkedlist 
    public void print(){ //O(n)
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add in the middle
    // add(index,data) O(n)
    public void addMiddle(int index, int data){
        // what if, index == 0, that means we are adding element in starting, so that time we will call addFirst fnx, so that we will not loose track of head and tail, because these two nodes are very important
        if(index == 0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        // when i = index -1, means temp is at place before adding newNode
        newNode.next = temp.next;
        temp.next = newNode;
    }

//Remove Operations

    public static void main(String[] args) {
     LinkedList ll = new LinkedList();
     ll.addFirst(2);
     ll.addFirst(1);
     ll.addLast(3);
     ll.addLast(4);
     ll.addMiddle(2, 5);
     ll.print();
     System.out.println(size +" ");
    }
}
