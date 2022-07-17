package baseball;

import java.util.ArrayList;
import java.util.Random;

public class Generate3Numbers {
    Random random = new Random();
    ArrayList<Integer> output = new ArrayList<Integer>();

    public ArrayList<Integer> create() {
        for (int i = 0; i < 3; i++) {
            output.add(random.nextInt(9) + 1);
        }
        return output;
    }
}
