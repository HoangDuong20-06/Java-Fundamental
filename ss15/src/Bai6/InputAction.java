package Bai6;

public class InputAction {

    public String fieldName;
    public String oldValue;
    public String newValue;
    public String actionTime;

    public InputAction(String fieldName,String oldValue,String newValue,String actionTime){

        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    public void display(){
        System.out.println(fieldName + ": " + oldValue + " -> " + newValue + " (" + actionTime + ")");
    }
}