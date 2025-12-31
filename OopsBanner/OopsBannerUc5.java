import java.util.HashMap;
import java.util.Map;

public class OopsBannerUc5 {
    
    public static Map<Character, String[]> createCharacterMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        patternMap.put('P', new String[]{
                "******   ",
                "*     *  ",
                "*     *  ",
                "******   ",
                "*        ",
                "*        ",
                "*        "
        });

        patternMap.put('S', new String[]{
                "******** ",
                "*        ",
                "*        ",
                "******** ",
                "       * ",
                "       * ",
                "******** "
        });

        return patternMap;
    }
    public static void displayBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int row = 0; row < height; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                lineBuilder.append(pattern[row]).append("   ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
        public static void main(String[] args) {

        // Build character pattern map
        Map<Character, String[]> patternMap = createCharacterMap();

        // Word to be displayed as banner
        String word = "OOPS";

        // Render the banner
        displayBanner(word, patternMap);
    }
}

