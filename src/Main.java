public class Main {
    public static void main(String[] args)
    {
      double creditCardBalance = 5000.00;
      double interestRate = 0.17;
      double firstMonthInterest = creditCardBalance * interestRate;
        System.out.println("First month interest is: " + firstMonthInterest);
      double balanceAfterFirstMonth = creditCardBalance + firstMonthInterest;
      double secondMonthInterest = balanceAfterFirstMonth * interestRate;
        System.out.println("Second month interst is: " + secondMonthInterest);

    }
}