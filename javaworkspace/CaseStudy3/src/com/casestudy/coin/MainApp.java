package com.casestudy.coin;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        coinManagementDao dao = new coinManagementDao();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Coin Menu ====");
            System.out.println("1. Add 1 Coin");
            System.out.println("2. Add 5 Coins (Bulk Insert)");
            System.out.println("3. Display All Coins");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    int cid = dao.addCoin();   // get next ID

                    System.out.println("\n--- Enter Coin Details ---");

                    System.out.print("Enter country: ");
                    String country = sc.nextLine();

                    System.out.print("Enter denomination: ");
                    int denomination = sc.nextInt();

                    System.out.print("Enter year of minting: ");
                    int year = sc.nextInt();

                    System.out.print("Enter current value: ");
                    double value = sc.nextDouble();
                    System.out.println(" enter a aquire date");
                    LocalDate acquireDate = LocalDate.now();

                    Coin coin = new Coin(cid, country, denomination, year, value, acquireDate);

                    dao.insertCoin(coin);   // INSERT INTO DB

                    System.out.println("Coin inserted successfully!");
                    break;

            case 2:
                    System.out.println("\n--- Bulk Insert: 5 Coins ---");

                    List<Integer> cidList = dao.addCoinBulk();

                    for (int id : cidList) {
                        System.out.println("\nEnter details for Coin ID: " + id);

                        System.out.print("Enter country: ");
                        String ctry = sc.nextLine();

                        System.out.print("Enter denomination: ");
                        int denom = sc.nextInt();

                        System.out.print("Enter year of minting: ");
                        int yom = sc.nextInt();

                        System.out.print("Enter current value: ");
                        double val = sc.nextDouble();
                        sc.nextLine(); // clear newline

                        LocalDate adate = LocalDate.now();

                        Coin c = new Coin(id, ctry, denom, yom, val, adate);

                        dao.insertCoin(c);
                    }

                    System.out.println("5 coins inserted successfully!");
                    break;

                               case 3:
                    dao.displayallcoins();
                    break;

                               case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
