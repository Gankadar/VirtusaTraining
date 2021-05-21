package practice.dateexamples;

import java.time.LocalDate;

public class CreditCard {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate expire = LocalDate.of(2025, 10, 02);
        int year = today.getYear();
        int month = today.getMonthValue();
        if (year <= expire.getYear()) {
            if (month > expire.getMonthValue()) {
                System.out.println("expired");

            } else {
                System.out.println("not expired");
            }
        } else {
            System.out.println("not expired");
        }
    }


}
