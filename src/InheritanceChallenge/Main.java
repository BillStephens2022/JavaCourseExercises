package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
      Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
      System.out.println(tim);
      System.out.println("Age = " + tim.getAge());
      System.out.println("Pay = " + tim.collectPay());

      Employee joe = new Employee("Joe", "11/11/1990", "03/03/2020");
      System.out.println(joe);

      SalariedEmployee bill = new SalariedEmployee("Bill", "04/17/1972", "05/14/2015",
              170000);
      System.out.println(bill);
      System.out.println("Bill's Paycheck = $" + bill.collectPay());
      bill.retire();
      System.out.println("Bill's Pension check = $" + bill.collectPay());

      HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
              "03/03/21", 15);
      System.out.println(mary);
      System.out.println("Mary's Paycheck = $" + mary.collectPay());
      System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }

}
