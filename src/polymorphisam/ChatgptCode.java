package polymorphisam;

public class ChatgptCode {

        public static void main(String[] args) {
            double principal = 500000; // Principal amount of the loan
            double interestRate = 7.5; // Annual interest rate (in percentage)
            int repaymentPeriod = 12 * 5; // Repayment period in months (e.g. 5 years)

            calculateEMI(principal,  interestRate, repaymentPeriod);
        }

        public static void calculateEMI(double principal, double interestRate, int repaymentPeriod) {
            if (interestRate > 0 && repaymentPeriod > 0) {
                double rpp = interestRate / 100 / 12;
                double emi = (principal * rpp * (1 + rpp) * repaymentPeriod) / 12;

                double totalAmountPaid = emi * repaymentPeriod;
                double totalInterestPaid = totalAmountPaid - principal;

                System.out.println("Principal: " + principal);
                System.out.println("Interest Rate: " + interestRate + "%");
                System.out.println("Repayment Period: " + repaymentPeriod + " months");
                System.out.println("EMI: " + emi);
                System.out.println("Total Amount Paid: " + totalAmountPaid);
                System.out.println("Total Interest Paid: " + totalInterestPaid);
                System.out.println();

                System.out.println("Example:");
                System.out.println("Month: 1");
                System.out.println("Principal: " + principal);
                System.out.println("Interest: " + (principal * rpp));
                System.out.println("EMI: " + emi);
                System.out.println("Remaining Principal: " + (principal - emi + (principal * rpp)));
                System.out.println();

                double remainingPrincipal = principal - emi + (principal * rpp);
                for (int i = 2; i <= 3; i++) {
                    System.out.println("Month: " + i);
                    System.out.println("Principal: " + remainingPrincipal);
                    System.out.println("Interest: " + (remainingPrincipal * rpp));
                    System.out.println("EMI: " + emi);
                    System.out.println("Remaining Principal: " + (remainingPrincipal - emi + (remainingPrincipal * rpp)));
                    System.out.println();
                    remainingPrincipal = remainingPrincipal - emi + (remainingPrincipal * rpp);
                }
            } else {
                System.out.println("Invalid input. Please enter a valid interest rate and repayment period.");
            }
        }

    }

