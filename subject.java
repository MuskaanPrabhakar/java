import java.util.Scanner;
public class subject {
    public static void main(String[] args) {
        int sub; int s=0;
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.print("Enter marks of " + i + " subject: ");
            sub = sc.nextInt();
            s += sub;
        }
        s/=5;
        if(s>90 && s<101){
            System.out.println("Grade A");
        }
        else if(s>80 && s<91){
            System.out.println("Grade B");
        }
        else if(s>70 && s<81){
            System.out.println("Grade C");
        }
        else if(s>60 && s<71){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
