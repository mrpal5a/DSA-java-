public class CircularQueue{
    // for making normal queue into circular queue, we only have to update the front and rear updation condition
    //then it will become circular queue 
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        //isEmpty
        public  boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //isFull
        public boolean isFull(){
            return (rear + 1) % size == front;
        }
        //Add operation
        public  void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //adding first element
            if(isEmpty()){
                front = rear = 0;
            }else{
                rear = (rear + 1) % size;
            }
            arr[rear] = data;
        }

        //remove
        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            //if last element to remove
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }
            return result; 
        }
        //peek
        public  int peek(){
            if(isEmpty()){
               System.out.println("Queue is empty");
               return -1;
            }
            return arr[front];
        }

    }
    public static void main(String args[]){
        Queue q = new Queue(7);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
