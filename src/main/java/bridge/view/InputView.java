package bridge.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import bridge.command.MoveCommand;
import bridge.command.RetryCommand;
import bridge.validation.BridgeSizeValidator;
import bridge.validation.CommandValidator;
import bridge.validation.Validator;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        String input = readLine();

        Validator bridgeSizeValidator = new BridgeSizeValidator();
        bridgeSizeValidator.validate(input);

        return Integer.parseInt(input);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String input = readLine();

        Validator commandValidator = new CommandValidator(MoveCommand.values());
        commandValidator.validate(input);

        return input;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String input = readLine();

        Validator commandValidator = new CommandValidator(RetryCommand.values());
        commandValidator.validate(input);

        return input;
    }
}
