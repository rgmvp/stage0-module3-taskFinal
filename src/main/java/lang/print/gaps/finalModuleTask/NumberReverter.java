package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        System.out.println("" + (int) (number % 10) + "" + (int) (number % 100 / 10) + "" + (int)(number / 100));
    }
}
