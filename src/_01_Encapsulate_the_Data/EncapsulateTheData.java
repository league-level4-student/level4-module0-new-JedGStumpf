package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;

	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */


	private double degreesTurned;

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;
	
	public void setItemsReceived(int randomPositive) {
		if (randomPositive < 0) {
			this.itemsReceived = 0;
		}
		else if (randomPositive > 360) {
			this.itemsReceived = 360;
		} else {
			this.itemsReceived = randomPositive;
		}
	}
	
	int getItemsReceived() {
		return itemsReceived;
	}
	
	public void setDegreesTurned(double randomDouble) {
		if (randomDouble < 0) {
			this.degreesTurned = 0;
		}
		else if (randomDouble > 360) {
			this.degreesTurned = 360;
		} else {
			this.degreesTurned = randomDouble;
		}
	}
	
	double getDegreesTurned() {
		return degreesTurned;
	}
	
	public void setNomenclature(String inputString) {
		this.nomenclature = inputString;
		if (inputString.length() == 0) {
			this.nomenclature = " ";
		}

	}
	
	String getNomenclature() {
		return nomenclature;
	}
	
	public void setMemberObj(Object member) {
		this.memberObj = member;
		if (member instanceof String) {
			this.memberObj = new Object();
			
		}
	}
	
	Object getMemberObj() {
		return memberObj;
	}
	

}
