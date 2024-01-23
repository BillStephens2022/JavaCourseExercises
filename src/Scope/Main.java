package Scope;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String varFour
                = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("*******************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        X x = new X(scanner.nextInt());
        x.x();
    }
}
