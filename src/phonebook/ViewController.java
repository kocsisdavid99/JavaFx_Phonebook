
package phonebook;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class ViewController implements Initializable {
    
    @FXML
    TableView table;
    
    @FXML
    TextField inputLastname;
    
    @FXML
    TextField inputFirstName;
    
    @FXML
    TextField inputEmail;
    
    @FXML
    Button addNewContactButton;
    
    @FXML
    StackPane menuPane;
    
    @FXML
    Pane contactPane;
    
    @FXML
    Pane exportPane;
    
    private final ObservableList<Person> data =
           FXCollections.observableArrayList(
            new Person("Szabó", "Gyula", "dasd"),
            new Person("Bourne", "Jason", "fasf"),
            new Person("Scott", "Michael", "asfasf"));

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TableColumn lastNameCol = new TableColumn("Vezetéknév");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        
        TableColumn firstNameCol = new TableColumn("Keresztnév");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        
        TableColumn emailCol = new TableColumn("Email cím");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        
        table.getColumns().addAll(lastNameCol, firstNameCol, emailCol);
        table.setItems(data);
        
       
        
    }    
    
}
