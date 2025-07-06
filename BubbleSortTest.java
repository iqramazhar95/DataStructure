public class BubbleSortTest {
    public static void main(String[] args) {
        int array[] = {5,6,6,3,2,1};
        int temp = 0;
        System.out.println("before Sortig");
        for(int n: array){
            System.out.print(n + "  ");
        }
        System.out.println();
        for(int i = 0;i<array.length-1;i++){
           // System.out.print(i +" outer loop  /// ");
            for(int j = 0; j<array.length-i-1;j++){
               // System.out.print(j + " inner loop");
               if (array[j] > array[j+1]) {
                temp = array[j];
                array[j]= array[j+1];
                array[j+1]= temp;

                
               }
            }
        }




        System.out.println("\nafter sorting");
        for(int n : array){
            System.out.print(n + "  ");
        }


 
 }
}
