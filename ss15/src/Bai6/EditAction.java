package Bai6;

public class EditAction {

    public String description;
    public String editedBy;
    public String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    public void display() {
        System.out.println(description + " - " + editedBy + " - " + editTime);
    }
}