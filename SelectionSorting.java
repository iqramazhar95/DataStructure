import java.lang.*;
import java.util.Arrays;
public class SelectionSorting{
public static void main(String[] args){
int arr[] = {5,2,8,6,1};
System.out.println("original array :" + Arrays.toString(arr));
selectionSort(arr);
System.out.println("Sorted array: "+ Arrays.toString(arr));


}
public static void selectionSort(int[] arr){
int n = arr.length;
for(int i = 0; i < n-1;i++){
int minIndex = i;
for(int j = i+1;j < n ; j++){
if(arr[j] < arr[minIndex]) {
minIndex = j;
}
}
if(minIndex != i) {
int temp = arr[i];
arr[i] = arr[minIndex];
arr[minIndex] = temp;


}
}
}

}