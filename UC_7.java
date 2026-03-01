public class UC_7 {

    public static void main(String[] args) {
        String text = "OOPS";
        System.out.println(CharacterPatternMap.getBanner(text));
    }

    // Outer class representing a Character Pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Static Inner Class to manage character-pattern mapping
    static class CharacterPatternMap {

        private static java.util.Map<Character, CharacterPattern> patternMap =
                new java.util.HashMap<>();

        // Static block to initialize patterns
        static {
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    "  ***  ",
                    " *   * ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " *   * ",
                    "  ***  "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "*****  ",
                    "*    * ",
                    "*    * ",
                    "*****  ",
                    "*      ",
                    "*      ",
                    "*      "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            }));
        }

        // Method to generate horizontal banner
        public static String getBanner(String text) {

            StringBuilder[] rows = new StringBuilder[7];

            for (int i = 0; i < 7; i++) {
                rows[i] = new StringBuilder();
            }

            for (char ch : text.toCharArray()) {
                CharacterPattern cp = patternMap.get(Character.toUpperCase(ch));

                if (cp != null) {
                    String[] pattern = cp.getPattern();
                    for (int i = 0; i < pattern.length; i++) {
                        rows[i].append(pattern[i]).append("  ");
                    }
                }
            }

            StringBuilder finalBanner = new StringBuilder();
            for (StringBuilder row : rows) {
                finalBanner.append(row).append("\n");
            }

            return finalBanner.toString();
        }
    }
}