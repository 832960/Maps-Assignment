import java.util.ArrayList;

public class Cipher {

    private final String cipheredText;

    Cipher(ArrayList<Integer> code) {

        StringBuilder cipherBuilder = new StringBuilder();
        for (int i = 0; i < code.size(); i++) {

            if (code.get(i) >= 0) {

                String cipher = "vwxyzabcdefghijklmnopqrstu";
                cipherBuilder.append(cipher.charAt(code.get(i)));

            }

            else {

                cipherBuilder.append(" ");

            }

        }

        cipheredText = cipherBuilder.toString();

    }

    public String getCipheredText() {

        return cipheredText;

    }

}
