import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DrivingAllowance {
    ArrayList<String> months = new ArrayList<>(Arrays.asList("Januar", "Februar", "Marts", "April", "Maj", "Juni", "July", "August", "September", "October", "November", "December"));
    int totalPayout;
    Scanner scan = new Scanner(System.in);

    public void registerDrivers() {
        boolean key = true;
        System.out.println("Angiv din kørsel med formatet [måned,antal]");

        while(key) {

            String userInput = scan.nextLine();

                String[] values = userInput.split(",");
                int monthNr = Integer.parseInt(values[0]);
                int money = Integer.parseInt(values[1]);

                if (monthNr >= 6) {
                    totalPayout += money*60;
                    System.out.println("Godtgørelse for " + months.get(monthNr - 1) + ": " + money * 60 + "kr");
                } else {
                    totalPayout += money*80;
                    System.out.println("Godtgørelse for " + months.get(monthNr - 1) + ": " + money * 80 + "kr");
                }
                System.out.println("Forsæt registrering? Y/N");

            String userInput2 = scan.nextLine();
            if(userInput2.equalsIgnoreCase("y")) {
                System.out.println("Angiv din kørsel med formatet [måned,antal]");
            } else {
                System.out.println("Tak for hjælpen! " + totalPayout + "kr vil blive indsat på din konto");
                key = false;
            }
        }
    }
}
