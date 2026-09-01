import java.util.Scanner; 

public class selection_sort {

  public static void main(String[] args) {
    int x; int pos; int temp;
    Scanner obj = new Scanner(System.in);
    int[] nums = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.println("Enter at index "+ i);
      nums[i] = obj.nextInt();
    }
    for (int i = 0; i < 10; i++) {
      x=nums[i];
      pos=i;
      for(int j = i+1; j < 10; j++){
        if(x>nums[j]){
            x=nums[j];
            pos=j;
        }
      }
      temp=nums[i];
      nums[i]=x;
      nums[pos]=temp;
    }
    System.out.println("Sorted array:-");
    for (int i = 0; i < 10; i++) {
      System.out.print(nums[i]+", ");
    }
  }
}
