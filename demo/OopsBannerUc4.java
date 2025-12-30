public class OopsBannerUc4 {
   
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

       
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the banner character
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern
         *
         * @return String array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }
     /**
     * Creates pattern object for letter O
     */
    public static CharacterPatternMap createOPattern() {
        return new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });
    }

    
    public static CharacterPatternMap createPPattern() {
        return new CharacterPatternMap('P', new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        });
    }

    public static CharacterPatternMap createSPattern() {
        return new CharacterPatternMap('S', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });
    }

    
    public static void printMessage(CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            String line = "";
            for (CharacterPatternMap pattern : patterns) {
                line += pattern.getPattern()[row] + "   ";
            }
            System.out.println(line);
        }
    }
       public static void main(String[] args) {

        // Create character pattern objects
        CharacterPatternMap o1 = createOPattern();
        CharacterPatternMap o2 = createOPattern();
        CharacterPatternMap p  = createPPattern();
        CharacterPatternMap s  = createSPattern();

        // Store patterns in array of objects
        CharacterPatternMap[] bannerPatterns = { o1, o2, p, s };

        // Render the banner
        printMessage(bannerPatterns);
    }
}
