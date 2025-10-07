import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String str1 = "swiss";
        String str2 = "😍 💕 I Ӝ love you Ӝ so much 😍";

        long startTime1 = System.nanoTime();
        char ch1 = solution.firstNonRepeatedCharacter1(str1);
        long stopTime1= System.nanoTime();
        displayExecutionTime(stopTime1 - startTime1);
        System.out.println(ch1);

        long startTime2 = System.nanoTime();
        char ch2 = solution.firstNonRepeatedCharacter2(str1);
        long stopTime2 = System.nanoTime();
        displayExecutionTime(stopTime2 - startTime2);
        System.out.println(ch2);

        long startTime3 = System.nanoTime();
        String ch3 = solution.firstNonRepeatedCharacter3(str2);
        long stopTime3 = System.nanoTime();
        displayExecutionTime(stopTime3 - startTime3);
        System.out.println(ch3);

        long startTime4 = System.nanoTime();
        String ch4 = solution.firstNonRepeatedCharacter4(str2);
        long stopTime4 = System.nanoTime();
        displayExecutionTime(stopTime4 - startTime4);
        System.out.println(ch4);

    }

    private static void displayExecutionTime (long time) {
        System.out.println("Время выполнения: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }

}
