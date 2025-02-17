import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class printNamePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, String[]> letterPatterns = new HashMap<>();

        letterPatterns.put('A', new String[]{
                "  *  ",
                " * * ",
                "*****",
                "*   *",
                "*   *"
        });
        letterPatterns.put('B', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*   *",
                "**** "
        });
        letterPatterns.put('C', new String[]{
                " ****",
                "*    ",
                "*    ",
                "*    ",
                " ****"
        });
        letterPatterns.put('D', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "*   *",
                "**** "
        });
        letterPatterns.put('E', new String[]{
                "*****",
                "*    ",
                "**** ",
                "*    ",
                "*****"
        });
        letterPatterns.put('F', new String[]{
                "*****",
                "*    ",
                "**** ",
                "*    ",
                "*    "
        });
        letterPatterns.put('G', new String[]{
                " ****",
                "*    ",
                "*  **",
                "*   *",
                " ****"
        });
        letterPatterns.put('H', new String[]{
                "*   *",
                "*   *",
                "*****",
                "*   *",
                "*   *"
        });
        letterPatterns.put('I', new String[]{
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "*****"
        });
        letterPatterns.put('J', new String[]{
                "*****",
                "    *",
                "    *",
                "*   *",
                " ****"
        });
        letterPatterns.put('K', new String[]{
                "*   *",
                "*  * ",
                "**   ",
                "*  * ",
                "*   *"
        });
        letterPatterns.put('L', new String[]{
                "*    ",
                "*    ",
                "*    ",
                "*    ",
                "*****"
        });
        letterPatterns.put('M', new String[]{
                "*   *",
                "** **",
                "* * *",
                "*   *",
                "*   *"
        });
        letterPatterns.put('N', new String[]{
                "*   *",
                "**  *",
                "* * *",
                "*  **",
                "*   *"
        });
        letterPatterns.put('O', new String[]{
                " ****",
                "*   *",
                "*   *",
                "*   *",
                " ****"
        });
        letterPatterns.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        letterPatterns.put('Q', new String[]{
                " ****",
                "*   *",
                "*   *",
                "*  **",
                " ****"
        });
        letterPatterns.put('R', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*  * ",
                "*   *"
        });
        letterPatterns.put('S', new String[]{
                " ****",
                "*    ",
                " ****",
                "    *",
                " ****"
        });
        letterPatterns.put('T', new String[]{
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        });
        letterPatterns.put('U', new String[]{
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " ****"
        });
        letterPatterns.put('V', new String[]{
                "*   *",
                "*   *",
                "*   *",
                " * * ",
                "  *  "
        });
        letterPatterns.put('W', new String[]{
                "*   *",
                "*   *",
                "*   *",
                "* * *",
                "** **"
        });
        letterPatterns.put('X', new String[]{
                "*   *",
                " * * ",
                "  *  ",
                " * * ",
                "*   *"
        });
        letterPatterns.put('Y', new String[]{
                "*   *",
                " * * ",
                "  *  ",
                "  *  ",
                "  *  "
        });
        letterPatterns.put('Z', new String[]{
                "*****",
                "   * ",
                "  *  ",
                " *   ",
                "*****"
        });

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter != ' ') {
                letter = Character.toUpperCase(letter);
                if (letterPatterns.containsKey(letter)) {
                    String[] pattern = letterPatterns.get(letter);
                    for (String line : pattern) {
                        System.out.println(line);
                    }
                } else {
                    System.out.println("Letter not supported.");
                }
                System.out.println();
            } else {
                System.out.println();
            }
        }

        scanner.close();
    }
}
