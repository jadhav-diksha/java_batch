public class StringTool {

    String sentence = "Java programming is fun";

    class Analyzer {

        int countVowels() {
            int count = 0;
            String v = "aeiouAEIOU";
            for (char c : sentence.toCharArray()) {
                if (v.indexOf(c) != -1)
                    count++;
            }
            return count;
        }

        int countWords() {
            return sentence.split(" ").length;
        }

        String reverse() {
            return new StringBuilder(sentence).reverse().toString();
        }
    }

    public static void main(String[] args) {

        StringTool obj = new StringTool();
        Analyzer a = obj.new Analyzer();

        System.out.println("Vowel Count: " + a.countVowels());
        System.out.println("Word Count: " + a.countWords());
        System.out.println("Reversed String: " + a.reverse());
    }
}
 

