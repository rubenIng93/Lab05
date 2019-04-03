package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	private Model model = new Model();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private Button btnCalcolaAnagrammi;

    @FXML
    private TextArea txtRight;

    @FXML
    private TextArea txtMistake;

    @FXML
    private Button btnReset;

    @FXML
    void doCalcolaAnagrammi(ActionEvent event) {

    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtInput.clear();
    	txtRight.clear();
    	txtMistake.clear();    	

    }

    @FXML
    void initialize() {
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcolaAnagrammi != null : "fx:id=\"btnCalcolaAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtRight != null : "fx:id=\"txtRight\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtMistake != null : "fx:id=\"txtMistake\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
    
    public void setModel(Model model) {
    	
    	this.model = model;
    	
    }
}
