package controller;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class DepartmentFormController implements Initializable {

	@FXML
	private TextField txtId;
	@FXML
	private TextField txtName;
	@FXML
	private Label labelErrorName;
	@FXML
	private Button btSave;
	@FXML
	private Button btCancel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNodes();
	}

	@FXML
	private void onBtSaveAction(ActionEvent event) {
		System.err.println("onBtSaveAction");
	}

	@FXML
	private void onBtCancelAction(ActionEvent event) {
		System.err.println("onBtCancelAction");
	}
private  void initializeNodes() {
	Constraints.setTextFieldInteger(txtId);
	Constraints.setTextFieldMaxLength(txtName, 30);
}
}