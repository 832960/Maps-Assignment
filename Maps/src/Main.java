import java.util.HashMap;

public class Main {

    public static String cipher(HashMap<Letter, Letter> caesarCipher, String text) {

        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {

                cipherText.append(' ');

            }

            else if (Character.toUpperCase(text.charAt(i)) == text.charAt(i)) {

                cipherText.append(Character.toUpperCase(caesarCipher.get(
                        new Letter(Character.toLowerCase(text.charAt(i)))).letter));

            }

            else {

                cipherText.append(caesarCipher.get(new Letter(Character.toLowerCase(text.charAt(i)))));

            }

        }

        return cipherText.toString();

    }

    public static void main(String[] args) {

        String text = "Hello World";
        int shift = -1;

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Letter, Letter> caesarCipher = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {

            while (shift < 0) {

                shift += 26;

            }

            caesarCipher.put(new Letter(alphabet.charAt(i)), new Letter(alphabet.charAt((i + shift) % 26)));

        }

        String cipherText = cipher(caesarCipher, text);
        System.out.println(text);
        System.out.println(cipherText);

    }

}
