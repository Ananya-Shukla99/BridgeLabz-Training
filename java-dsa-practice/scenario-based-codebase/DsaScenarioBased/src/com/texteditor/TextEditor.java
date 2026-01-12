package com.texteditor;

import java.util.Stack;

public class TextEditor {

	// creating stack
	Stack<String> st = new Stack<>();
	Stack<String> st2 = new Stack<>();

	String text = "";

	// insert into stack
	public void addText(String s) {
		st.push(s);
		text+=s;
		System.out.println(text);
		System.out.println("Added text");
		
	}

	// delete from stack
	public void removeText() {
		if (st.isEmpty()) {
			System.out.println("No text to remove");
			return;
		}
		else {
			String str=st.pop();
			st2.push(str);
			text=text.substring(0, text.length()-str.length());
			System.out.println(text);
			System.out.println("Text is removed");
		}

	}
	
	// undo previous action
	public void undo() {
		if (st.isEmpty()) {
			System.out.println("No text to undo");
			return;
		} 
		else {
			String last=st.pop();
			st2.push(last);
			text=text.substring(0, text.length()-last.length());
			System.out.println(text);
			
		}
	}

	// re do the previous action
	public void redo() {
		if (st2.isEmpty()) {
			System.out.println("No action to be re-done");
		} 
		else {
			String last = st2.pop();
			st.push(last);
			text+=last;
			System.out.println(text);
			
		}
	}
	//text formatted
		public void formatPage() {
			st.clear();
			st.clear();
			text=" ";
			System.out.println(text);
			System.out.println("Text clear ");
		}

}
