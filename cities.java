import java.util.Scanner; // Added import for Scanner

public class cities {

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String[] cities = new String[10];
    int[] std = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.println("Enter city name: ");
      cities[i] = obj.next();
      System.out.println("Enter its std code: ");
      std[i] = obj.nextInt();
    }

    System.out.println("Enter city name to be searched:");
    String city = obj.next();
    boolean flag = false;

    for (int i = 0; i < 10; i++) {
      if (cities[i].equalsIgnoreCase(city)) { 
        System.out.println("CITY FOUND");
        System.out.println("CITY: " + cities[i]);
        System.out.println("STD code: " + std[i]);
        flag = true;
        break;
      }
    }

    if (!flag) {
      System.out.println("CITY NOT FOUND");
    }
  }
}
