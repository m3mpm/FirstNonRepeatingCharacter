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

        String str = "My high school, the Illinois Mathematics and Science Academy, "
                + "showed me that anything is possible and that you're never too young to think big. "
                + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
                + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
                + "computer science.";

        startTime1 = System.nanoTime();
        char ch1 = solution.firstNonRepeatedCharacter1(str);
        startTime2 = System.nanoTime();
        displayExecutionTime(startTime2 - startTime1);
        System.out.println(ch1);

        startTime1 = System.nanoTime();
        char ch2 = solution.firstNonRepeatedCharacter2(str);
        startTime2 = System.nanoTime();
        displayExecutionTime(startTime2 - startTime1);
        System.out.println(ch2);
    }

}
