package DiaroDiUnDetenuto;

import java.awt.Color;
import java.awt.Image;
import java.util.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class FirstPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel pic;
	//Timer tm;	
	private JButton next;
	//JButton next = new JButton("Gira pagina");
	
	int x= 0;
	String[] list= {
			"immafini/7364.jpg",		//prima immagine
			"immafini/prison.png",		//seconda immagine
			"immafini/7364.jpg",		//terza
			"immafini/prison.png",		//quarta
			"immafini/7364.jpg",		//quinta
	};


/*	public FirstPage() {
		super("Diario di un detenuto");
		pic = new JLabel();
		pic.setBounds(40,30,700,300);
		SetImageSize(5);
		next= JButton("Gira pagina");
		next.addActionListener(this);
	
	
			add(pic);
			setLayout(null);
			setSize(800, 400);
			getContentPane().setBackground(Color.decode("#bdb67b"));
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}*/


		public void SetImageSize(int i) {
			ImageIcon icon= new ImageIcon(list[i]);		//prendo le mie immagini
			Image img = icon.getImage();	
			Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon newIco = new ImageIcon();
			pic.setIcon(newIco);
		}
		public static void main (String[] args) {

			new FirstPage();
		}

	}
