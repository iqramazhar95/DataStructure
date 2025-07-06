public class SelectionSort {

    public static void main(String[] args) {
        int nums[] = {5,6,23,2,1,0};
        int size = nums.length;
        int temp = 0;
        int minindex = 0;

        System.out.println("before sorting ");
        for(int num : nums){
            System.out.print(num + "   ");
        }
        for(int i=0;i<size-1;i++){
            minindex =i;
            

            for(int j=i+1; j<size-1;j++){
                if(nums[minindex] > nums[j])
                minindex = j;

            }
            temp = nums[minindex];
            nums[minindex] = nums[i];
            nums[i] = temp;
            System.out.println();
            for(int num :nums){
                System.out.print(num + "  ");
            }


        }



System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num + "   ");
        }
    
    }
}