import java.util.*;

public class FirstNonRepeating {
    public static void main(String args[]) {
        String s = "aabbcdd"; // Input string
        findFirstNonRepeating(s);
    }

    public static void findFirstNonRepeating(String s) {
        HashMap<Character,Integer> freqmap=new HashMap<>();
        for(char ch:s.toCharArray()){
            freqmap.put(ch,freqmap.getorDefault(ch,0)+1)
        }
        System.out.print(-1);
    }
}
