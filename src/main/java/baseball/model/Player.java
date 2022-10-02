package baseball.model;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public abstract class Player {

    private Balls balls = new Balls();

    public Player() {
        initBalls();
    }

    public Balls getBalls() {
        return balls;
    }

    public abstract void initBalls();

}
