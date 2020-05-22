package Diario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;
import java.io.File;
import java.lang.System.Logger.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.animation.Animation;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DiarioDiUnDetenuto extends JFrame {

	private JPanel contentPane;
	int position= 3;
	private JLabel labell;
	
	public String[] Sliderimages(){
		
		File file = new File(getClass().getResource("/DiarisPage").getFile());
		String[] images = file.list();
		return images;
	}
	
	
	public void ShowImages(int index) {
		
		String[] images= Sliderimages();
		String img = images[index];
		ImageIcon icon = new ImageIcon(getClass().getResource("/DiarisPage/"+img));
		Image image= icon.getImage().getScaledInstance(labell.getWidth(), labell.getHeight(), images.length);
		labell.setIcon(new ImageIcon(image));
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiarioDiUnDetenuto frame = new DiarioDiUnDetenuto();
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
	public DiarioDiUnDetenuto() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 780, 600);
		contentPane = new JPanel();
	//	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JLabel before = new JLabel("");
		
		
		
		before.setIcon(new ImageIcon(DiarioDiUnDetenuto.class.getResource("/immagini/before-x.png")));
		before.setBounds(28, 277, 52, 53);
		contentPane.add(before);
		
		
		JLabel next = new JLabel("");
		
		
		
		next.setIcon(new ImageIcon(DiarioDiUnDetenuto.class.getResource("/immagini/next-x.png")));
		next.setBounds(690, 277, 52, 53);
		contentPane.add(next);
		
	
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(DiarioDiUnDetenuto.class.getResource("/DiarisPage/FirstPage.jpg")));
		background.setBounds(-17, 0, 828, 579);
		contentPane.add(background);
		
	/*	getComponents();
		ShowImages(position);*/
		
		next.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
					background.setIcon(new ImageIcon(DiarioDiUnDetenuto.class.getResource("/DiarisPage/SecondPage.jpg")));
					contentPane.add(background);
						
			}
		});
		
		before.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				background.setIcon(new ImageIcon(DiarioDiUnDetenuto.class.getResource("/DiarisPage/SecondPage.jpg")));
				contentPane.add(background);
				background.setIcon(new ImageIcon(DiarioDiUnDetenuto.class.getResource("/DiarisPage/FirstPage.jpg")));
				background.setBounds(-17, 0, 828, 579);
				contentPane.add(background);
				
			}
		});
	
	}
}
