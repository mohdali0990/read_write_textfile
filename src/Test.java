import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello");
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Press 1 to add names\nPress 2 to search name\npress 3 to exit");
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
            else if(choice==2) { //// this option does not work properly. cant figure out why?
                File file = new File("saveName.txt");
                Scanner scanner1 =new Scanner(file);
                System.out.println("Please search name");
                String checkName = scanner1.nextLine();// debugging works fine until here.

              while(scanner1.hasNextLine()) {
                  if (checkName.equals(scanner1.nextLine().trim())) {
                      System.out.println("I have found you in the system");
                      break;
                  } else {
                      System.out.println("I have not found you in the system");
                  }
              }
            }
            else {
                System.out.println("please try again");
                break;}
            }



    }


}