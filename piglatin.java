public class piglatin {// class started
    public void display(String word){//method started
        word= word.toUpperCase();
        int first_vowel_at = word.length();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("AEIOU".indexOf(ch)>=0){
                first_vowel_at=i;
                System.out.println("Word in Piglatin: "+ word.substring(first_vowel_at) + word.substring(0 ,first_vowel_at) + "AY");
                break;
            }
        }
        if(first_vowel_at==word.length()) System.out.println("Word in Piglatin: " + word + "AY");
    }
    public static void main(String[] args) {
        piglatin obj = new piglatin();
        obj.display("yasshita");
    }
}
