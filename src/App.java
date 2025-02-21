public class App {

  public static String getHiddenCard(String creditCard, int hiddenNumber) {
    String hiddenInteger = "*".repeat(hiddenNumber);
    String creditCardNumber = creditCard.substring(12);
    return hiddenInteger + creditCardNumber;
  }
  public static String getHiddenCard(String creditCard) {
    String hiddenInteger = "*".repeat(4);
    String creditCardNumber = creditCard.substring(12, 16);
    return hiddenInteger + creditCardNumber;
  }
  public static void main(String[] args) {
    System.out.println(App.getHiddenCard("1234123456799876", 4));
  }
}