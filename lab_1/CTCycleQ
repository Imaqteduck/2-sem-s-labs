import java.util.NoSuchElementException;
import java.util.Scanner;

public class CTCycleQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;
        String[] arguments;
        CycleQ<String> queue = new CycleQ<>(5);
        while (true) {
            StdOut.print("--------------------");
            StdOut.print("Input a command: ");
            command = input.nextLine();
            if (command.equals("q") || command.equals("exit")) break;
            if (command.equals("show")) {
                queue.print();
                continue;
            }
            if (command.equals("clear")) {
                queue.clear();
                continue;
            }

            arguments = command.split(" ",2);
            command = arguments[0];
            if (command.equals("pop")) {
                try {
                    StdOut.println("Result: " + queue.pop());
                } catch (NoSuchElementException e) {
                    StdOut.println("Queue is empty.");
                }
            }
            else if (command.equals("add") || command.equals("push")) {
                String item = null;
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
