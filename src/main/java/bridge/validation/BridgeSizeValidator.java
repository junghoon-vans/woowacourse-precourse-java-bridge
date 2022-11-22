package bridge.validation;

import static bridge.Constants.BRIDGE_MAXIMUM_SIZE;
import static bridge.Constants.BRIDGE_MINIMUM_SIZE;

public class BridgeSizeValidator implements Validator {

  @Override
  public void validate(String input) {
    validateNumeric(input);
    int bridgeSize = Integer.parseInt(input);
    validateRange(bridgeSize);
  }

  /**
   * Verify string is numeric.
   * @param input the string to be checked.
   */
  protected void validateNumeric(String input) {
    try {
      Double.parseDouble(input);
    } catch(NumberFormatException e){
      throw new IllegalArgumentException("[ERROR] 다리 길이는 숫자 자료형으로 입력하여야 합니다.");
    }
  }

  /**
   * Verify that the number is between the allowed values.
   * @param bridgeSize the number to be checked.
   */
  private void validateRange(Integer bridgeSize) {
    if (bridgeSize < BRIDGE_MINIMUM_SIZE || bridgeSize > BRIDGE_MAXIMUM_SIZE) {
      throw new IllegalArgumentException("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
    }
  }
}
