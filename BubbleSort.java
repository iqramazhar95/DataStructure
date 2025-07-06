public class BubbleSort {

    public static void main(String[] args) {
        int nums[] = {6,5,8,9,4};
        int size = nums.length;
        int tep = 0;
        System.out.println("before sorting ");
        for(int num:nums){
            System.out.print(num + "  ");
        }

        for(int i = 0; i<size;i++){
            for(int j=0; j<size-i-1; j++){
                if(nums[j] > nums[j+1]){
                    tep = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tep;
                }

                System.out.println();
                for(int num :nums){
                    System.out.print(num + "    ");
                }
            }
        }
        System.out.print("after sorting ");
        for(int num:nums){
            System.out.print(num + "   ");
        }
    }
}