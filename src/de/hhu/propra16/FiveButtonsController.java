package de.hhu.propra16;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import java.time.LocalDate;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {

    public void exit() {
       Platform.exit();
    }

    @FXML
    Label dateLabel;

    public void showDate() {
        dateLabel.setText(LocalDate.now().toString());
    }

    public void alert(){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Help");
            alert.setHeaderText(null);
            alert.setContentText("too many buttons");
            alert.showAndWait();

        }
}
