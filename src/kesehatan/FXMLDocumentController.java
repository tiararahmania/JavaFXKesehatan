/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Umi Tiara
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField editnama;
    @FXML
    private TextField editberat;
    @FXML
    private TextField edittinggi;
    @FXML
    private RadioButton rdLaki;
    @FXML
    private ToggleGroup Pilihan;
    @FXML
    private RadioButton rdPerempuan;
    @FXML
    private TextField ideal;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    @FXML
    private Button proses;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        int Ideal = 0;
    String Hasil= null;
    String Saran = null;
    String nama = editnama.getText();
    int tinggi = Integer.parseInt(edittinggi.getText());
     int berat = Integer.parseInt(editberat.getText());
     
    if(rdLaki.isSelected()) {
        Ideal = parseInt(edittinggi.getText()) -105;
        
        ideal.setText(""+Ideal);
    if (Ideal == berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"IDEAL";
            Saran = "pertahankan";
        }
        else if (Ideal < berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"OVERWEIGHT";
            Saran = "Kurangi makan malam";
        }
        else if (Ideal > berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"UNDERWEIGHT";
            Saran = "Sering-sering makan";
        }
    }
        if(rdPerempuan.isSelected()) {
        Ideal = parseInt(edittinggi.getText()) -110;
      

    ideal.setText(""+Ideal);
    if (Ideal== berat){
            Hasil= "nama: "+editnama.getText()+" Tinggi:  "+edittinggi.getText()+" IDEAL";
            Saran = "pertahankan";
        }
        else if (Ideal > berat){
            Hasil = "nama: "+editnama.getText()+" Tinggi: "+edittinggi.getText()+" UNDERWEIGHT";
            Saran = "Sering-sering makan";
        }
        else if (Ideal < berat){
            Hasil = "nama: "+editnama.getText()+" Tinggi: "+edittinggi.getText()+" OVERWEIGHT";
            Saran = "Kurangi makan malam";
        }
    }
    hasil.setText(Hasil);
    saran.setText(Saran);
    }

    @FXML
    private void reset(ActionEvent event) {
           editnama.setText("");
           edittinggi.setText("");
           editberat.setText("");
           rdLaki.setSelected(false);
           rdPerempuan.setSelected(false);
           hasil.setText("");
           ideal.setText("");
           saran.setText("");
    }
    
}
