import java.util.Arrays;
import java.util.stream.Collectors;

public class E_5848565e273af816fb000449 {
    public class Kata {
        public static String encryptThis(String text) {
            if (text == null || text.length() == 0) {
                return "";
            }
            return Arrays.stream(text.split(" "))
                .map(stringPart -> {
                    final StringBuilder sb = new StringBuilder();
                    sb.append((int) (stringPart.charAt(0)));

                    if (stringPart.length() > 1) {
                        sb.append(stringPart.charAt(stringPart.length() - 1));
                    }

                    if (stringPart.length() > 2) {
                        sb.append(stringPart, 2, stringPart.length() - 1);
                        sb.append(stringPart.charAt(1));
                    }

                    return sb.toString();
                })
                .collect(Collectors.joining(" "));
        }
    }

    public static void main(String[] args) {
        System.out.println(Kata.encryptThis("A wise old owl lived in an oak"));
    }
}
