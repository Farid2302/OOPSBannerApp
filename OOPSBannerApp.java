import java.util.HashMap;
import java.util.Map;

public class BannerUC8 {
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        displayBanner("OOPS", patternMap);
    }

    public static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();
        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });
        map.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });
        map.put('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        });
        return map;
    }

    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < message.length(); col++) {
                char ch = message.charAt(col);
                if (patternMap.containsKey(ch)) {
                    sb.append(patternMap.get(ch)[row]).append("   ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
