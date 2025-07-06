public class Queue {
    int Queue[] = new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data){
       
     Queue[rear] = data;
     rear = (rear + 1)%5;
     size = size + 1;
        
       

      }
      public void show(){
        System.out.print(" Elements : " );
        for(int i =0;i<size; i++){
            System.out.print(Queue[(front+i)%5] + " : ");

        }
        System.out.println();
        for(int n : Queue){
            System.out.print(n + " :");
        }
      }
      public int deQueue(){
        int data = Queue[front];
        front  = (front+1)%5;
        size = size -1;


        return data;
      }
      public int getSize(){
        return size;
      }
      public boolean isEmpty(){
        return  size==0;
      }
      public boolean isFull(){
        return size==5;
      }

}
