import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String stroke = "pwwkew";
        LonSubstring ob = new LonSubstring(stroke);
        System.out.println(ob.longestSubstring(stroke));
    }

}

class LonSubstring {
    String stroke;
    int maxSymbols = 0;

    LonSubstring(String stroke) {
        this.stroke = stroke;
    }

    public int longestSubstring(String stroke) {

      

        for (int i = 0; i < stroke.length(); i++) {

            StringBuilder buffer = new StringBuilder();

            for (int j = i; j < stroke.length(); j++) {
                char c=stroke.charAt(j);
                if (buffer.indexOf(String.valueOf(c)) != -1) {
                    break;
                }
                buffer.append(c);
                maxSymbols = Math.max(maxSymbols, buffer.length());
            }
        }

        return maxSymbols;

    }
}