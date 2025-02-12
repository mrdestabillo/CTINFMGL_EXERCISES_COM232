//import java.awt.Label;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

@FXML
Label usernameLabel;

@FXML
Label passwordLabel;

@FXML
TextField usernameTextField;

@FXML
TextField passwordTextField;

@FXML
Button loginButton;

private Stage stage;
private Scene scene;
private Parent root;

public void loginButtonHandler(ActionEvent event) throws IOException{
    //System.out.println("WELCOME TO MY APP!!!");

    String username = usernameTextField.getText();
    String password = passwordTextField.getText();

    System.out.println("username: " + username);
    System.out.println("password: " + password);

    if (DatabaseHandler.validateLogin(username, password)) {
        System.out.println("Login successful");
    }
    else 
    {
        System.out.println("Login unsuccessful :( ");
    }
}  
}
