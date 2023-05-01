import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(60.5);
            output.println(175.0);
            output.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        FileReader file;
        try {
            file = new FileReader("data.txt");
            Scanner scan = new Scanner(file);
            String s = scan.nextLine();
            System.out.println(s);
            int age = scan.nextInt();
            System.out.println(age);
            double weight = scan.nextDouble();
            System.out.println(weight);
            double height = scan.nextDouble();
            System.out.println(height);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
