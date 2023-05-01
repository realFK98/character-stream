import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LAB4 {
    public static void main(String[] args) {
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        System.out.print("Enter your name: ");

        try {
            String name = input.readLine();
            System.out.println("Hello " + name);
            System.out.print("Enter your weight: ");
            String w = input.readLine();
            System.out.print("Enter your height: ");
            String h = input.readLine();
            System.out.println(Double.parseDouble(h) * Double.parseDouble(w));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
