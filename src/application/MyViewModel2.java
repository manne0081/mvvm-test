package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * Description:
 * 
 * @param 
 * @param
 * @return 
 * @author manuel.schmidt
 *
 */
public class MyViewModel2 {
	
	/* Instance-Variables */
	private String pressedKeys = "";
	
	
	/* Property-Variables */
	private StringProperty lblHeadline = new SimpleStringProperty();
	private StringProperty txtInput = new SimpleStringProperty();
	private DoubleProperty test = new SimpleDoubleProperty();
	
	
	public MyViewModel2() {
	    //setHeadline("Label");
	}
	
	
	/* Getter */
	public final String getTxtInput() { return txtInputProperty().get(); }
	public final String getLblHeadline() { return lblHeadlineProperty().get(); }

	
	/* Setter */
	public final void setTxtInput(String value) { txtInput.set(value);}
	public final void setHeadline(String value) { lblHeadline.set(value); }
	
	
	/*
	 * Property-Accessors > Getter for the Property itself 
	 * Getter für das View!
	 */
	public StringProperty txtInputProperty() { return txtInput;	}
	public StringProperty lblHeadlineProperty() { return lblHeadline; }
	
		
	/* Methods */
	public void takePressedKey(KeyEvent event) {
	    
		//String keyCode = event.getCode().getName();
	    System.out.println("test");
		
	    setHeadline(getTxtInput());
		
		
		/*
		switch (keyCode) {
			case "Enter": 
				//System.out.println("Enter");
				setHeadline(pressedKeys.toUpperCase());
			    //handleChange();
				break;
			case "Backspace":			    
				//System.out.println("Backspace");				
				int laenge = pressedKeys.length() - 1;
				if (laenge + 1 <= 0) {
				    setHeadline("");
				} else {
    				pressedKeys = pressedKeys.substring(0, laenge);
				}
				break;
			default:
				//System.out.println("default");
				this.pressedKeys += event.getText();		
		}
		*/				
	}
	
	public void handleChange() {
	    //System.out.println("ViewModel => Method: handleChange");
	    setHeadline(getTxtInput().toUpperCase());
	    //this.pressedKeys = "";
	}
	
	public void handleClear(String str) {
	    setTxtInput("");
	    setHeadline("");
	    this.pressedKeys = "";
	}
	
	
}
