package bridge.validation;

public class BridgeSizeValidator implements Validator {

  @Override
  public void validate(String input) {
    validateNumeric(input);
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
}
