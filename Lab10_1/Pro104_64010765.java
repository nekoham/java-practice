package Lab10_1;

import java.io.File;
import java.util.Scanner;

public class Pro104_64010765 {
    public static void main(String[] args) throws Exception{
        //Data
        int assistantCount = 0;
        int associateCount = 0;
        int fullCount = 0;
        double assistantTotal = 0;
        double associateTotal = 0;
        double fullTotal = 0;

        //Read data from Salary.txt
        File file = new File("Lab10_1/Salary.txt");
        Scanner reading = new Scanner(file);

        //Looping as long as there is something to read in file
        while(reading.hasNext()) {
            String firstName = reading.next();
            String lastName = reading.next();
            String rank = reading.next();
            //Check rank to add value
            if (rank.contains("assistant")) {
                assistantCount += 1;
                assistantTotal += reading.nextDouble();
            }
            else if (rank.contains("associate")) {
                associateCount += 1;
                associateTotal += reading.nextDouble();
            }
            else {
                fullCount += 1;
                fullTotal += reading.nextDouble();
            }
        }

        //Output
        System.out.printf("Total salary for assistant professor is %.2f\n", assistantTotal);
        System.out.printf("Total salary for associate professor is %.2f\n", associateTotal);
        System.out.printf("Total salary for full professor is %.2f\n", fullTotal);
        System.out.printf("Total salary for all professors is %.2f\n", assistantTotal+associateTotal+fullTotal);
        System.out.printf("Average salary for assistant professor is %.2f\n", assistantTotal/assistantCount);
        System.out.printf("Average salary for associate professor is %.2f\n", associateTotal/associateCount);
        System.out.printf("Average salary for full professor is %.2f\n", fullTotal/fullCount);
        System.out.printf("Average salary for all professors is %.2f\n", (assistantTotal+associateTotal+fullTotal)/(assistantCount+associateCount+fullCount));

        reading.close();
    }
}
