package Übungen;

import javafx.stage.Stage;

public class AnwendersystemControl {
	private AnwendersystemModel anwModel;
	private AnwendersystemView anwView;
	
	
	public AnwendersystemControl(Stage primaryStage) {
		this.anwModel = new AnwendersystemModel();
		this.anwView = new AnwendersystemView(this, primaryStage, anwModel);
	}

	
}
