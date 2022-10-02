package baseball;

import baseball.model.Computer;
import baseball.view.Output;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 게임종료_후_재시작() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "1", "597", "589", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1234"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

    @Test
    void Enum테스트(){
        assertThat(Output.STRIKE.getOutput()).isEqualTo("스트라이크");
    }

    @Test
    void 숫자생성테스트(){
        int intInput = 2;
        int[] nums = new int[3];
        nums[2] = intInput % 10;
        nums[1] = (intInput/10)%10;
        nums[0] = (intInput/100)%10;
        assertThat(nums).isEqualTo(new int[]{0,0,2});
    }

    @Test
    void 컴퓨터가_유니크값_생성여부(){
        Computer computer = new Computer();
        int[] nums = computer.getBalls().getBallNums();
        assertThat(nums[0]).isNotEqualTo(nums[1]).isNotEqualTo(nums[2]);
    }


}
