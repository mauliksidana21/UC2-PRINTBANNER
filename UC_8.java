import java.util.HashMap;
import java.util.Map;

public class UC_8 {

    // Map to store character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static block to initialize character patterns
    static {
        patternMap.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        patternMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }

    // Function to render banner
    public static void renderBanner(String text) {

        int height = 7; // Number of rows in each character

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {

                String[] pattern = patternMap.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}
