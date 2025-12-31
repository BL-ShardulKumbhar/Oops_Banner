public class OopsBannerUc3 {
    public static void main(String[] args) {

        // Get banner patterns using helper methods
        String[] letterO = getOPattern();
        String[] letterP = getPPattern();
        String[] letterS = getSPattern();

        // Print the banner using a reusable method
        printBanner(letterO, letterO, letterP, letterS);
    }

    /**
     * Returns banner pattern for letter O
     */
    public static String[] getOPattern() {
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
     * Returns banner pattern for letter P
     */
    public static String[] getPPattern() {
        return new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    /**
     * Returns banner pattern for letter S
     */
    public static String[] getSPattern() {
        return new String[]{
                "******** ",
                "*        ",
                "*        ",
                "******** ",
                "       * ",
                "       * ",
                "******** "
        };
    }

    /**
     * Prints the OOPS banner line by line
     */
    public static void printBanner(String[] o1, String[] o2, String[] p, String[] s) {

        for (int i = 0; i < 7; i++) {
            String line = o1[i] + "   " + o2[i] + "   " + p[i] + "   " + s[i];
            System.out.println(line);
        }
    }
}
