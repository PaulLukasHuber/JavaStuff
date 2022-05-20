/*
Another very simple CC project. The program is to calculate the monthly rate for a car loan by giving this again without input the values of the loan amount, length in years, interest amount and the down payment. The focus here was mainly on "conditionals and control flow".
 */

public class CarLoan {
    public static void main(String[] args) {

        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;


        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }

    }
}