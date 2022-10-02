package baseball.model;
import static baseball.controller.BaseballGuessingGame.COUNT_OF_BALLS;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class Computer extends Player {

    public Computer() {
        initBalls();
    }

    @Override
    public void initBalls() {
        int randInt = Randoms.pickNumberInRange(0, 999);
        this.getBalls().setBallNums(randInt);
    }
}
