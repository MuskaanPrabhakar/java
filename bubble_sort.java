import java.util.Scanner; 

public class bubble_sort {

  public static void main(String[] args) {
    int temp;
    Scanner obj = new Scanner(System.in);
    int[] nums = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.println("Enter at index "+ i);
      nums[i] = obj.nextInt();
    }
    for (int i = 0; i < 10; i++) {
      for(int j = 0; j < 10-i-1; j++){
        if(nums[j]>nums[j+1]){
            temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
        }
      }
    }
    System.out.println("Sorted array:-");
    for (int i = 0; i < 10; i++) {
      System.out.print(nums[i]+", ");
    }
  }
}
