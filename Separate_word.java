import java.util.Scanner;
class Separate_word
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str= kb.nextLine();
        str= str.trim();
        str= str.toUpperCase();
        for(int i=0; i<str.length(); i++){
            if(i!=0 && str.charAt(i)==' ' && str.charAt(i-1)!=' '){
                System.out.println();
                continue;   
            }
            else if(i!=0 && str.charAt(i)==' ' && str.charAt(i-1)==' ') continue;
            System.out.print(str.charAt(i));
        }
    }
}
