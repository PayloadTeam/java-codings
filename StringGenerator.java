public class StringGenerator {
    public static String generate(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + (int) (Math.random() * 26)));
        }
        return sb.toString();
    }
}