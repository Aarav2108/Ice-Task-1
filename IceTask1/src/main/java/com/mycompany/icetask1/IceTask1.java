

package com.mycompany.icetask1;

import java.util.Scanner;


public class IceTask1 {

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
          
          String[] bouquetTypes = {"Roses", "Tulips", "Lillies"};
          
          String[] Days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
          
          int[][] sales = new int[Days.length][bouquetTypes.length];
          
          
          System.out.println("Enter sales data for each day and bouquet type");
          for(int i = 0; i < Days.length; i++){
              System.out.println("----" + Days[i] + "----");
            for (int j = 0; j < bouquetTypes.length; j++){
                System.out.print("Enter sales for " + bouquetTypes[j] + ": ");
                sales[i][j] = sc.nextInt();
            }
          }
          
          System.out.println("\nFlower shop weekly sales report");
          System.out.println("==================================");
          System.out.printf("%-10s", "Day");
          for(String bouquet : bouquetTypes) {
              System.err.printf("%10s%n", "Total");
              System.out.println("---------------------------------------------------");
              
              
              int[] bouquetTotals = new int[bouquetTypes.length];
            int overallTotal = 0;

           
            for (int i = 0; i < Days.length; i++) {
                System.out.printf("%-10s", Days[i]);
                int dayTotal = 0;
                for (int j = 0; j < bouquetTypes.length; j++) {
                    System.out.printf("%10d", sales[i][j]);
                    dayTotal += sales[i][j];
                    bouquetTotals[j] += sales[i][j];
                }
                System.out.printf("%10d%n", dayTotal);
                overallTotal += dayTotal;
            }

         
            System.out.println("-----------------------------------------------");
            System.out.printf("%-10s", "TOTAL");
            for (int j = 0; j < bouquetTypes.length; j++) {
                System.out.printf("%10d", bouquetTotals[j]);
            }
            System.out.printf("%10d%n", overallTotal);

          
            System.out.println();
            for (int j = 0; j < bouquetTypes.length; j++) {
                System.out.println("Total sales for " + bouquetTypes[j] + ": " + bouquetTotals[j]);
            }
            System.out.println("Overall total sales for the week: R " + overallTotal);
        }
          }
    }
}
