package practice;

 import java.util.HashMap;
 import java.util.Map;
 import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String input = sc.nextLine();
        boolean isPangram = isPangram(input.toLowerCase());

        if (!isPangram) {
            System.out.println("Not a pangram");
        } else {
            System.out.println("pangram");
        }
    }

    public static boolean isPangram(String input) {
        Map<Character, Boolean> alphabetMap = new HashMap<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabetMap.put(c, false);
        }

        for (char ch : input.toCharArray()) {
            if (alphabetMap.containsKey(ch)) {
                alphabetMap.put(ch, true);
            }
        }

        return !alphabetMap.containsValue(false);
    }
}

