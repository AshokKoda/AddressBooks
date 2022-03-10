package com.bridgelabz.controller;

import com.bridgelabz.services.AddressBookService;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("<-------------Welcome To Address Book----------------->");
		
		AddressBookService services = new AddressBookService();
		System.out.println("Create New Contact");
		services.createContact(null);
		services.editContact();
		services.deleteContactByName();

	}

}
