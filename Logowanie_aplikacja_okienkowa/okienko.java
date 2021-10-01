import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.*;

public class okienko extends Application {

    private static final String USERNAME = "root";

    private static final String PASSWORD = "root123";

    private TextField usernameTextField = new TextField();

    private PasswordField passwordField = new PasswordField();

    public static void main(String[] args) {
        System.out.println("Moja pierwsza aplikacja okienkowa");
        launch(args);
    }

        @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Moja pierwsza aplikacja okienkowa");
        Button myFirstButton = new Button("Hello World");
        myFirstButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Kliknięto pierwszy przycisk");
            }
        });

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets( 15, 15, 15, 15));

        gridPane.add(myFirstButton, 0, 0);
        gridPane.setGridLinesVisible(true);

        Button loginButton = new Button("Zaloguj");
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                login();
            }
        });
        gridPane.add(loginButton, 1, 0);
        gridPane.add(usernameTextField, 1, 1);
        gridPane.add(passwordField, 1, 3);

        primaryStage.setScene(new Scene(gridPane, 500, 500));

        primaryStage.show();
    }

    private void login (){
        String usernameText = usernameTextField.getText();
        String passwordText = passwordField.getText();

        if (USERNAME.equals(usernameText) && PASSWORD.equals(passwordText)) {

            System.out.println("Poprawnie");
            JOptionPane.showMessageDialog(null,"Poprawne logowanie");

        } else {

            System.out.println("Niepoprawnie");
            JOptionPane.showMessageDialog(null,"Niepoprawne logowanie");
        }
    }
}

