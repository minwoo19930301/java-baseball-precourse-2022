package baseball.model;

/**
 * @author: Minwoo Kim
 * @date 2022/10/03
 */
public abstract class Player {

    private Balls balls = new Balls();

    public Balls getBalls() {
        return balls;
    }

    //a constructor like method intended to call multiple times
    public abstract void initBalls();
}
