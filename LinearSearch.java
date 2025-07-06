
public class LinearSearch{
public static void main(String[] args){
int nums[]=  {3,34,56,2,6};
int target = 90;
int res = linearSearch(nums,target);
System.out.println("result : " + res);
if(res != -1){
System.out.println("you searching  number is on : " + res);
} else{
System.out.println("you data is not found");
}
 
}

public static int linearSearch(int nums[], int target){
int steps = 0;
for(int i=0;i<nums.length;i++){
steps++;
if(nums[i] == target)
              return nums[i];
System.out.println( "how many sstep taken by lineary search : "+steps);
} 
return -1;

}
}


