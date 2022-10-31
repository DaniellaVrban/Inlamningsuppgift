import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userInput = "";
        Counter counter = new Counter();

        while (!userInput.equals("stop")) {
            System.out.println("Enter a text: ");
            Scanner scan = new Scanner(System.in);
            userInput = scan.nextLine();
            counter.addCharacterCount(userInput);

            if (!userInput.equals("stop")) {
                counter.increaseRowAmount();
            }
        }
        System.out.println(counter.getRowAmount());
        System.out.println(counter.getCharacterCount());
    }
}