import java.lang.*;
import java.util.Arrays;
public class BinarySearch{
public static void main(String[] args){
int nums[] = {5,6,67,3,78,34,4,5,3};
int target = 34;

Arrays.sort(nums);
System.out.println("your sorted array : " +  Arrays.toString(nums));
int result = binarySearch(nums,target);
if(result != -1){
System.out.println("your search number is on index : " + result +"  your value is " + target);
}
 else System.out.println("you number is not found");



}

public  static int binarySearch(int[] nums,int target){
int steps =  0;
int left = 0;
int right = nums.length-1;
while(left <= right){
steps ++;
int mid = (left + right)/2;
if(nums[mid] == target){
System.out.println("steps in binary " + steps);
return mid;
}
else if(nums[mid] < target){
left = mid + 1;
}
else right = mid - 1;
}
return -1;






}

}