package Lab2;

import java.util.Scanner;

public class Pro22_64010765 {
    public static void main(String[] args) {
        String allChoice[] = { "scissor", "rock", "paper" };
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int playerChoice = input.nextInt();
        int computerChoice = (int) (Math.random() * 3);
        int result = playerChoice - computerChoice;

        switch (result) {
            case -2:
                System.out.printf("The computer is %s. You are %s. You won", allChoice[computerChoice],
                        allChoice[playerChoice]);
                break;
            case -1:
                System.out.printf("The computer is %s. You are %s. You lost", allChoice[computerChoice],
                        allChoice[playerChoice]);
                break;
            case 0:
                System.out.printf("The computer is %s. You are %s too. It is a draw", allChoice[computerChoice],
                        allChoice[playerChoice]);
                break;
            case 1:
                System.out.printf("The computer is %s. You are %s. You won", allChoice[computerChoice],
                        allChoice[playerChoice]);
                break;
            case 2:
                System.out.printf("The computer is %s. You are %s. You lost", allChoice[computerChoice],
                        allChoice[playerChoice]);
                break;
            default:
                System.out.print("Error: Please enter the input as a number within 0-2 range");
                break;
        }
        input.close();
    }
}
