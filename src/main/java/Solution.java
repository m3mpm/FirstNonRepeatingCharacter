import javax.print.ServiceUI;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public Solution() {
    }

    // Версия, которая работает с UTF-16
    public char firstNonRepeatedCharacter1(String str) {

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

    public char firstNonRepeatedCharacter2(String str){

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

    // Версия, которая работает с Unicode, с UTF-32
    public String firstNonRepeatedCharacter3(String str) {
        if (str == null || str.isBlank()) {
            return String.valueOf(Character.MIN_VALUE);
        }

        Map<String, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i); // кодовая точка
            String ch = String.valueOf(Character.toChars(cp)); //получение символа из кодовой точки
            if (Character.charCount(cp) == 2) { // 2 означает суррогатную пару
                i++;
            }
            chars.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }

        for (Map.Entry<String, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return String.valueOf(Character.MIN_VALUE);
    }


    public String firstNonRepeatedCharacter4(String str) {
        if (str == null || str.isBlank()) {
            return String.valueOf(Character.MIN_VALUE);
        }

        Map<Integer, Long> chars = str.codePoints().
                boxed().
                collect(Collectors.groupingBy(cp -> cp,
                        LinkedHashMap::new, Collectors.counting()));

        int cp = chars.entrySet().stream().
                filter(e -> e.getValue() == 1L).
                findFirst().
                map(Map.Entry::getKey).
                orElse((int) Character.MIN_VALUE);


        return String.valueOf(Character.toChars(cp));

    }
}
