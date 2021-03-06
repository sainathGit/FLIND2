package com.hsbc.notes;

import java.util.*;

/**
 * This class is to store the notes, and to display the text note as well as
 * text and image notes.
 * 
 * @author nikhil
 *
 */
public class NoteStore implements NoteStoreInterface {

	private List<TextNote> listOfTextNote;
	private List<TextAndImageNote> listOfTextAndImageNote;

	/**
	 * This is the default constructor. This initializes the two Lists which
	 * contains the list of text notes and list of image and text notes.
	 * 
	 */
	public NoteStore() {
		super();
		listOfTextNote = new ArrayList<>();
		listOfTextAndImageNote = new ArrayList<>();
	}

	/**
	 * This is the parameterized constructor. This will take in a list of text note
	 * and list of image and text note and assign it to the variables inside the
	 * class.
	 * 
	 * @param listOfTextNote         : This is the list of text note
	 * @param listOfTextAndImageNote : This is the list of image and text note.
	 */
	public NoteStore(List<TextNote> listOfTextNote, List<TextAndImageNote> listOfTextAndImageNote) {
		this();
		this.listOfTextNote = listOfTextNote;
		this.listOfTextAndImageNote = listOfTextAndImageNote;
	}

	/**
	 * This method store the text in Text Note.
	 * 
	 * @param text : The text which needs to be stored.
	 */
	public void storeNote(String text) {
		TextNote t = new TextNote(text);
		listOfTextNote.add(t);
	}

	/**
	 * This method store the image and text note in Text and Image note.
	 * 
	 * @param text       : The text which needs to be stored.
	 * @param urlOfImage : The url of the image which needs to be stored.
	 */
	public void storeNote(String text, String urlOfImage) {
		TextAndImageNote t = new TextAndImageNote(text, urlOfImage);
		listOfTextAndImageNote.add(t);
	}

	/**
	 * This method returns all the text notes stored till the time when the method
	 * is called.
	 * 
	 */
	public List<TextNote> getAllTextNotes() {
		return this.listOfTextNote;
	}

	/**
	 * This method returns all the text and image notes stored till the time when
	 * the method is called.
	 * 
	 */

	public List<TextAndImageNote> getAllTextAndImageNotes() {
		return this.listOfTextAndImageNote;
	}

}
