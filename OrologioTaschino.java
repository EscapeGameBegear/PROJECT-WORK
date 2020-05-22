package EnigmaOrologio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;


import Diario.DiarioDiUnDetenuto;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrologioTaschino {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Expand() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrologioTaschino window = new OrologioTaschino();
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
	public OrologioTaschino() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 620, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("click");
		
		//listener del bottone
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				FogliettoEnigma paper = new FogliettoEnigma();
				paper.Expand();
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		btnNewButton.setBackground(new Color(204, 204, 153));
		btnNewButton.setBounds(176, 293, 57, 17);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(OrologioTaschino.class.getResource("/immagini/orologio.png")));
		lblNewLabel.setBounds(0, 0, 634, 411);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
	}


}
