package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * Description: 
 * 
 * @author manuel.schmidt
 *
 */
public class MyView2 {
	
	/* View-Fields */
	@FXML private Label lblHeadline;
	@FXML private TextField txtInput;
	@FXML private Button btnChange;
	@FXML private Button btnClear;
		
	
	/* bind View-Model */
	MyViewModel2 viewModel = new MyViewModel2();
	
	
	/* bind View-Model-Fields */
	public void initialize() {
	  	txtInput.textProperty().bindBidirectional(viewModel.txtInputProperty());
		lblHeadline.textProperty().bindBidirectional(viewModel.lblHeadlineProperty());
	  	//btnSubmit.disabledProperty().bindBidirectional(viewModel.btnSubmit());
	}
	
	
	@FXML
	protected void onKeyPressed(KeyEvent event) { 
		//System.out.println(event.getCode());
		viewModel.takePressedKey(event);
	}
	
	
	@FXML protected void handleChange() {
		viewModel.handleChange();
	}
	
	
	@FXML protected void handleClear() {
		viewModel.handleClear("View => Function handleClear!");
	}
	
	
	
	
	
}
