import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Gymsystem {
    private ArrayList<Membership>  memberships;
    private Scanner scanner;

    public Gymsystem() {
        memberships = new ArrayList <>();
        scanner = new Scanner(System.in);

    }

    public void start(){
        boolean running = true;

        while(running){
            displayMenu();

            String choice = scanner.nextLine().trim();

            try {
                int menuChoice = Integer.parseInt(choice);
                switch (menuChoice) {
                    case 1:
                        addMembership();
                        break;

                    case 2:
                        removeMembership();
                        break;

                    case 3:
                        searchMembership();
                        break;

                    case 4:
                        displayAllMembership();
                        break;

                    case 5:
                        showStatistics();
                        break;

                    case 6:
                        bookTraining();
                        break;

                    case 7:
                        running = false;
                        System.out.println("Thank you for using the Gym Membership System!");
                        break;

                        default:
                            System.out.println("Invalid choice. Try again.");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid choice 1-7.");
            }
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println();
        System.out.println("================");
        System.out.println(" GYM MANAGEMENT SYSTEM ");
        System.out.println("==================");
        System.out.println("1. Add Membership");
        System.out.println("2. Remove Membership");
        System.out.println("3. Search Membership");
        System.out.println("4 Display All Membership");
        System.out.println("5 Show Statistics");
        System.out.println("6 Book Training");
        System.out.println("7 Exit");
        System.out.println("Choose an option: ");
    }

    //ADD

    void addMembership(){
        try {
            System.out.println("Enter Membership Name: ");
            String membershipName = scanner.nextLine().trim();

            System.out.println("Enter Membership ID: ");
            int membershipID = Integer.parseInt(scanner.nextLine().trim());

            System.out.println();
            System.out.println("Choose Membership Type: ");
            System.out.println("1 Standard");
            System.out.println("2 Premium");
            System.out.println("3 Student");

            System.out.println("Choose type");
            int membershipType = Integer.parseInt(scanner.nextLine().trim());

            Membership membership;
            if (membershipType == 1) {
                System.out.println("Does the member have group training? (yes/no)");
                String answer = scanner.nextLine().trim();

                boolean groupTraining = answer.equalsIgnoreCase("Yes");
                membership = new StandardMembership("Alice", 1001, 2);

            } else if (membershipType == 2) {
                System.out.println("Does the member have a personal trainer? (yes/no)");
                String answer = scanner.nextLine().trim();

                boolean personalTraining = answer.equalsIgnoreCase("Yes");
                membership = new PremiumMembership("John",2003,3, "Coach PT_kim");

            }  else if (membershipType == 3) {
                System.out.println("Enter School Name: ");
                String schoolName = scanner.nextLine().trim();

                membership = new StudentMembership("Charlie EK", 1001, "Malmö University");

            } else {
                System.out.println("Invalid membership type. Try again.");
                return;
            }
            memberships.add(membership);
            System.out.println("Membership added successfully!");

        }catch (NumberFormatException e){
            System.out.println("Invalid number. Please enter a valid number.");

        } catch (IllegalArgumentException e) {
            System.out.println("Could not create Membership: " + e.getMessage());
        }

    }

    //REMOVE
    void removeMembership(){
        try {
        }catch (NumberFormatException e){
        }
    }

    //SEARCH
    void searchMembership(){

    }

    //DISPLAY ALL
    void displayAllMembership(){

    }

    //STATISTICS
    void showStatistics() {

    }

    //BOOK TRAINING
    void bookTraining(){

    }





}
