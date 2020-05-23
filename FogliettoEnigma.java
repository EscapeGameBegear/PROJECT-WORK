package Room;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FogliettoEnigma {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void Expand() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FogliettoEnigma window = new FogliettoEnigma();
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
	public FogliettoEnigma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 100, 730, 560);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Che ore sono?");
		
		JLabel lblNewLabel = new JLabel("New label");
		JLabel lblNewLabel_1 = new JLabel("penna");
		
		
		lblNewLabel_1.setIcon(null);
		lblNewLabel_1.setBounds(488, 463, 99, 47);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setVisible(true);
			}
		});
		
		textField = new JTextField();
		textField.setFont(new Font("Tekton Pro", Font.PLAIN, 24));
		textField.setBounds(310, 225, 114, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		lblNewLabel.setIcon(new ImageIcon(FogliettoEnigma.class.getResource("/image/enigmaOra.jpg")));
		lblNewLabel.setBounds(0, 0, 768, 534);
		frame.getContentPane().add(lblNewLabel);
		
		
		
	}

}
