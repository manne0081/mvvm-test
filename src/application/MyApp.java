package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/* Zusätzlich eingefügt... */

import javafx.fxml.FXMLLoader;


public class MyApp extends Application {
	/*
	 * Instance-Variables
	 */
	String name;
	String password;
	
	
	/*
	 * Constructor
	 */
	public static void main(String[] args) {
		System.out.println("Text vor dem launch");		
		try {				
			launch(args);			
		} catch (Exception e) {			
			System.out.println(e.getClass());			
		}
		System.out.println("Text nach dem launch");
	}
	
	
	/*
	 * 
	 */	
	@Override
	public void start(Stage primaryStage) throws Exception {
				
		Parent root = FXMLLoader.load(getClass().getResource("MyForm2.fxml"));		
		Scene scene = new Scene(root);	//root, 300, 275
        
		//primaryStage.setMinWidth(600);
		//primaryStage.setMaxWidth(600);
		//primaryStage.setMinHeight(400);
		
		primaryStage.setTitle("FXML Welcome");
		primaryStage.setScene(scene);
		primaryStage.show();
				
	}
}