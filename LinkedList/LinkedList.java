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
    //Remove first
    public int removeFirst(){
        if(size == 0){ // if there is no element
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){ // if there is only 1 element, then after removing both head and tail will be null
            int val = head.data;
            head = tail = null;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;
    }
    // Remove Last
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size - 2, prev node means just before node of deletetion node, 1->2->3->4->5-> null, in  this case prev node is 4, that's why size -2, because we are going to delete node 5 and also in for loop we are starting from 0, so it is size -2, if loop starts from 1, then it will be size -1
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; 
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
// Search(iterative) in LL
// search for a key in a LL. Return the position whereit is found. If not found, return -1
    public static int itrSearch(int key){ // iterative search
        int i = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){ // if data found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // if key not found
        return -1;
    }

//Search recursive  method
    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){ // agar key mil jayegi, to wo wala index khud ko head samjhega or uski position 0 samjhega
            return 0;
        }
        int idx = helper(head.next, key); // recrusive search krne ke liye bhej rahe hai, jab value found hogi to iske andar 0 store ho jayega, or phir iske andar +1 krte rahenge jab tak original head pe nahi aa jaate
        if(idx == -1){
            return -1;
        }

        return idx+1; // ab wo original head pe move karega, jab original head pe pahuch jayega to idx ki value count krke remove krdega, mtlb dekhega jo value found huyi hai wo original head se kitni dur thi, wahi idx hai.
    }
    public static int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
     LinkedList ll = new LinkedList();
     ll.addFirst(2);
     ll.addFirst(1);
     ll.addLast(4);
     ll.addLast(5);
     ll.addMiddle(2, 3);
    //  ll.print();
    //  ll.removeFirst();
    //  ll.print();
    //  ll.removeLast();
     ll.print();
    //  System.out.println(size +" ");
    // System.out.println(itrSearch(2));
    // System.out.println(recSearch(10));
    ll.reverse();
    ll.print();
    }
}
