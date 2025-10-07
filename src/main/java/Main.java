import java.util.concurrent.TimeUnit;

public class Main {

    private static void displayExecutionTime (long time) {
        System.out.println("Время выполнения: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }



    public static void main(String[] args) {

        long startTime1;
        long startTime2;

        Solution solution = new Solution();

        String str1 = "swiss";
        String str2 = "😍 💕 I Ӝ love you Ӝ so much 😍";

        startTime1 = System.nanoTime();
        char ch1 = solution.firstNonRepeatedCharacter1(str1);
        startTime2 = System.nanoTime();
        displayExecutionTime(startTime2 - startTime1);
        System.out.println(ch1);

        startTime1 = System.nanoTime();
        char ch2 = solution.firstNonRepeatedCharacter2(str1);
        startTime2 = System.nanoTime();
        displayExecutionTime(startTime2 - startTime1);
        System.out.println(ch2);

        startTime1 = System.nanoTime();
        String ch3 = solution.firstNonRepeatedCharacter3(str2);
        startTime2 = System.nanoTime();
        displayExecutionTime(startTime2 - startTime1);
        System.out.println(ch3);

    }

}
