package Lab10_1;

import java.io.File;
import java.io.PrintWriter;

public class Pro103_64010765 {
    public static void main(String[] args) throws Exception {
        //Datas
        String[] rank = {"assistant", "associate", "full     "};
        double salary;
        File file = new File("Lab10_1/Salary.txt");
        PrintWriter output = new PrintWriter(file);

        //Creating 1000 lines of data
        for (int i = 1; i <= 1000; i++) {
            //Randoming rank and salary
            int num = (int)(Math.floor(Math.random() * 3));
            switch (num) {
                case 0:
                salary = (Math.random() * 30000) + 50000;
                    break;
                case 1:
                salary = (Math.random() * 50000) + 60000;
                    break;
                default:
                salary = (Math.random() * 55000) + 75000;
                    break;
            }
            //Write data on the file
            output.printf("FirstName%d\t  LastName%d\t %s\t  %.2f\n", i, i, rank[num], salary);
        }
        //Close output
        output.close();
    }
}
