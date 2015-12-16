/**
 * 
 */

/**
 * @author SJHSStudent
 *
 */

/**
		 * This class is made up of mutators and accessors.
		 * 
		 * @author Ryan Smith
		 *
		 */
public class Contact {
	Contact() {
	}

	/**
	 * This method validifies the last name.
	 * 
	 * @param n
	 */

	public void setLastName(String n) {

		if (!n.matches("^[A-Za-z]+$")) {
			System.out.println("Invalid characters in last name");
		} else {
			lName = n;
		}
	}

	/**
	 * This method accesses the last name.
	 * 
	 * @return lname
	 */
	public String getLastName() {
		return lName;
	}

	/**
	 * This method validifies the first name.
	 * 
	 * @param n
	 */

	public void setFirstName(String n) {
		if (!n.matches("^[A-Za-z ' -]+$")) { // regular expression
			System.out.println("Invalid characters in first name");
		} else {
			fName = n;
		}

	}

	/**
	 * This method accesses the first name
	 * 
	 * @return fname
	 */

	public String getFirstName() {
		return fName;
	}

	/**
	 * This method validifies the middle name.
	 * 
	 * @param n
	 */

	public void setMiddleName(String n) {
		if (!n.matches("^[A-Za-z ' -]+$")) { // regular expression
			System.out.println("Invalid characters in middle name");
		} else {
			mName = n;
		}

	}

	/**
	 * This method accesses the middle name.
	 * 
	 * @return mName
	 */

	public String getMiddleName() {
		return mName;
	}

	/**
	 * This method validifies the phone number.
	 * 
	 * @param n
	 */

	public void setPhone(String n) {
		if (!n.matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$")) { // regular
															// expression
			System.out.println("Invalid characters in phone number");
		} else {
			phone = n;
		}

	}

	/**
	 * This method accesses the phone number.
	 * 
	 * @return phone
	 */

	public String getPhone() {
		return phone;
	}

	/**
	 * This method validifies the prefix.
	 * 
	 * @param n
	 */

	public void setPrefix(String n) {
		if (!n.matches("^[A-Za-z ' . -]+$")) { // regular expression
			System.out.println("Invalid characters in prefix");
		} else {
			prefix = n;
		}

	}

	/**
	 * This method accesses the prefix.
	 * 
	 * @return prefix
	 */

	public String getPrefix() {
		return prefix;
	}

	/**
	 * This method validifies the email.
	 * 
	 * @param n
	 */

	public void setEmail(String n) { // regular expression
		if (!n.matches("^[A-Za-z ' @ . -]+$")) {
			System.out.println("Invalid characters in email");
		} else {
			email = n;
		}
	}

	/**
	 * This method accesses the email
	 * 
	 * @return email
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * This method validifies the street.
	 * 
	 * @param n
	 */

	public void setStreet(String n) {
		if (!n.matches("^[A-Za-z ' . -]+$")) { // regular expression
			System.out.println("Invalid characters in street name");
		} else {
			street = n;
		}

	}

	/**
	 * This method accesses the street
	 * 
	 * @return street
	 */

	public String getStreet() {
		return street;
	}

	/**
	 * This method validifies the city.
	 * 
	 * @param n
	 */

	public void setCity(String n) {
		if (!n.matches("^[A-Za-z ' . -]+$")) { // regular expression
			System.out.println("Invalid characters in city name");
		} else {
			city = n;
		}
	}

	/**
	 * This method accesses the city
	 * 
	 * @return city
	 */

	public String getCity() {
		return city;
	}

	/**
	 * This method validifies the state.
	 * 
	 * @param n
	 */

	public void setState(String n) {
		if (!n.matches("^[A-Za-z ' . -]+$")) { // regular expression
			System.out.println("Invalid characters in state name");
		} else {
			state = n;
		}
	}

	/**
	 * This method accesses the state
	 * 
	 * @return state
	 */

	public String getState() {
		return state;
	}

	/**
	 * This method validifies the occupation.
	 * 
	 * @param n
	 */

	public void setOccupation(String n) {
		if (!n.matches("^[A-Za-z ' . -]+$")) { // regular expression
			System.out.println("Invalid characters in occupation");
		} else {
			occupation = n;
		}
	}

	/**
	 * This method accesses the occupation.
	 * 
	 * @return occupation
	 */

	public String getOccupation() {
		return occupation;
	}

	/*
	 * Name (first, last, middle) Prefix Phone number email address
	 * (street, city, state, zip) occupation
	 */
	private String lName, fName, mName;
	private String prefix;
	private String phone;
	private String email;
	private String street, city, state, zip;
	private String occupation;

}

