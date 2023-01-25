package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        System.out.println((int)(number / 1000) + (int) (number % 10) +  (int) (number / 10 % 10) +  (int)(number / 100 % 10));
    }
}
