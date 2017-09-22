import java.util.ArrayList;

/**
 * Created by anton on 22.09.17.
 */
public class Notepad {
    private ArrayList<String> notes;
    Notepad(){
        notes = new ArrayList<String>();
    }

    Notepad(String note){
        this();
        addNote(note);
    }

    public void addNote(String note){
        notes.add(note);
    }

    public String removeNote(int index){
        return notes.remove(index);
    }

    public void showNotes(){
        notes.forEach(x -> System.out.println(x));
    }

    public void editNote(int index, String note){
        notes.set(index, note);
    }

}
