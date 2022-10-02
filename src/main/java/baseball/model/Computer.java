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
        List<Integer> randInts = Randoms.pickUniqueNumbersInRange(0, 9, COUNT_OF_BALLS);
        StringBuilder temp = new StringBuilder();
        for(Integer integer : randInts){
            temp.append(integer.toString());
        }
        this.getBalls().setBallNums(Integer.parseInt(temp.toString()));
    }

}
