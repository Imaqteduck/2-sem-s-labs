import java.util.NoSuchElementException;
import java.util.Scanner;

public class CTLinkedQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;
        String[] arguments;
        LinkedQ<String> queue = new LinkedQ<>(5);
        while (true) {
            StdOut.println("--------------------");
            StdOut.print("Input a command: ");
            command = input.nextLine();
            if (command.equals("q") || command.equals("exit")) break;
            if (command.equals("show")) {
                queue.print();
                continue;
            }

            arguments = command.split(" ",2);
            command = arguments[0];
            if (command.equals("pop")) {
                try {
                    StdOut.println("Result: " + queue.pop());
                } catch (NoSuchElementException e) {
                    StdOut.println("Queue is empty!");
                }
            }
            else if (command.equals("add") || command.equals("push")) {
                String item;
                try {
                    item = arguments[1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    StdOut.println("Wrong argument");
                    continue;
                }
                if (item == null || item.equals("")) {
                    StdOut.println("Wrong argument");
                    continue;
                }
                queue.push(item);
            } else {
                StdOut.println("*** Unknown command ***");
            }
        }
        input.close();
        StdOut.println("Exit...");
    }
}
