import javax.print.ServiceUI;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    public Solution() {
    }

    public char firstNonRepeatedCharacter(String str){

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
}
