import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindowController {

    @FXML
    private TableColumn<?, ?> anredeCol;

    @FXML
    private TableColumn<?, ?> anzahlCol;

    @FXML
    private TableColumn<?, ?> beschreibungCol;

    @FXML
    private TableColumn<?, ?> bezeichnungCol;

    @FXML
    private TextField bezeichnungInputTxt;

    @FXML
    private Button changesBtn;

    @FXML
    private Button changesBtn1;

    @FXML
    private TableColumn<?, ?> emailCol;

    @FXML
    private Tab gebuchteLeistungenTab;

    @FXML
    private TableColumn<?, ?> hausnummerCol;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> komtaktpersonCol;

    @FXML
    private TextField kontaktpersonInputTxt;

    @FXML
    private Tab kundeTab;

    @FXML
    private TableColumn<?, ?> landCol;

    @FXML
    private TableView<?> leistungTVW;

    @FXML
    private TableView<?> leistungTVW1;

    @FXML
    private Tab leistungTab;

    @FXML
    private Tab leistungTab1;

    @FXML
    private Button leistunghinzufuegenBtn;

    @FXML
    private TextField leistungsbezeichnungInputTxt;

    @FXML
    private static MenuBar menuBarMain;

    @FXML
    private TableColumn<?, ?> ortCol;

    @FXML
    private TextField ortInputTxt;

    @FXML
    private TableColumn<?, ?> plzCol;

    @FXML
    private TextField plzInputTxt;

    @FXML
    private Button rechnungStornoBtn;

    @FXML
    private TextField rechnungsnummerInputTxt;

    @FXML
    private TableColumn<?, ?> straßeCol;

    @FXML
    private TextField straßeInputTxt;

    @FXML
    private TabPane tabPaneMain;

    @FXML
    private TableColumn<?, ?> telefonCol;

    @FXML
    private TableColumn<?, ?> uidCol;

    @FXML
    private TextField uidInputTxt;

    @FXML
    private AnchorPane root;

    @FXML
    private VBox rootvBox;

    @FXML
    void leistunghinzufuegenBtnPressed(ActionEvent event) {

    }

    public void Init(){
        rootvBox.prefWidthProperty().bind(root.prefWidthProperty());
    }

}
