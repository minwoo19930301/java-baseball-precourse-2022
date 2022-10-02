package baseball.model;
import camp.nextstep.edu.missionutils.Randoms;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class Computer extends Player{

    @Override
    public void initBalls() {
        int randInt = Randoms.pickNumberInRange(0, 999);
        this.getBalls().setBallNums(randInt);
    }
}
