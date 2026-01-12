package com.texteditor;

public class Main {

	public static void main(String []args) {
		
		//creating text editor
		TextEditor t =new TextEditor();
		
		//performing action and displaying the manipulation
		t.addText("Hello ");
		t.addText("World ");
		t.addText("This ");
		t.addText("is ");
		t.addText("a ");
		t.addText("java ");
		t.addText("program ");
		t.addText("to ");
		t.addText("implement ");
		t.addText("stack ");
		t.addText("and ");
		t.addText("perform ");
		t.addText("undo ");
		t.addText("and remove ");
		t.addText("operation ");
		
		t.removeText();
		t.redo();
	    t.removeText();
	    
	    t.undo();
	    t.redo();
	    
	    t.undo();
	    t.undo();
	    t.undo();
	}
	
}
