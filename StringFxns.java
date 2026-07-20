public class StringFxns {
    //class started with overload void Joystring function
    public void Joystring(String s, char ch1, char ch2){
        //function in which string s replaces char ch1 with char ch2
        s= s.replace(ch1, ch2);
        System.out.println("Output: " + s);
    }
    public void Joystring(String s){
        //function in which we print the first position of the first space and last space of string s
        System.out.println("First index : " + s.indexOf(" "));
        System.out.println("Last index : "+ s.lastIndexOf(" "));
    }
    public void Joystring(String s1, String s2){
        //function in which we combine two string arguements with space between them
        System.out.println("Output: "+ (s1.concat(" ").concat(s2)));
    }
    public static void main(String[] args) {
        // 1. Create an object of your class (replaces BlueJ's "Create Instance")
        StringFxns obj = new StringFxns();

        // 2. Call the methods on the object (replaces right-clicking in BlueJ)
        System.out.println("--- Method 1 Demo ---");
        obj.Joystring("TECHNOLOGY", 'a', 'O');

        System.out.println("\n--- Method 2 Demo ---");
        obj.Joystring("Cloud computing means Internet based computing");

        System.out.println("\n--- Method 3 Demo ---");
        obj.Joystring("Common Wealth", "Games");
    }
}
