package Module11;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {

        public static void main(String[] args) {
            Queue<String> printer = new LinkedList<>();

            // Add print jobs
            printer.add("File1.pdf");
            printer.add("File2.docx");
            printer.add("Image.png");

            while (!printer.isEmpty()) {
                System.out.println("Printing: " + printer.poll());
            }

            System.out.println("All print jobs completed!");
        }
    }

