import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author woytek/Ryan Smith
 *
 */
public class ContactWriterReader {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Contact testContact = new Contact(); // creating reference
		String input = null; // initializing String input
		Scanner keyboard = new Scanner(System.in); // allows user to input
													// information
		File contactFile = new File("contactFile.txt");
		String inputString = null;
		BufferedReader inputFile;
		Contact[] StoreArray = new Contact[25];// initializes to 25 elements
		int counter = 1;
		int numContacts = 0;
		PrintWriter writer;

		// Choose file name and check to see if file exists
		// if it does, read the contents and display to user
		// if it dies not, create an array of contact objects and write them to
		// the disk and exit the program
		System.out.println("Enter the file name: ");
		inputString = keyboard.nextLine();

		if (contactFile.exists()) {
			inputFile = new BufferedReader(new FileReader(contactFile));
			while (inputFile.ready()) {
				StoreArray[numContacts] = new Contact();

				inputString = inputFile.readLine();
				StoreArray[numContacts].setLastName(inputString);

				StoreArray[numContacts].setFirstName(inputString);
				inputString = inputFile.readLine();

				numContacts++;

			}
			inputFile.close();

			for (int ctr = 0; ctr < numContacts; ctr++) {
				System.out.println("Last name: " + StoreArray[ctr].getLastName());
				System.out.println("First name: " + StoreArray[ctr].getFirstName());
				System.out.println("Middle name: " + StoreArray[ctr].getMiddleName());
				System.out.println("Phone number: " + StoreArray[ctr].getPhone());
				System.out.println("Prefix: " + StoreArray[ctr].getPrefix());
				System.out.println("Email: " + StoreArray[ctr].getEmail());
				System.out.println("Street: " + StoreArray[ctr].getStreet());
				System.out.println("City: " + StoreArray[ctr].getCity());
				System.out.println("State: " + StoreArray[ctr].getState());
				System.out.println("Occupation" + StoreArray[ctr].getOccupation());
			}

		} else {

			do {
				contactFile = new File(inputString);
				StoreArray[numContacts] = new Contact();

				System.out.println("Enter the last name: ");
				input = keyboard.nextLine();
				testContact.setLastName(input);

				System.out.println("Last name: " + testContact.getLastName());

				System.out.println("Enter the first name: ");
				input = keyboard.nextLine();
				testContact.setFirstName(input);

				System.out.println("First name: " + testContact.getFirstName());

				System.out.println("Enter the middle name: ");
				input = keyboard.nextLine();
				testContact.setMiddleName(input);

				System.out.println("Middle name: " + testContact.getMiddleName());

				System.out.println("Enter the phone number: ");
				input = keyboard.nextLine();
				testContact.setPhone(input);

				System.out.println("Phone number: " + testContact.getPhone());

				System.out.println("Enter the prefix: ");
				input = keyboard.nextLine();
				testContact.setPrefix(input);

				System.out.println("Prefix: " + testContact.getPrefix());

				System.out.println("Enter the email: ");
				input = keyboard.nextLine();
				testContact.setEmail(input);

				System.out.println("Email: " + testContact.getEmail());

				System.out.println("Enter the street: ");
				input = keyboard.nextLine();
				testContact.setStreet(input);

				System.out.println("Street: " + testContact.getStreet());

				System.out.println("Enter the city: ");
				input = keyboard.nextLine();
				testContact.setCity(input);

				System.out.println("City: " + testContact.getCity());

				System.out.println("Enter the state: ");
				input = keyboard.nextLine();
				testContact.setState(input);

				System.out.println("State: " + testContact.getState());

				System.out.println("Enter the occupation: ");
				input = keyboard.nextLine();
				testContact.setOccupation(input);

				System.out.println("Occupation: " + testContact.getOccupation());

				System.out.println("Do you want to enter another? (y/n)");
				input = keyboard.nextLine();

				// increment counter
				numContacts++;
			} while (input.equals("y"));

		}

		writer = new PrintWriter(contactFile);
		// loop through array and print
		for (int ctr = 0; ctr < numContacts; ctr++) {
			writer.println(StoreArray[ctr].getLastName());
			writer.println(StoreArray[ctr].getFirstName());
			writer.println(StoreArray[ctr].getMiddleName());
			writer.println(StoreArray[ctr].getPhone());
			writer.println(StoreArray[ctr].getPrefix());
			writer.println(StoreArray[ctr].getEmail());
			writer.println(StoreArray[ctr].getStreet());
			writer.println(StoreArray[ctr].getCity());
			writer.println(StoreArray[ctr].getState());
			writer.println(StoreArray[ctr].getOccupation());
		}

		// outputFile = new PrintWriter( myFile );
		// inputFile.mark(256);
		// do something silly

		// inputString = inputFile.readLine();
		// System.out.println("line " + counter++ + " = " + inputString);
		// }
		// inputFile.reset();

		// Stream<String> newStream;
		// newStream = inputFile.lines();

		// newStream.forEach(s -> {
		// System.out.println(s);
		// });

		// inputFile.close();

		// }

	}

}