package ui;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import model.objects.Fiba;

public class FXListPlayers implements Initializable {

    private Fiba fb;
    private FXController xGUI;
    @FXML
    private StackPane stackPane;
    @FXML
    private JFXTextField txtSearchName;
    @FXML
    private TableView<?> tblVehicle;
    @FXML
    private TableColumn<?, ?> tcName;
    @FXML
    private TableColumn<?, ?> tcTeam;
    @FXML
    private TableColumn<?, ?> tcNumber;
    @FXML
    private TableColumn<?, ?> tcActive;
    @FXML
    private TableColumn<?, ?> tcPoints;

    public FXListPlayers(Fiba fb, FXController xGUI) {
        this.fb = fb;
        this.xGUI = xGUI;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void onSelectPlayer(MouseEvent event) {

    }

    @FXML
    public void onShowAll(ActionEvent event) {

    }
}
