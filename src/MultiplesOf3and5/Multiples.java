package MultiplesOf3and5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Multiples {

    static void getMultiple(int number) {

        int sum = 0, multipleOfThree, multipleOfFive;
        Set multipleSet = new HashSet();

        if (number == 0) {
            System.out.printf("Enter valid number!");
        } else {
            for (int i = 1; i <= number - 1; i++) {
                multipleOfThree = i * 3;
                if (multipleOfThree <= number - 1) {
                    multipleSet.add(multipleOfThree);
                } else {
                    break;
                }
            }

            for (int i = 1; i <= number - 1; i++) {
                multipleOfFive = i * 5;
                if (multipleOfFive <= number - 1) {
                    multipleSet.add(multipleOfFive);
                } else {
                    break;
                }
            }

        }

        Iterator itr = multipleSet.iterator();
        while (itr.hasNext()) {
            sum = sum + (int) itr.next();
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());
            int i = 1;

            while (i <= testCase) {

                int number = Integer.parseInt(br.readLine());
                getMultiple(number);
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
