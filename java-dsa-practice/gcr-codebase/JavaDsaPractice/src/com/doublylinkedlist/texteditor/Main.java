package com.doublylinkedlist.texteditor;

public class Main {
	//main method 
    public static void main(String[] args) {

    	//editor node 
        TextEditorHistory editor = new TextEditorHistory();

        //performing operation
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! Java");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello World! Java DS");
        editor.displayCurrentState();
    }
}
