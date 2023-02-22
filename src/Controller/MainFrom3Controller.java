package Controller;
import Class.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainFrom3Controller implements Initializable {
    public Label pName;
    public Label pScore;


    public void platAgainOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/MainForm.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int a= APlayer.scoreCalculate();
        int b= BPlayer.scoreCalculate();
        if(b<a){
            pName.setText("A");
            pScore.setText(String.valueOf(a));
        }else {
            pName.setText("B");
            pScore.setText(String.valueOf(b));
        }
        APlayer.arrayList.clear();
        BPlayer.arrayList1.clear();
        APlayer.APayerScore=0;
        BPlayer.BPayerScore=0;

    }
}
