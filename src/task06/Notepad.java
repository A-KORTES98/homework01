package task06;

import java.util.ArrayList;

/**
 * Created by anton on 22.09.17.
 */

/**
 * This class provide functionality:
 * appending notes,
 * editing notes,
 * removing notes,
 * showing notes in console.
 * @author Anton Mazur
 * @since 1.0
 */
public class Notepad {

    /**
     * Storage for notes
     */
    private ArrayList<String> notes;

    /**
     * Constructs an empty ArrayList for notes
     */
    Notepad(){
        notes = new ArrayList<String>();
    }

    /**
     * Constructs a ArrayList containing the specified string
     *
     * @param note string that append in ArrayList
     */
    Notepad(String note){
        this();
        addNote(note);
    }

    /**
     * Appends the specified string in ArrayList
     *
     * @param note string that append in ArrayList
     */
    public void addNote(String note){
        notes.add(note);
    }

    /**
     * Removes note with specified index in ArrayList
     *
     * @param index of removing string
     * @return removing string
     */
    public String removeNote(int index){
        return notes.remove(index);
    }

    /**
     * Outputs all content of ArrayList
     */
    public void showNotes(){
        notes.forEach(x -> System.out.println(x));
    }

    /**
     * Substitutes the note with specified index on another note
     *
     * @param index of substituting note
     * @param note new note
     */
    public void editNote(int index, String note){
        notes.set(index, note);
    }

}
