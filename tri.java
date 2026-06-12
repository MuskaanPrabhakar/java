/*Floyd's triangle
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15  */
public class tri {
    public static void main(String[] args) {
        int n=1;
        for(int i=1; i<6; i++){
            for(int k=0; k<i; k++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}