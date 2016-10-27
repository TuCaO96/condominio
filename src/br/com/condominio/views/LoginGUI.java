package br.com.condominio.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtTeste;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginGUI() {
		setBackground(UIManager.getColor("ToggleButton.light"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLogin.setBounds(79, 77, 46, 14);
		contentPane.add(lblLogin);
		
		txtTeste = new JTextField();
		txtTeste.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTeste.setBounds(135, 74, 116, 20);
		contentPane.add(txtTeste);
		txtTeste.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(79, 105, 46, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
		passwordField.setBounds(135, 105, 116, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(79, 130, 172, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Sistema Condom\u00EDnio");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel.setBounds(10, 11, 323, 35);
		contentPane.add(lblNewLabel);
	}
}
