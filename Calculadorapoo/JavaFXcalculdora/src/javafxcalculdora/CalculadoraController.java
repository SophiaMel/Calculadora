package javafxcalculdora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController implements Initializable {

    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;
    double PI = Math.PI;
    String operacao = "";
    
    
    
    @FXML
    private TextField telaPadraoTextField;
    @FXML
    private Button acButton;
    @FXML
    private Button divisaoButton;
    @FXML
    private Button multiplicacaoButton;
    @FXML
    private Button noveButton;
    @FXML
    private Button oitoButton;
    @FXML
    private Button seteButton;
    @FXML
    private Button seisButton;
    @FXML
    private Button subtracaoButton;
    @FXML
    private Button cincoButton;
    @FXML
    private Button quatroButton;
    @FXML
    private Button tresButton;
    @FXML
    private Button doisButtton;
    @FXML
    private Button somaButton;
    @FXML
    private Button umButton;
    @FXML
    private Button zeroButton;
    @FXML
    private Button pontoButton;
    @FXML
    private Button igualButton;
    @FXML
    private Button porcentagemButton;
     @FXML
    private Button elevarButton;
    @FXML
    private Button piButton;
    @FXML
    private Button cosButton;
    @FXML
    private Button tanButton;
    @FXML
    private Button senButton;
    @FXML
    private Button quadradaButton;
     

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        umButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"1");
            }
        });
        
        doisButtton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"2");
            }
        });
        
        tresButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"3");
            }
        });
        
        quatroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"4");
            }
        });
        
        cincoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"5");
            }
        });
        
        seisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"6");
            }
        });
        seteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"7");
            }
        });
        oitoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"8");
            }
        });
        noveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"9");
            }
        });
        zeroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+"0");
            }
        });      
        
        
        pontoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+".");
            }
        });
        
        multiplicacaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaPadraoTextField.getText());
                telaPadraoTextField.setText("");
                operacao = "x";
                
            }
        });
        
        divisaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaPadraoTextField.getText());
                telaPadraoTextField.setText("");
                operacao = "/";
                
            }
        });
        
        
        somaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaPadraoTextField.getText());
                telaPadraoTextField.setText("");
                operacao = "+";
                
            }
        });
        
        subtracaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaPadraoTextField.getText());
                telaPadraoTextField.setText("");
                operacao = "-";
                
            }
        });
        
        acButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText("");
                valor1 = 0;
                valor2 = 0;
                operacao = "";
            }
        });
         
        
        igualButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor2 = Double.parseDouble(telaPadraoTextField.getText());
                
                
                switch(operacao){
                        case "+":
                            resultado = valor1 + valor2;
                            telaPadraoTextField.setText(String.valueOf(resultado));
                            break;
                        case "-":
                            resultado = valor1 - valor2;
                            telaPadraoTextField.setText(String.valueOf(resultado));
                            break;
                        case "/":
                            resultado = valor1 / valor2;
                            telaPadraoTextField.setText(String.valueOf(resultado));
                            break;     
                        case "x":
                            resultado = valor1 * valor2;
                            telaPadraoTextField.setText(String.valueOf(resultado));
                            break;
                        case "%":
                                resultado = valor1*valor2/100;
                                telaPadraoTextField.setText(String.valueOf(resultado));
                            break;   
                            
                        
                       
                        
                            
                            
                }
                operacao = "";
                valor1 = 0;
                valor2 = 0;
               
                
                
            }
             
            
             
        }
        
        
        );
        
         porcentagemButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaPadraoTextField.getText());
                telaPadraoTextField.setText("");
                operacao = "%";
                
            }
        });
         piButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaPadraoTextField.setText(telaPadraoTextField.getText()+PI);
            }
        });  
         quadradaButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            
            String texto = telaPadraoTextField.getText();
            
            if (texto != null && !texto.isEmpty()) {
                double numero = Double.parseDouble(texto);

                double raizQuadrada = Math.sqrt(numero);
                
                telaPadraoTextField.setText(String.valueOf(raizQuadrada));
            }
        }
    });
         
         
          elevarButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            
            String texto = telaPadraoTextField.getText();
            
            if (texto != null && !texto.isEmpty()) {
                double numero = Double.parseDouble(texto);

                double Potência = Math.pow(numero,2);
                
                telaPadraoTextField.setText(String.valueOf(Potência));
            }
        }
    });
           
           
           
           cosButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            
            String texto = telaPadraoTextField.getText();
            
            if (texto != null && !texto.isEmpty()) {
                double numero = Double.parseDouble(texto);

                double Cos = Math.cos(Math.toRadians(numero));
                telaPadraoTextField.setText(String.valueOf(Cos));
            }
        }
    });
           
           senButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            
            String texto = telaPadraoTextField.getText();
            
            if (texto != null && !texto.isEmpty()) {
                double numero = Double.parseDouble(texto);

                double Seno = Math.sin(Math.toRadians(numero));
                telaPadraoTextField.setText(String.valueOf(Seno));
            }
        }
    });
           
           
           
           
           
          
           tanButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            
            String texto = telaPadraoTextField.getText();
            
            if (texto != null && !texto.isEmpty()) {
                double graus = Double.parseDouble(texto);

                double Tan = Math.tan(Math.toRadians(graus));
                telaPadraoTextField.setText(String.valueOf(Tan));
            }
        }
    }); 
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
}
          
          
          
          
          
}
         
         
         
         

         
         
         
        
   
    
        


 
