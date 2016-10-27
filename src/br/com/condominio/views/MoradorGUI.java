package br.com.condominio.views;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import br.com.condominio.controllers.MoradorController;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoradorGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoradorGUI window = new MoradorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MoradorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLerArquivo = new JButton("Ler arquivo");
		btnLerArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto", "txt");
			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(frame);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
					MoradorController.lerPagamento(chooser.getSelectedFile().getAbsoluteFile());
			    }
			}
		});
		btnLerArquivo.setBounds(203, 147, 136, 23);
		frame.getContentPane().add(btnLerArquivo);
	}
}
