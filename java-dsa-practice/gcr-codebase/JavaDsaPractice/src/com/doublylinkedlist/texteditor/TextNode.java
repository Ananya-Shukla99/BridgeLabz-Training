package com.doublylinkedlist.texteditor;

class TextNode {
	//attributes
    String content;
    TextNode prev;
    TextNode next;

    //constructor
    TextNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
