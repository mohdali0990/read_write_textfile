import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello");
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello");

        while(true) {
            System.out.println("Press 1 to add names\nPress 2 to exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice==1){
                    System.out.println("Please add a name.");
                    String addNames = scanner.nextLine();
                    names.add(addNames);
                    PrintWriter outputFile = new PrintWriter("saveName.txt");
                    for (int i = 0; i < names.size(); i++) {
                        outputFile.println(names.get(i));
                    }
                    outputFile.close();
                }
            else {
                System.out.println("Thanks");
                break;}
            }
    }
}