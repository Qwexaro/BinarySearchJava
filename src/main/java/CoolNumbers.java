import java.util.ArrayList;

public class CoolNumbers {
    public static void main(String[] args) {
        System.out.println(generateCoolNumbers());
    }

    public static ArrayList<String> generateCoolNumbers() {
        ArrayList<String> listCoolNumbers = new ArrayList<>();

        for (int i = 0; i < 2_000_000; i++) {
            String letters = "А, В, Е, К, М, Н, О, Р, С, Т, У, Х";
            String[] arrayLetters = letters.split(", ");

            int indexRandomLetters = (int) (Math.random() * 12);
            String randomLetters = arrayLetters[indexRandomLetters];

            int randomNumber = (int) (Math.random() * 10);

            int indexRandomLetters2 = (int) (Math.random() * 12);
            String randomLetters2 = arrayLetters[indexRandomLetters2];

            int indexRandomLetters3 = (int) (Math.random() * 12);
            String randomLetters3 = arrayLetters[indexRandomLetters3];

            int randomRegion = 1 + (int) (Math.random() * 199);

            String randomAutoNumber = randomLetters + randomNumber + randomNumber + randomNumber
                    + randomLetters2 + randomLetters3 + randomRegion;
            listCoolNumbers.add(randomAutoNumber);
        }


        return listCoolNumbers;
    }
}
