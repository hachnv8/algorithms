

/**
 * Created by HachNV on 16/05/2023
 */
public class main {
    public static void main(String[] args) {
        int [] nums ={5,2,3,2,7,8,1,2};
//        bubbleSort(nums);
        selectionSort(nums);
//        insertionSort(nums);
    }

    private static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i <n; i++) {
            int ai = nums[i];
            int j = i -1;
            while (j>=0 && nums[j]> ai){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = ai;
            print(i,nums);
        }
    }

    private static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <n-1 ; i++) {
            int minIndex =i;
            for (int j = i+1; j <n ; j++) {
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] =temp;
            }
            print(i,nums);
        }
    }

    private static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <n ; i++) {
            boolean flag = true;
            for (int j = 0; j <n-1-i ; j++) {
                if(nums[j] > nums[j+1]){
                    flag =false;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if(flag){
                break;
            }
            print(i,nums);

        }
    }

    public static void print(int n ,int[] nums){
        System.out.println();
        System.out.print(n + ": ");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
