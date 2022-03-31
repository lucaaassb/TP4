package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaSitter implements ActionListener {
	private static JFrame janela = new JFrame("DogInn");
	private static JLabel titulo = new JLabel("PetSitter");
	private static JButton login = new JButton("Login");
	private static JButton cadastro = new JButton("Cadastrar");
	
	public TelaSitter () {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(150, 10, 150, 30);
		login.setBounds(140, 55, 100, 40);
		cadastro.setBounds(140, 105, 100, 40);
		
		janela.setLayout(null);
		janela.add(titulo);
		janela.add(cadastro);
		janela.add(login);
		
		janela.setSize(400, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
	}
	
	public static void main(String[] args) {
        TelaInicial menu = new TelaInicial();

        login.addActionListener(menu);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
    	
    	if(src == login)
			new LoginSitter();
		
	}

}