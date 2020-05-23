package Room;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Stanza {

	private JFrame frame;
	//public static mousepressed();
	//public static extends(); 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stanza window = new Stanza();
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
	public Stanza() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(250, 20, 808, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton EnigmaDel15 = new JButton("gioco15");
		EnigmaDel15.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				EnigmaDelQuindici.Expand();
			}
		});
		EnigmaDel15.setIcon(new ImageIcon(Stanza.class.getResource("/image/giocoDel15.png")));
		EnigmaDel15.setBounds(143, 267, 169, 99);
		frame.getContentPane().add(EnigmaDel15);
		
		JButton diario = new JButton("diario");
		diario.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			//	DiaroDiUnDetenuto diario= new DiaroDiUnDetenuto();
				DiaroDiUnDetenuto.Expand();
			}
		});
		diario.setBounds(350, 516, 128, 79);
		frame.getContentPane().add(diario);
		
		JButton orologio = new JButton("orologio");
		orologio.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				OrologioDaTaschino.Expand();
			}
			
		});
		
		orologio.setBounds(544, 389, 89, 23);
		frame.getContentPane().add(orologio);
		
	}
}
