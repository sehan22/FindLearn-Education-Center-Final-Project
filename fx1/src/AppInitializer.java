import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/apexeducationcenter/view/ApexLoginForm.fxml"))));
        primaryStage.setTitle("Apex Education System");

        Image image = new Image("/lk/ijse/apexeducationcenter/assets/images/Apexlogo-1.png");
        primaryStage.getIcons().add(image);
        primaryStage.centerOnScreen();
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }
}