package dsk.aula5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LayoutFlow extends JFrame {

	public LayoutFlow() {
		
		setTitle(" Aula 5 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(290, 250);
		setVisible(true);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel(" Flow Layout Cadastro Usuário ");
		lblTitulo.setBounds(0, 0, 300, 20);
		add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome do usuário");
		lblNome.setBounds(5, 20, 300, 20);;
		add(lblNome);
		
		JTextField txtNome = new JTextField(20);
		txtNome.setBounds(5, 40, 200, 20);
		add(txtNome);
		
		JLabel lblUsuario = new JLabel("Login do usuário");
		lblUsuario.setBounds(5, 60, 300, 20);
		add(lblUsuario);
		
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setBounds(5, 80, 200, 20);
		add(txtUsuario);
		
		JLabel lblSenha = new JLabel("Senha do usuário");
		lblSenha.setBounds(5, 100, 200, 20);
		add(lblSenha);
		
		JPasswordField txtSenha = new JPasswordField(15);
		txtSenha.setBounds(5, 120, 200, 20);
		add(txtSenha);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(5, 140, 90, 20);
		add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(100, 140, 100, 20);
		add(btnCancelar);
		
	}

	public static void main(String[] args) {
		new LayoutFlow();
	}
}
