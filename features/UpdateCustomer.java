package features;

import java.util.*;
import data.Customer;
import data.MyArrayList;
// import data.DataHandler;
import data.Buffer;

public class UpdateCustomer {

    static Scanner sc = new Scanner(System.in);
    
    public static int binarySearch(MyArrayList<Customer> arr, String value) throws Exception{
        int left = 0;
        int right = arr.size() - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (value.compareTo(arr.get(mid).getID()) < 0) {
                right = mid - 1;
            } else if (value.compareTo(arr.get(mid).getID()) > 0) {
                left = mid + 1;
            } else return mid;
        }
        // no match value
        return -1;
    }

    public static void updateCustomer(MyArrayList<Customer> arr) throws Exception{
        System.out.print("Please enter an user's ID: ");
        String input = sc.nextLine();

        // check if user exist in csv file
        int index = binarySearch(arr, input);
        // notify if user not exist
        if(index == - 1) {
            System.out.println("No user found");
            return;
        }

        while (true) {
            System.out.print("Which field do you want to update\n" + "1. First name\n" + 
            "2. Last name\n" + "3. Phone\n" + "4. Exit\n" +
             "Select an option by enter a number: ");
            int option = sc.nextInt();

            Customer cus = new Customer();

            if(option == 1) {
                System.out.print("Enter new first name: ");
                cus.setFirstName(sc.nextLine());
                System.out.println("\nUpdate successfull");
                Buffer.buff();
            } 
            else if(option == 2) {
                System.out.print("Enter new last name: ");
                cus.setLastName(sc.nextLine());
                System.out.println("Update successfull");
            } 
            else if(option == 4) {
                break;
            }
        }      
    }
}

