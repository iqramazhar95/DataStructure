public class RunnerQuea {
    public static void main(String[] args) {
        Queue qu = new Queue();
        
        qu.enQueue(11);
        
        

       // qu.enQueue(45);
        
         System.out.println(" Size : "+qu.getSize());
         System.out.println("  is empty : "+ qu.isEmpty()) ;
         System.out.println("is full : " + qu.isFull());
        qu.show();
    }

}
