

public class OopsBannerUc2 {
    public static void main(String[] args) {
         String[] letterO = {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };

        String[] letterP = {
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        };

        String[] letterS = {
                "******** ",
                "*        ",
                "*        ",
                "******** ",
                "       * ",
                "       * ",
                "******** "
        };

        for (int i = 0; i < 7; i++) {
            String line = String.join("   ",
                    letterO[i],
                    letterO[i],
                    letterP[i],
                    letterS[i]
            );
            System.out.println(line);
        }
        
    }
}
