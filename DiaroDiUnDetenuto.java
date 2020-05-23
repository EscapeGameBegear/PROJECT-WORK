package Room;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JTextField;

public class DiaroDiUnDetenuto extends Stanza{

	JFrame frame;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void Expand() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiaroDiUnDetenuto window = new DiaroDiUnDetenuto();
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
	public DiaroDiUnDetenuto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 754, 555);
		frame.setTitle("DIARIO DEL DETENUTO: Cosa sarà successo una volta uscito dal carcere?");
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel Next1 = new JLabel("");
		JLabel PrimaPagina = new JLabel("");
		
		JLabel Before2 = new JLabel("");		
		JLabel Next2 = new JLabel("");
		JLabel SecondaPagina = new JLabel("");
		
		JLabel Before3 = new JLabel("");
		JLabel TerzaPagina = new JLabel("");
		JLabel Penna = new JLabel("");
		JButton submit = new JButton("\u2714");
		
			
		
		//terza pagina

		Before3.setIcon(new ImageIcon(DiaroDiUnDetenuto.class.getResource("/image/before-x.png")));
		Before3.setBounds(10, 228, 53, 53);
		frame.getContentPane().add(Before3);
		Before3.setVisible(false);
		
		submit.setBounds(631, 349, 54, 31);
		frame.getContentPane().add(submit);
		submit.setBackground(new Color(154, 205, 50));
		submit.setVisible(false);
		submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
		});
		Penna.setBounds(572, 382, 100, 70);
		frame.getContentPane().add(Penna);
		Penna.setIcon(new ImageIcon(DiaroDiUnDetenuto.class.getResource("/DiarisPage/0031524_s-t-dupont-penna-a-sfera-nero-dorato-ref-265202-removebg-preview.png")));
		Penna.setVisible(false);
		
		TerzaPagina.setIcon(new ImageIcon(DiaroDiUnDetenuto.class.getResource("/DiarisPage/ThirdPage.jpg")));
		TerzaPagina.setBounds(-26, -32, 800, 590);
		frame.getContentPane().add(TerzaPagina);
		TerzaPagina.setVisible(false);
		
		txt = new JTextField();
		txt.setBounds(400, 290, 285, 60);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		txt.setVisible(false);
		
		Before3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Before3.setVisible(false);
				Penna.setVisible(false);
				TerzaPagina.setVisible(false);
				txt.setVisible(false);
				Before2.setVisible(true);
				Next2.setVisible(true);
				SecondaPagina.setVisible(true);
				
			}
		});
		
		Penna.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txt.setVisible(true);
				submit.setVisible(true);
			}
		});
		
		//seconda pagina
	
		Before2.setIcon(new ImageIcon(DiaroDiUnDetenuto.class.getResource("/image/before-x.png")));
		Before2.setBounds(10, 228, 53, 53);
		frame.getContentPane().add(Before2);
		Before2.setVisible(false);
		
		Next2.setIcon(new ImageIcon(DiaroDiUnDetenuto.class.getResource("/image/next-x.png")));
		Next2.setBounds(680, 228, 53, 53);
		frame.getContentPane().add(Next2);
		Next2.setVisible(false);
		
		SecondaPagina.setIcon(new ImageIcon(DiaroDiUnDetenuto.class.getResource("/DiarisPage/SecondPage.jpg")));
		SecondaPagina.setBounds(-26, -32, 800, 590);
		frame.getContentPane().add(SecondaPagina);
		SecondaPagina.setVisible(false);
		
		Before2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Before2.setVisible(false);
				Next2.setVisible(false);
				SecondaPagina.setVisible(false);
				Next1.setVisible(true);
				PrimaPagina.setVisible(true);
			}
		});
		Next2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				TerzaPagina.setVisible(true);
				Before3.setVisible(true);
				Penna.setVisible(true);
				SecondaPagina.setVisible(false);
				Before2.setVisible(false);
				Next2.setVisible(false);
				
			}
		});
		
		
		
		//prima pagina
		
		Next1.setIcon(new ImageIcon(DiaroDiUnDetenuto.class.getResource("/image/next-x.png")));
		Next1.setBounds(680, 228, 53, 53);
		frame.getContentPane().add(Next1);
		Next1.setVisible(true);
	
		PrimaPagina.setIcon(new ImageIcon(DiaroDiUnDetenuto.class.getResource("/DiarisPage/FirstPage.jpg")));
		PrimaPagina.setBounds(-26, -32, 800, 590);
		frame.getContentPane().add(PrimaPagina);
		
		PrimaPagina.setVisible(true);
		
		Next1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Before2.setVisible(true);
				Next2.setVisible(true);
				SecondaPagina.setVisible(true);
				
				Next1.setVisible(false);
				PrimaPagina.setVisible(false);
			}
		});
		
		
		
		
		
		
		
		
	
	}
}
