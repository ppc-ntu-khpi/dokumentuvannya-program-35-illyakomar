package domain;
/**
 * Editor of the company
 * @author i-kom
 */
public class Editor extends Artist {

    /**
     * Constructor with information of editor
     * @param electronicEditing denote whether the editor can perform electronic editing
     * @param skiils skills of the editor
     * @param name name of the editor
     * @param jobTitle job title of the editor
     * @param level level of the editor
     * @param dept department of the editor
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Constructor with incomplete information about the editor
     * @param electronicEditing denote whether the editor can perform electronic editing
     * @param skiils skills of the editor 
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Constructor with only information about electronic editing
     * @param electronicEditing denote whether the editor can perform electronic editing or not
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Constructor for the editor
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    
    /**
     * Method that returns information about the editor
     * @return string with editor information
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    
    /**
     * Method that returns preferences of the editor
     * @return preferences of the editor 
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    
    /**
     * Method that appoint preferences to the editor
     * @param electronic whether the editor can perform electronic editing
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
