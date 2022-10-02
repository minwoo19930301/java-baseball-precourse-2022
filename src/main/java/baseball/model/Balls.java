package baseball.model;

import static baseball.controller.BaseballGuessingGame.COUNT_OF_BALLS;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class Balls {

    private int[] ballNums = new int[COUNT_OF_BALLS];

    public int[] getBallNums() {
        return ballNums;
    }

    private void validateNum(int fullNum) {
        if (!(0 <= fullNum && fullNum < Math.pow(10, COUNT_OF_BALLS))) {
            throw new IllegalArgumentException();
        }
    }

    public void setBallNums(int fullNum) {
        validateNum(fullNum);
        this.ballNums[0] = (fullNum / 100) % 10;
        this.ballNums[1] = (fullNum / 10) % 10;
        this.ballNums[2] = fullNum % 10;
    }


}
