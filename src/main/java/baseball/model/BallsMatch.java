package baseball.model;

import static baseball.controller.BaseballGuessingGame.COUNT_OF_BALLS;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class BallsMatch {

    private int strike_count;
    private int ball_count;

    private void count_strikes(int[] ballNums1, int[] ballsNums2) {
        for (int i = 0; i < COUNT_OF_BALLS; i++) {
            if (ballNums1[i] == ballsNums2[i]) {
                strike_count++;
            }
        }
    }

    private void count_balls(int[] riddlerBallNums, int[] guesserBallsNums) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < COUNT_OF_BALLS; i++) {
            set.add(riddlerBallNums[i]);
        }
        for (int j = 0; j < COUNT_OF_BALLS; j++) {
            if (set.contains(guesserBallsNums[j])) {
                ball_count++;
            }
        }
        if (ball_count > 0) {
            ball_count -= strike_count;
        }
    }

    public void matchAllBalls(Player riddler, Player guesser) {
        int[] riddlerBallNums = riddler.getBalls().getBallNums();
        int[] guesserBallNums = guesser.getBalls().getBallNums();
        count_strikes(riddlerBallNums, guesserBallNums);
        count_balls(riddlerBallNums, guesserBallNums);
    }
}
