package practice;
import java.sql.SQLOutput;
import java.util.*;
public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
        int prev = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = hs.get(s.charAt(i));
            if (val < prev) {
                ans = ans - val;
            } else {
                ans += val;
                prev = val;
            }
        }
        return ans;
    }

        public static  void main(String args[]){
            RomanToInteger classObj=new RomanToInteger();

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter roman string");
            String givenRoman=sc.nextLine();
            int answer=classObj.romanToInt(givenRoman);
            System.out.println(answer);


        }

    }
