package baseball;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Generate3Numbers {
    final List<Integer> random3numbers = Randoms.pickUniqueNumbersInRange(1,9, 3);

    public List<Integer> create() {
        return random3numbers;
    }
}
