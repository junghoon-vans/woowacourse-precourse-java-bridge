package bridge.validation;

import bridge.command.Command;
import java.util.Arrays;

public class CommandValidator implements Validator {

  private final Command[] commands;

  public CommandValidator(Command[] commands) {
    this.commands = commands;
  }

  @Override
  public void validate(String input) {
    if (!this.contains(input)) {
      throw new IllegalArgumentException("[ERROR] 커맨드를 제대로 입력하였는지 확인해주세요.");
    }
  }

  public boolean contains(String other) {
      return Arrays.stream(commands)
          .anyMatch(command -> command.getStroke().equals(other));
  }
}
