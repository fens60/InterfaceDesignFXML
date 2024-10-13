package es.ieslosmontecillos.di_t1a1_shanshangfeng;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
public class Controller {
    @FXML
    private Text actiontarget;  //referencia al Text definido en el FXML con fx:id="actiontarget"

    @FXML
    private TextField userNameField;  //campo de nombre de usuario

    @FXML
    private PasswordField passwordField;  //campo de contraseña

    //metodo que maneja el evento del botón "Sign In"
    @FXML
    protected void handleSignInButton() {
        actiontarget.setText("Sign in button pressed");
    }
}
