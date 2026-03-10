/**
 * UC7 - Banner Builder using Inner Static Class and OOPS Principles
 * Demonstrates Encapsulation, Modularity, Abstraction and Reusability
 */
public class BannerUC7 {
    public static void main(String[] args) {
        // Array of CharacterPatternMap objects - OOPS
        CharacterPatternMap[] patternMaps = {
                new CharacterPatternMap('O', buildOPattern()),
                new CharacterPatternMap('O', buildOPattern()),
                new CharacterPatternMap('P', buildPPattern()),
                new CharacterPatternMap('S', buildSPattern())
        };
        String[] banner = buildBanner(patternMaps);
        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Builds the complete banner row by row using StringBuilder
     *
     * @param patternMaps array of CharacterPatternMap objects
     * @return String array representing the full banner
     */
    public static String[] buildBanner(CharacterPatternMap[] patternMaps) {
        String[] banner = new String[7];
        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();
            for (CharacterPatternMap map : patternMaps) {
                sb.append(map.getPattern()[row]).append("   ");
            }
            banner[row] = sb.toString();
        }
        return banner;
    }

    /**
     * Builds 7x9 pattern for letter O
     *
     * @return String array representing O pattern
     */
    public static String[] buildOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    /**
     * Builds 7x9 pattern for letter P
     *
     * @return String array representing P pattern
     */
    public static String[] buildPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    /**
     * Builds 7x9 pattern for letter S
     *
     * @return String array representing S pattern
     */
    public static String[] buildSPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        };
    }

    /**
     * Inner Static Class to encapsulate Character and its Pattern
     * Demonstrates Encapsulation and Single Responsibility Principle
     */
    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         *
         * @param character the character represented
         * @param pattern   the 7x9 pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         *
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         *
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }
}
