
class BubbleTest{
public static void main(String[] args) {
        int array[] = {7,6,0,3,2,1};
        int temp = 0;
int size = array.length-1;
        System.out.println("before Sortig");
        for(int n: array){
            System.out.print(n + "  ");
        }
        System.out.println();
for(int i = 0;i<size;i++){
for(int j = 0 ; j<size-i;j++){
if(array[j]>array[j+1]){
temp = array[j];
array[j]=array[j+1];
array[j+1] = temp;
}
}

}
        





        System.out.println("\nafter sorting");
        for(int n : array){
            System.out.print(n + "  ");
        }


 
 }


}
