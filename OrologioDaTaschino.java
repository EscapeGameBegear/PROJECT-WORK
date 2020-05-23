package Room;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OrologioDaTaschino extends Stanza{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Expand() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrologioDaTaschino window = new OrologioDaTaschino();
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
	public OrologioDaTaschino() {
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
		frame.setTitle("");
		
		JButton btnNewButton = new JButton("click here");
		
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
		btnNewButton.setBounds(162, 293, 71, 17);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(OrologioDaTaschino.class.getResource("/image/orologio.png")));
		lblNewLabel.setBounds(0, 0, 634, 411);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
	}

}
