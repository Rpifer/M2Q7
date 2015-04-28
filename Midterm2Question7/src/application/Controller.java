package application;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class Controller
{
	@FXML
	private Button help;
	@FXML
	private Button OK;
	@FXML
	private PasswordField pass;
	@FXML
	private Label message;
	
	public void OK(){
		if (!pass.getText().equals("bugaboo")) {
            message.setText("Your password is incorrect!");
        } else {
            message.setText("That password is correct!");
        }
        pass.clear();
	}
	public void HELP(){
		message.setText("Help has been clicked");
	}
}
