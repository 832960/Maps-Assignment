import java.util.ArrayList;

public class Alphabet {

    private final ArrayList<Integer> code = new ArrayList<>();

    Alphabet(String text) {

        for (int i = 0; i < text.length(); i++) {

            code.add(getValue(text.toLowerCase().charAt(i)));

        }

    }

    public int getValue(char ch) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {

            if (ch == alphabet.charAt(i)) {

                return i;

            }

        }

        return -1;

    }

    public ArrayList<Integer> getCode() {

        return code;

    }

}
