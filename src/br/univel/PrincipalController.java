package br.univel;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

	public class PrincipalController {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtCodigo;

	    @FXML
	    private TextField txtNome;

	    @FXML
	    void salvar(ActionEvent event) {
	    	String codigo = txtCodigo.getText();
	    	String nome = txtNome.getText();
	    	
	    	System.out.println(codigo + "\t" + nome);
	    }

	    @FXML
	    void initialize() {
	        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'Principal.fxml'.";
	        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Principal.fxml'.";

	    }
	}

	
