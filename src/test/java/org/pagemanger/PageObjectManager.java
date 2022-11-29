package org.pagemanger;

import org.pageobject.ContactUs_Page;
import org.pageobject.Home_Page;


public class PageObjectManager {
	private Home_Page home_Page;
	private ContactUs_Page contactUs_Page;
	

	public Home_Page getHome_Page() {
		return (home_Page == null) ? home_Page = new Home_Page() : home_Page;
		}
	public ContactUs_Page getContactUs_Page() {
		return (contactUs_Page == null) ? contactUs_Page = new ContactUs_Page() : contactUs_Page;
	}
		
}
