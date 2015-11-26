package br.univel;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
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
	    private TableView<Cliente> tabel;

	    @FXML
	    void salvar(ActionEvent event) {
	    	String codigo = txtCodigo.getText();
	    	String nome = txtNome.getText();
	    	
	    	Cliente c = new Cliente();
	    	c.setCodigo(codigo);
	    	c.setNome(nome);
	    	tabel.getItems().add(c);
	    	System.out.println(codigo + nome);
	    }

	    @FXML
	    void initialize() {
	        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'Principal.fxml'.";
	        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Principal.fxml'.";

	    }
	}

	
