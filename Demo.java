public class Demo{
    public static void main(String[] args) {
        int nums[] =  {3,5,3,3,67,34};
        int target = 67;
        int result = LinearSearch(nums,target);
        
        if(result != -1)
        System.out.println("Element found at index : " + result);
        else
          System.out.println("element not found ");
    }

    public  static int LinearSearch(int[] nums,int target) {
        int steps = 0;
        for(int i = 0; i<nums.length;i++){
            steps ++;
            if(nums[i] ==target)
            return i;
            System.out.println("steps takent by leanery search : " + steps);
        }
      return -1;
        
    }
    public  static int BinarySearch(int[] nums,int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            steps++;
            int mid = (left + right)/2;
            if(nums[mid]== target){
                     System.out.println("steps in binary search :  " + steps );
               
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else right = mid - 1;
           
            
        }
         System.out.println("steps in binary search :  " + steps );
      return -1;
        
    }
}