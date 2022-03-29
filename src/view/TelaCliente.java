package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCliente implements ActionListener {
	private static JFrame janela = new JFrame("Cliente");
	private static JButton login = new JButton("Login");
	private static JButton cadastro = new JButton("Cadastrar");
	
	public TelaCliente () {
		login.setBounds(140, 55, 100, 40);
		cadastro.setBounds(140, 105, 100, 40);
		
		janela.setLayout(null);
		janela.add(cadastro);
		janela.add(login);
		
		janela.setSize(400, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
	}
	
	public static void main(String[] args) {
        TelaInicial menu = new TelaInicial();

        login.addActionListener(menu);
        cadastro.addActionListener(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}