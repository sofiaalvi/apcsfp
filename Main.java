
import java.util.HashMap;

public class Main {
    public static void main (String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<String,Integer>();
        System.out.println("Hello, and welcome to your phonebook. You can record the name and number of your contacts with this phonebook\n");
        System.out.println("You can\n\ts-see all currect contacts\n\tc-create a new contact\n\td-delete a contact\n\tq-quit the program\n");
        while (true) {
            String command = Utils.inputStr("\nWhat do you want to do?");
            switch (command) {
                case "s":
                if (phonebook.size() == 0) {
                    System.out.println("You currently don't have any contacts.");
                }
                for (String thing : phonebook.keySet()) {
                    int value = phonebook.get(thing);
                    System.out.println(thing + ": " + value);
                }
                break;

                case "c":
                System.out.println("Please enter your contact with the name first and then their phone number. Phone numbers must be put in without any dashes or letters (ex if your number is 123-456-7890, input it as 1234567890");
                String contact = Utils.inputStr("What is the contact's name?");
                int number = Utils.inputNum("What is the phone number?");
                phonebook.put(contact, number);
                break;

                case "d":
                contact = Utils.inputStr("What contact do you want to delete?");
                phonebook.remove(contact);
                break;

                case "q":
                System.out.println("Thank you for using out phonebook, goodbye");
                return;
            }
        }
    }
}