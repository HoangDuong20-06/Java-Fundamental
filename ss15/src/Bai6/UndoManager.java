package Bai6;

public class UndoManager {

    public InputAction[] undoStack;
    public int top;
    public int maxUndoSteps;

    public UndoManager(int maxUndoSteps){

        this.maxUndoSteps = maxUndoSteps;
        undoStack = new InputAction[maxUndoSteps];
        top = -1;
    }

    public void addAction(InputAction action){

        if(top < maxUndoSteps - 1){
            top++;
            undoStack[top] = action;
        }
    }

    public InputAction undo(){

        if(top == -1){
            return null;
        }

        InputAction a = undoStack[top];
        top--;

        return a;
    }
}