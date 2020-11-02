package com.mudanyali;

import java.util.Scanner;
/**
 * The main function creates 2 accounts, one pre-declared, the other declared
 * from the inputs of the user. Then the pre-declared account prompty steals
 * 500TL from the user-declared account. It also prints out the values.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-10-25
 */
public class AccountTest {
    public static void main(String[] args) {
        Account userAccount = new Account();
        Account myAccount = new Account("Furkan","Mudanyali",250000);
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your account holder's first name.");
        userAccount.setFirstName(input.nextLine());
        System.out.println("Please enter your account holder's last name.");
        userAccount.setLastName(input.nextLine());
        System.out.println("Please enter your account holder's balance.");
        userAccount.setBalance(input.nextDouble());
        input.close();

        userAccount.transfer(myAccount, 500);
        System.out.printf(
            "%s stole 500TL from you, you now have %.2f TL.%n%n",
            myAccount.getFirstName(),userAccount.getBalance()
        );

        String formatText = 
            "%s %s%n\tBalance: %.2f TL%n%n";
        System.out.printf(
            formatText,
            userAccount.getFirstName(),
            userAccount.getLastName(),
            userAccount.getBalance()
        );
        System.out.printf(
            formatText,
            myAccount.getFirstName(),
            myAccount.getLastName(),
            myAccount.getBalance()
        );
    }
}
