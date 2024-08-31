import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants; 

public class Main { 

	public static void main(String[] args) { 
	
		JFrame janela = new JFrame(); 
		janela.setTitle("Hello World!"); 
		janela.setSize(500, 500); 
		janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
		
		
		JLabel labelNome = new JLabel("Nome: "); 
		labelNome.setBounds(20, 20, 50, 20);
		
		JTextField campoTextoNome = new JTextField(); 
		campoTextoNome.setBounds(20, 40, 200, 20);

		JButton buttonEnviar = new JButton();
		buttonEnviar.setText("Enviar"); 
		buttonEnviar.setBounds(20, 60, 100, 20);  	 
		buttonEnviar.addActionListener(event -> {
			String nomeDigitado = campoTextoNome.getText(); 
			JOptionPane.showMessageDialog(janela, "Olá " + nomeDigitado);
		});


		janela.setLayout(null);
		janela.getContentPane().add(labelNome);
		janela.getContentPane().add(campoTextoNome); 
		janela.getContentPane().add(buttonEnviar); 
 
		janela.setVisible(true); 

	}

} 