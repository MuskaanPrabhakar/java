import java.util.Scanner; 

public class duplicacy {

  public static void main(String[] args) {
    int temp;
    Scanner obj = new Scanner(System.in);
    int[] nums = new int[10];
    int n=10;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter at index "+ i);
      nums[i] = obj.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for(int j = i+1; j < n; j++){
        if(nums[i]==nums[j]){
            temp=nums[n-1];
            nums[n-1]=nums[j];
            nums[j]=temp;
            n=n-1;
            j--;
        }
      }
    }
    System.out.println("array without duplicacy is:-");
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i]+", ");
    }
  }
}
