package baseball.model;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class Balls {

    private static final int COUNT_OF_BALLS = 3;
    private int[] ballNums = new int[COUNT_OF_BALLS];

    public int[] getBallNums() {
        return ballNums;
    }

    public void setBallNums(int[] ballNums) {
        this.ballNums = ballNums;
    }

}
