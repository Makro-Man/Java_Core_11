package ua.lviv.lgs.arrayinteger;

import java.util.Arrays;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        Integer[] arrays = {Randomable.getRandomValueFromRange(1, 100), Randomable.getRandomValueFromRange(1, 100),
                Randomable.getRandomValueFromRange(1, 100), Randomable.getRandomValueFromRange(1, 100),
                Randomable.getRandomValueFromRange(1, 100), Randomable.getRandomValueFromRange(1, 100),
                Randomable.getRandomValueFromRange(1, 100), Randomable.getRandomValueFromRange(1, 100),
                Randomable.getRandomValueFromRange(1, 100), Randomable.getRandomValueFromRange(1, 100)};
        System.out.println(Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        Arrays.sort(arrays, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrays));
    }
}
