import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }
	
public void addContact(Contact c){
	
	
	//public int numContacts(){
	//	return contacts.length;
	//}
		
	public int haveContact(String s){
		for(int i = 0; i<numfriends; i++){
			friends[i].printContact();
	}
	public int numContacts(){
		return numfriends;
	}
		
		
	public int deleteContact(){
		int position = haveContact(s);
		
public static void main (String args[]){
	Scanner scan = new Scanner(System.in);
	Addressbook blackbook = new Addressbook();
	menu();	//call the main method
	int choice = scan.nextInt;
	while choice != 5{
		if(choice == 1){
			if(blackbook.numContacts() < 10);
	
public static void menu(){
	System.out.print("Enter the number");
	System.out.print("1. Add Contact" /n "2. Delete Contact" /n "Print Number of Friends" /n "Print Output Info" /n "5. Quit");
		
//if(Friends[i].getName().equals(s)){
