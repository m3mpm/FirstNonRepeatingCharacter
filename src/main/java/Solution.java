import javax.print.ServiceUI;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    public Solution() {
    }

    public char firstNonRepeatedCharacter1(String str){

        if(str == null || str.length() == 0){
            return Character.MIN_VALUE;
        }

        Map<Character, Integer> chars = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            chars.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }

        for(Map.Entry<Character, Integer> entry : chars.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    public char firstNonRepeatedCharacter2(String str) {

        if (str == null || str.isBlank()) {
            return Character.MIN_VALUE;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }
}
