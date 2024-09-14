import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {4, 1, 5, 6, 1, 1};
        if (ints.length != 0) {

            int max = ints[0];
            int min = ints[0];
            for (int i = 0; i < ints.length; i++) {
                if (max < ints[i]) {
                    max = ints[i];
                }
                if (min > ints[i]) {
                    min = ints[i];
                }
            }
            System.out.println(min);
            System.out.println(max);
        } else {
            System.out.println("Empty");
        }

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
        System.out.println(Arrays.toString(args));
    }
}






