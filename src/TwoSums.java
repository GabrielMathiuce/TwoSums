import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class TwoSums {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        TreeSet<Integer> finalArray = new TreeSet<>();
        int arraySize;
        int target;
        int firstPosition;
        int secondPosition;

        System.out.println("Array size?");
        arraySize = sc.nextInt();
        System.out.println("Target?");
        target = sc.nextInt();
        System.out.println("Numbers?");

        for (int i = 0; i < arraySize; i++) {
            array.add(sc.nextInt());
        }

        for (int i = 0; i < arraySize; i++) {
            for (int x = 0; x < arraySize; x++) {
                if ((array.get(x) + array.get(i)) == target) {
                    firstPosition = array.indexOf(array.get(x));
                    if(x != i) {
                        secondPosition = array.indexOf(array.get(i));
                    }
                    else {
                        array.remove(array.indexOf(array.get(x)));
                        secondPosition = array.indexOf(array.get(x)) + 1;
                    }
                    finalArray.add(secondPosition);
                    finalArray.add(firstPosition);
                    System.out.println("Nums:" + finalArray + "target:" + target);
                    break;
                }
            }
            if (finalArray.size() > 0) {
                break;
            }
        }
        if(finalArray.size() == 0) System.out.println("Target unreacheable");
    }
}