import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxProject extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage){
		BorderPane border = new BorderPane();
			 VBox top = new VBox();
			 Button bOne = new Button("Home View");
			 Button bTwo = new Button("Author");
			 Button bThree = new Button("Game");
			 Button bFour = new Button("Author2");
			 top.getChildren().add(bOne);
			 top.getChildren().add(bTwo);
			 top.getChildren().add(bThree);
			 top.getChildren().add(bFour);
			 top.setBorder(Border.EMPTY);
			 border.setTop(top);
	
		primaryStage.setTitle("Java Project");
		Scene home_view = new Scene(border,600,500);
		primaryStage.setScene(home_view);
		primaryStage.show();
	}


}
