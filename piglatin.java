public class piglatin {// class started
    public void display(String word){//method started
        String result="";
        word= word.toUpperCase();
        int first_vowel_at = word.length();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'A' ||ch == 'E' ||ch == 'I' || ch == 'O' || ch == 'U'){
                first_vowel_at=i;
                System.out.println("Word in Piglatin: "+ word.substring(first_vowel_at ,word.length()) + result + "AY");
                break;
            } 
            else result += ch;
        }
        if(first_vowel_at==word.length()) System.out.println("Word in Piglatin: " + result + "AY");
    }
    public static void main(String[] args) {
        piglatin obj = new piglatin();
        obj.display("London");
    }
}
