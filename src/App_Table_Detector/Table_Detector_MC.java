package App_Table_Detector;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Table_Detector_MC extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Scene sc = new Scene(FXMLLoader.load(getClass().getResource("/App_Table_Detector/FXML_Files/Welcome.fxml")));

            stage.setTitle("Table Detector - Welcome");
            stage.setScene(sc);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Table Detector");
            error.setContentText("Error loading the file. \nCould not find the file.");
            error.showAndWait();
        }
    }

}