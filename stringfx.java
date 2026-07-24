public class stringfx {
    public void check(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a') result += 'e';
            else if (ch == 'A') result += 'E';
            else if (ch == 'e') result += 'i';
            else if (ch == 'E') result += 'I';
            else if (ch == 'i') result += 'o';
            else if (ch == 'I') result += 'O';
            else if (ch == 'o') result += 'u';
            else if (ch == 'O') result += 'U';
            else if (ch == 'u') result += 'a';
            else if (ch == 'U') result += 'A';
            else result += ch;
        }

        System.out.println("New string: " + result);
    }

    public static void main(String[] args) {
        stringfx obj = new stringfx();
        obj.check("my name is muskaan");
    }
}