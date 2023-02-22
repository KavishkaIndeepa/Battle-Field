package Controller;
import Class.*;

import com.jfoenix.controls.JFXCheckBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainForm2Controller {

    public Label labPA;
    public JFXCheckBox JFW1;
    public JFXCheckBox JFW2;
    public JFXCheckBox JFW3;
    public JFXCheckBox JFW4;
    public JFXCheckBox JFW5;

    public Label labPB;
    public JFXCheckBox JFB1;
    public JFXCheckBox JFB2;
    public JFXCheckBox JFB3;
    public JFXCheckBox JFB4;
    public JFXCheckBox JFB5;

    public void battleStartOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/MainFrom3.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void t56OnActionA(ActionEvent actionEvent) {
        Weapon t56= new T56();
        int tempStoreData = t56.getScore();
        if (JFW1.isSelected()) {
            countA++;
            t56.shoot();
            APlayer.setValue(t56.getScore());
            tempStoreData = t56.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + APlayer.arrayList.indexOf(tempStoreData));
            APlayer.arrayList.remove(APlayer.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();


    }



    public void tankAOnAction(ActionEvent actionEvent) {
        Weapon tank=new Tank();
        int tempStoreData = tank.getScore();
        if (JFW2.isSelected()) {
            countA++;
            tank.shoot();
            APlayer.setValue(tank.getScore());
            tempStoreData = tank.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + APlayer.arrayList.indexOf(tempStoreData));
            APlayer.arrayList.remove(APlayer.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();
    }

    public void multiAOnAction(ActionEvent actionEvent) {
        Weapon multi = new MultiBarrel();
        int tempStoreData = multi.getScore();
        if (JFW3.isSelected()) {
            countA++;
            multi.shoot();
            APlayer.setValue(multi.getScore());
            tempStoreData = multi.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + APlayer.arrayList.indexOf(tempStoreData));
            APlayer.arrayList.remove(APlayer.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();
    }

    public void pistolAOnAction(ActionEvent actionEvent) {
        Weapon pistol=new Pistol();
        int tempStoreData = pistol.getScore();
        if (JFW4.isSelected()) {
            countA++;
            pistol.shoot();
            APlayer.setValue(pistol.getScore());
            tempStoreData = pistol.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + APlayer.arrayList.indexOf(tempStoreData));
            APlayer.arrayList.remove(APlayer.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();
    }

    public void bombAOnAction(ActionEvent actionEvent) {
        Weapon bomb=new Bomb();
        int tempStoreData = bomb.getScore();
        if (JFW5.isSelected()) {
            countA++;
            bomb.shoot();
            APlayer.setValue(bomb.getScore());
            tempStoreData = bomb.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + APlayer.arrayList.indexOf(tempStoreData));
            APlayer.arrayList.remove(APlayer.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();
    }

    public void t56BOnAction(ActionEvent actionEvent) {
        Weapon t56B = new T56();
        int tempStoreData = t56B.getScore();
        if (JFB1.isSelected()) {
            countB++;
            t56B.shoot();
            BPlayer.setValue(t56B.getScore());
            tempStoreData = t56B.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + BPlayer.arrayList1.indexOf(tempStoreData));
            BPlayer.arrayList1.remove(BPlayer.arrayList1.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

    public void tankBOnAction(ActionEvent actionEvent) {
        Weapon tankB = new Tank();
        int tempStoreData = tankB.getScore();
        if (JFB2.isSelected()) {
            countB++;
            tankB.shoot();
            BPlayer.setValue(tankB.getScore());
            tempStoreData = tankB.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + BPlayer.arrayList1.indexOf(tempStoreData));
            BPlayer.arrayList1.remove(BPlayer.arrayList1.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

    public void multiBOnAction(ActionEvent actionEvent) {
        Weapon multiB =new MultiBarrel();
        int tempStoreData = multiB.getScore();
        if (JFB3.isSelected()) {
            countB++;
            multiB.shoot();
            BPlayer.setValue(multiB.getScore());
            tempStoreData = multiB.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + BPlayer.arrayList1.indexOf(tempStoreData));
            BPlayer.arrayList1.remove(BPlayer.arrayList1.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

    public void pistolBOnAction(ActionEvent actionEvent) {
        Weapon pistolB = new Pistol();
        int tempStoreData = pistolB.getScore();
        if (JFB4.isSelected()) {
            countB++;
            pistolB.shoot();
            BPlayer.setValue(pistolB.getScore());
            tempStoreData = pistolB.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + BPlayer.arrayList1.indexOf(tempStoreData));
            BPlayer.arrayList1.remove(BPlayer.arrayList1.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

    public void bombBOnAction(ActionEvent actionEvent) {
        Weapon bombB=new Bomb();
        int tempStoreData = bombB.getScore();
        if (JFB5.isSelected()) {
            countB++;
            bombB.shoot();
            BPlayer.setValue(bombB.getScore());
            tempStoreData = bombB.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + BPlayer.arrayList1.indexOf(tempStoreData));
            BPlayer.arrayList1.remove(BPlayer.arrayList1.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();

    }
     int countA;
     int countB;
    public void disableCheckBox(){

        System.out.println(countA);
        if (countA==3){
            if (JFW1.isSelected()){
                JFW1.setDisable(false);
            }else {
                JFW1.setDisable(true);
            }
            if (JFW2.isSelected()){
                JFW2.setDisable(false);
            }else {
                JFW2.setDisable(true);
            }
            if(JFW3.isSelected()){
                JFW3.setDisable(false);
            }else {
                JFW3.setDisable(true);
            }
            if (JFW4.isSelected()){
                JFW4.setDisable(false);
            }else {
                JFW4.setDisable(true);
            }
            if(JFW5.isSelected()){
                JFW5.setDisable(false);
            }else {
                JFW5.setDisable(true);
            }

        }else {
            JFW1.setDisable(false);
            JFW2.setDisable(false);
            JFW3.setDisable(false);
            JFW4.setDisable(false);
            JFW5.setDisable(false);
        }

        System.out.println(countB);
        if (countB==3){
            if (JFB1.isSelected()){
                JFB1.setDisable(false);
            }else {
                JFB1.setDisable(true);
            }
            if (JFB2.isSelected()){
                JFB2.setDisable(false);
            }else {
                JFB2.setDisable(true);
            }
            if(JFB3.isSelected()){
                JFB3.setDisable(false);
            }else {
                JFB3.setDisable(true);
            }
            if (JFB4.isSelected()){
                JFW4.setDisable(false);
            }else {
                JFB4.setDisable(true);
            }
            if(JFB5.isSelected()){
                JFB5.setDisable(false);
            }else {
                JFB5.setDisable(true);
            }
        }else {
            JFB1.setDisable(false);
            JFB2.setDisable(false);
            JFB3.setDisable(false);
            JFB4.setDisable(false);
            JFB5.setDisable(false);
        }
    }
}
