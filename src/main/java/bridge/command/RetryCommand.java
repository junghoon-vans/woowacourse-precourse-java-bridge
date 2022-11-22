package bridge.command;

public enum RetryCommand implements Command {
  COMMAND_R("R"),
  COMMAND_Q("Q");

  private final String keystroke;

  RetryCommand(String keystroke) {
    this.keystroke = keystroke;
  }

  @Override
  public String getStroke() {
    return this.keystroke;
  }
}
