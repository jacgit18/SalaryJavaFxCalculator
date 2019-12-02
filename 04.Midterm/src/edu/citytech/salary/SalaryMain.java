package edu.citytech.salary;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SalaryMain extends Application {

	public static void main(String[] args) {
		Application.launch(SalaryMain.class, args);
	}


	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.
				load(getClass().
						getResource("Mid.fxml"));
		stage.setTitle("Weekly Salary");
		Scene scene = new Scene(root);
		stage.setScene(scene);

		URL url = getClass().getResource("Mid.css");
		if(url == null) {
			System.out.println("Resources not found Aborting");
			System.exit(-1);
		}
		
		
		
		String css = url .toExternalForm();
		scene.getStylesheets().add(css);
	
			stage.show();

			
			
		
		
		
		
		

			

		
	}

}