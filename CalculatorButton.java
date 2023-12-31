import javax.swing.JButton;

public class CalculatorButton extends JButton {
    
    // A CalculatorButton has a type
    private Button type;

    public CalculatorButton(String text, String button){
        // Give the text to the super class' constructor
        super(text);

        // Assign the type based on the second parameter
        switch(button){
            case "number": type = Button.NUMBER;
            break;
            case "operation" : type = Button.OPERATION;
            break;
            case "function": type = Button.FUNCTION;
            break;
        }
    }

    // Return the type
    public Button getType(){
        return type;
    }

}
