import java.util.ArrayList;

public class CoolNumbers {
    public static void main(String[] args) {

    }

    public static ArrayList<String> generateCoolNumbers() {
        ArrayList<String> listCoolNumbers = new ArrayList<>();

        for (int i = 0; i < 2_000_000; i++) {
            String letters = "А, В, Е, К, М, Н, О, Р, С, Т, У, Х";
            String[] arrayLetters = letters.split(", ");

            int indexRandomLetters = (int) (Math.random() * 12);
            String randomLetters = arrayLetters[indexRandomLetters];

            int randomNumber = (int) (Math.random() * 10);
        }


        return listCoolNumbers;
    }
}
