public class Crypto {

    static protected String Cesar(String testo, int shift) {
        StringBuilder output = new StringBuilder(testo.length());
        for (char singleChar : testo.toCharArray()) {
            int shiftedChar = (int) (singleChar + shift) % 256;
            output.append((char) shiftedChar);
        }
        return output.toString();
    }

    static protected String xorAlgo(String data, String key) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            char inputChar=data.charAt(i);
            char keyChar=key.charAt(i % key.length());

            char encryptedChar=(char) (inputChar ^ keyChar);

            result.append(encryptedChar);
        }

        return result.toString();
    }
}