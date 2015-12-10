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
	public static void main(String[] args)throws IOException {
		Contact testContact = new Contact(); //creating reference
        String input = null; //initializing String input
        Scanner keyboard = new Scanner(System.in); //allows user to input information
        File contactFile = new File("contactFile.txt");
        String inputString = null;
        BufferedReader inputFile;
        Contact [] StoreArray = new Contact [25];
        int counter = 1;
        
        System.out.println("Enter the file name: ");
        inputString = keyboard.nextLine();
        
        while( !contactFile.exists() ) {
        	contactFile = new File(inputString);
        	StoreArray = new Contact [25];
        	
        	System.out.println( "Enter the last name: " );
        	input = keyboard.nextLine();
        	testContact.setLastName( input );
        
        	System.out.println( "Last name: " + testContact.getLastName() );
        
        	System.out.println("Enter the first name: ");
        	input = keyboard.nextLine();
        	testContact.setFirstName(input);
        
        	System.out.println("First name: " + testContact.getFirstName() );
        
        	System.out.println("Enter the middle name: ");
        	input = keyboard.nextLine();
        	testContact.setMiddleName(input);
        
        	System.out.println("Middle name: " + testContact.getMiddleName() );
        	
        	System.out.println("Enter the phone number: ");
        	input = keyboard.nextLine();
        	testContact.setPhone(input);
        
        	System.out.println("Phone number: " + testContact.getPhone() );
        
        	System.out.println("Enter the prefix: ");
        	input = keyboard.nextLine();
        	testContact.setPrefix(input);
        
        	System.out.println("Prefix: " + testContact.getPrefix() );
        
        	System.out.println("Enter the email: ");
        	input = keyboard.nextLine();
        	testContact.setEmail(input);
        
        	System.out.println("Email: " + testContact.getEmail() );
        
        	System.out.println("Enter the street: ");
        	input = keyboard.nextLine();
        	testContact.setStreet(input);
        
        	System.out.println("Street: " + testContact.getStreet() );
        
        	System.out.println("Enter the city: ");
        	input = keyboard.nextLine();
        	testContact.setCity(input);
        	
        	System.out.println("City: " + testContact.getCity() );
        
        	System.out.println("Enter the state: ");
        	input = keyboard.nextLine();
        	testContact.setState(input);
        	
        	System.out.println("State: " + testContact.getState() );
        
        	System.out.println("Enter the occupation: ");
        	input = keyboard.nextLine();
        	testContact.setOccupation(input);
        	
        	System.out.println("Occupation: " + testContact.getOccupation() );
        	
        	System.exit(0);
        }
        
        inputFile = new BufferedReader(new FileReader(contactFile));
        
        //outputFile = new PrintWriter( myFile );
        inputFile.mark(256);
        //do something silly
        while( inputFile.ready() ) {
        	inputString = inputFile.readLine();
        	System.out.println("line " + counter++ + " = " + inputString);
        }
        inputFile.reset();
        
        Stream<String> newStream;
        newStream = inputFile.lines();
        
        newStream.forEach( s -> { System.out.println(s); });
 
        inputFile.close();
        
    }
    
    /**
     * This class is made up of mutators and accessors.
     * @author Ryan Smith
     *
     */
    
    public static class Contact {
        Contact() {
        }
        
        /**
         * This method validifies the last name.
         * @param n
         */
        
        public void setLastName( String n ) {
            
            if( !n.matches("^[A-Za-z]+$") ) {
                System.out.println( "Invalid characters in last name" );
            } else {
                lName = n;
            }
        }
        
        /**
         * This method accesses the last name.
         * @return lname
         */
        public String getLastName() {
            return lName;
        }
        
        /**
         * This method validifies the first name.
         * @param n
         */
        
        public void setFirstName( String n ) {
        	if( !n.matches("^[A-Za-z ' -]+$") ) { //regular expression
                System.out.println( "Invalid characters in first name" );
            } else {
            	fName = n;
            }
        	
        }
        
        /**
         * This method accesses the first name
         * @return fname
         */
        
        public String getFirstName() {
            return fName;
        }
        
        /**
         * This method validifies the middle name.
         * @param n
         */
        
        public void setMiddleName( String n ) {
        	if( !n.matches("^[A-Za-z ' -]+$") ) { //regular expression
                System.out.println( "Invalid characters in middle name" );
            } else {
            	mName = n;
            }
        	
        }
        
        /**
         * This method accesses the middle name.
         * @return mName
         */
        
        public String getMiddleName() {
            return mName;
        }
        
        /**
         * This method validifies the phone number.
         * @param n
         */
        
        public void setPhone( String n ) {
			if(!n.matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$")) { //regular expression
                System.out.println("Invalid characters in phone number");
            } else {
            	phone = n;
            }
            
        }
        
        /**
         * This method accesses the phone number.
         * @return phone
         */
        
        public String getPhone() {
            return phone;
        }
        
        /**
         * This method validifies the prefix.
         * @param n
         */
        
        public void setPrefix(String n) {
			if(!n.matches("^[A-Za-z ' . -]+$") ) { //regular expression
                System.out.println("Invalid characters in prefix");
            } else {
            	prefix = n;
            }
            
        }
        
        /**
         * This method accesses the prefix.
         * @return prefix
         */
        
        public String getPrefix() {
        	return prefix;
        }
        
        /**
         * This method validifies the email.
         * @param n
         */
        
        public void setEmail(String n) { //regular expression
			if(!n.matches("^[A-Za-z ' @ . -]+$")) {
        		System.out.println("Invalid characters in email");
        	} else {
        		email = n;
        	}
        }
        
        /**
         * This method accesses the  email
         * @return email
         */
        
        public String getEmail() {
        	return email;
        }
        
        /**
         * This method validifies the street.
         * @param n
         */
        
        public void setStreet(String n) {
        	if(!n.matches("^[A-Za-z ' . -]+$")) { //regular expression
        		System.out.println("Invalid characters in street name");
        	} else {
        		street = n;
        	}
        	
        }
        
        /**
         * This method accesses the street
         * @return street
         */
        
        public String getStreet() {
        	return street;
        }
        
        /**
         * This method validifies the city.
         * @param n
         */
        
        public void setCity(String n) {
        	if(!n.matches("^[A-Za-z ' . -]+$")) { //regular expression
        		System.out.println("Invalid characters in city name");
        	} else {
        		city = n;
        	}
        }
        
        /**
         * This method accesses the city
         * @return city
         */
        
        public String getCity() {
        	return city;
        }
        
        /**
         * This method validifies the state.
         * @param n
         */
        
        public void setState(String n) {
        	if(!n.matches("^[A-Za-z ' . -]+$")) { //regular expression
        		System.out.println("Invalid characters in state name");
        	} else {
        		state = n;
        	}
        }
        
        /**
         * This method accesses the state
         * @return state
         */
        
        public String getState() {
        	return state;
        }
        
        /**
         * This method validifies the occupation.
         * @param n
         */
        
        public void setOccupation(String n) {
        	if(!n.matches("^[A-Za-z ' . -]+$")) { //regular expression
        		System.out.println("Invalid characters in occupation");
        	} else {
        		occupation = n;
        	}
        }
        
        /**
         * This method accesses the occupation.
         * @return occupation
         */
        
        public String getOccupation() {
        	return occupation;
        }
        /*
         * Name (first, last, middle)
         * Prefix
         * Phone number
         * email
         * address (street, city, state, zip)
         * occupation
        */
        private String lName,fName, mName;
        private String prefix;
        private String phone;
        private String email;
        private String street, city, state, zip;
        private String occupation;
        
        
        
    }
    



}


