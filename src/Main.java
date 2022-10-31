import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String userInput = "";
        int rowAmount = 0;
        int characterCount = 0;

        while (!userInput.equals("stop")) {

            System.out.println("Enter a text: ");
            Scanner scan = new Scanner(System.in);
            userInput = scan.nextLine();

            if (!userInput.equals("stop")) {
                rowAmount++;
                characterCount += userInput.length();
            }

        }

        System.out.println(rowAmount);
        System.out.println(characterCount);
    }


}