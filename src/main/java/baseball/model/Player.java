package baseball.model;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public abstract class Player {

    private Balls balls;

    public Balls getBalls() {
        return balls;
    }

    public void setBalls(Balls balls) {
        this.balls = balls;
    }

}
