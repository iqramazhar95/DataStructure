public class SelectionSortTest {
    public static void main(String[] args) {
        int array[]={5,6,23,2,1,15};
        int size = array.length-1;
        int temp=0;
        
        System.out.println("before sorting : ");
        for(int n : array){
            System.out.print(n + "  ");
        }
for(int i=0;i<size;i++){
            int  minindex =i;
           // System.out.println( "hy again : "+ minindex +"  hyn miniindex");

            for(int j=i+1; j<size+1;j++){
              //  System.out.println("value of j :"+ j + " j value" + j);
                if(array[minindex] > array[j])
                minindex = j;
               // System.out.println("minindes : " + minindex + " value j   :"+ j);

            }
            temp = array[minindex];
            array[minindex] = array[i];
            array[i] = temp;
            System.out.println();
            for(int num :array){
                System.out.print(num + "  ");
            }


        }


        System.out.println();
        System.out.println("after sorting : ");
        for(int n : array){
            System.out.print(n + "  ");
        }

    }
}
