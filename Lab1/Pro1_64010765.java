package Lab1;

public class Pro1_64010765 {
    public static void main(String[] args) {
        final byte BIRTH = 7;
        final byte DEATH = 13;
        final byte IMMIGRANT = 45;
        final int SECONDS_IN_YEAR = 60 * 60 * 24 * 365;

        int startPopulation = 312032486;
        int populationChange = SECONDS_IN_YEAR / BIRTH - SECONDS_IN_YEAR / DEATH + SECONDS_IN_YEAR / IMMIGRANT;

        for (int i = 1; i < 6; i++) {
            System.out.println("The population in " + i + " year(s) is " + (startPopulation + (populationChange * i)));
        }
    }
}
