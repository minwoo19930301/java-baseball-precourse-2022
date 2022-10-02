package baseball.model;

import static baseball.controller.BaseballGuessingGame.COUNT_OF_BALLS;
import static baseball.controller.BaseballGuessingGame.OBJECTIVE_MATCH;

import baseball.view.Output;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public class BallsMatch {

    private int strikeCount;
    private int ballCount;

    private int count_strikes(int[] ballNums1, int[] ballsNums2) {
        int strike = 0;
        for (int i = 0; i < COUNT_OF_BALLS; i++) {
            if (ballNums1[i] == ballsNums2[i]) {
                strike++;
            }
        }
        return strike;
    }

    private int count_balls(int[] riddlerBallNums, int[] guesserBallsNums) {
        Set<Integer> set = new HashSet<>();
        int ball = 0;
        fillSet(set, riddlerBallNums);
        for (int j = 0; j < COUNT_OF_BALLS; j++) {
            if (set.contains(guesserBallsNums[j])) {
                ball++;
            }
        }
        return ball > 0 ? ball - strikeCount : ball;
    }

    private void fillSet(Set<Integer> set, int[] array) {
        for (int i = 0; i < COUNT_OF_BALLS; i++) {
            set.add(array[i]);
        }
    }

    private String createOutput() {
        StringBuilder sb = new StringBuilder();
        sb.append(ballCount == 0 ? "" : ballCount + Output.BALL.getOutput());
        sb.append(strikeCount == 0 ? "" :
            ballCount == 0 ? strikeCount + Output.STRIKE.getOutput() :
                " " + strikeCount + Output.STRIKE.getOutput());
        return "".equals(sb.toString()) ? Output.NOTHING.getOutput() : sb.toString();
    }

    private boolean allNotMatched(){
        if (strikeCount == OBJECTIVE_MATCH) {
            System.out.println(Output.SUCCESS.getOutput());
            return false;
        }
        return true;
    }


    public boolean matchAllBalls(Player riddler, Player guesser) {
        int[] riddlerBallNums = riddler.getBalls().getBallNums();
        int[] guesserBallNums = guesser.getBalls().getBallNums();
        strikeCount = count_strikes(riddlerBallNums, guesserBallNums);
        ballCount = count_balls(riddlerBallNums, guesserBallNums);
        System.out.println(createOutput());
        return allNotMatched();
    }
}
