package Classes;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("Black");
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
        car.setMake("Maserati");
        // shows "unsupported" class since "Maserati" isn't one of the makes we allow in the class setup
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setColor("Silver");
        targa.setConvertible(false);
        targa.describeCar();

        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber("1234567890");
        myAccount.setAccountBalance(1575250.18);
        myAccount.setEmail("bill@gmail.com");
        myAccount.setCustomerName("Bill S");
        myAccount.setPhoneNumber("987-654-3210");
        myAccount.depositFunds(200000);
        System.out.println(myAccount.getAccountBalance());
        myAccount.withdrawFunds(750000);
        System.out.println(myAccount.getAccountBalance());
        myAccount.withdrawFunds(5000000);
        System.out.println(myAccount.getAccountBalance());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }


}


