package GiocoDelQuindici;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Risultato {

	private JFrame frmRisultato;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Risultato window = new Risultato();
					window.frmRisultato.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Risultato() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRisultato = new JFrame();
		frmRisultato.setTitle("RISULTATO");
		frmRisultato.setBounds(100, 100, 530, 300);
		frmRisultato.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRisultato.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 102, 78);
		frmRisultato.getContentPane().add(textField);
		textField.setColumns(10);
	}

	
}
