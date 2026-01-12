package com.browserbuddy;

import java.util.Stack;

public class Browser {

	private Stack<Tab> closedTab;

	// constructor
	public Browser() {
		closedTab = new Stack<>();
	}

	// closed method
	public void closeTab(Tab tab) {
		closedTab.push(tab);

		System.out.println("Tab Closed");
		System.out.println("Tab name " + tab.name);
	}

	// reopen tab
	public Tab reopenTab() {
		if (closedTab.isEmpty()) {
			System.out.println("No closed tabs to reopen");
			return null;
		}

		Tab restoredTab = closedTab.pop();

		System.out.println("TAB RESTORED");
		System.out.println("Tab Name : " + restoredTab.name);

		return restoredTab;
	}

	public static void main(String[] args) {

		Browser browser = new Browser();

		// Pages
		Page oops = new Page("OOPS in Java");
		Page encapsulation = new Page("Encapsulation in Java");
		Page inheritance = new Page("Inheritance in Java");
		Page abstraction = new Page("Abstraction in Java");
		Page polymorphism = new Page("Polymorphism in Java");

		// Tabs
		Tab javaTab = new Tab("Java OOPS");
		Tab advancedTab = new Tab("Advanced OOPS");

		// Tab 1 activity
		System.out.println("Opening Tab: " + javaTab.name);
		javaTab.add(oops);
		javaTab.add(encapsulation);
		javaTab.add(inheritance);
		

		javaTab.moveBackward();
		System.out.println("Current Page: " + javaTab.curr);

		// Tab 2 activity
		System.out.println("Opening Tab: " + advancedTab.name);
		advancedTab.add(abstraction);
		advancedTab.add(polymorphism);

		// Display history
		System.out.println("Browsing History");
		javaTab.displayHistory();
		advancedTab.displayHistory();

		// Close & restore
		browser.closeTab(javaTab);

		Tab restoredTab = browser.reopenTab();
		if (restoredTab != null) {
			System.out.println("Restored Tab History");
			restoredTab.displayHistory();
		}
	}

}
