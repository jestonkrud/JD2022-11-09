package panteleev.jd01_03;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someString = scanner.nextLine();
        double[] array = InOut.getArray(someString);
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        double min = Helper.findMin(array);
        System.out.println(min);
        double max = Helper.findMax(array);
        System.out.println(max);
        System.out.println(Arrays.toString(Helper.sort(array)));
    }
}
