package bridge.command;

import java.util.Arrays;

public enum MoveCommand implements Command {
  COMMAND_U("U"),
  COMMAND_D("D");

  private final String keystroke;

  MoveCommand(String keystroke) {
    this.keystroke = keystroke;
  }

  @Override
  public String getStroke() {
    return this.keystroke;
  }
}
