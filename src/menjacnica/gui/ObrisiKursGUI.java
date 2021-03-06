package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceniNaziv;
	private JCheckBox chckbxNewCheckBox;
	private static JButton btnObrisi;
	private JButton btnOdustani;
	private JCheckBox chckbxZaistaObrisiKurs;
	private JLabel label;
	


	private MenjacnicaGUI mGUI;
	

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI mGUI) {
		setTitle("Obrisi kurs");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/image-delayed.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 5, 5));
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getChckbxZaistaObrisiKurs());
		contentPane.add(getLabel());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		
		this.mGUI = mGUI;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Naziv");
		}
		return lblNewLabel_1;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setEditable(false);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setEditable(false);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prodajni");
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Kupovni");
		}
		return lblNewLabel_3;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setEditable(false);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEditable(false);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Srednji");
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Skracen naziv");
		}
		return lblNewLabel_5;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
		}
		return label;

	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setEditable(false);
			textFieldSrednji.setColumns(10);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setEditable(false);
			textFieldSkraceniNaziv.setColumns(10);
		}
		return textFieldSkraceniNaziv;
	}	
	
		
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (chckbxZaistaObrisiKurs.isSelected()) {
						btnObrisi.setEnabled(true);
						textFieldSifra.setEditable(true);
						textFieldNaziv.setEditable(true);
						textFieldProdajni.setEditable(true);
						textFieldSrednji.setEditable(true);
						textFieldKupovni.setEditable(true);
						textFieldSkraceniNaziv.setEditable(true);
						
					}
					else {
						btnObrisi.setEnabled(false);
						textFieldSifra.setEditable(false);
						textFieldNaziv.setEditable(false);
						textFieldProdajni.setEditable(false);
						textFieldSrednji.setEditable(false);
						textFieldKupovni.setEditable(false);
						textFieldSkraceniNaziv.setEditable(false);
						
					}

				}
			});
		}
		return chckbxZaistaObrisiKurs;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.setEnabled(false);
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mGUI.txtrStatus.append("Sifra: "+textFieldSifra.getText()+"Naziv: "+textFieldNaziv.getText()
							+"Prodajni kurs: "+textFieldProdajni.getText()+"Kupovni kurs: "+textFieldKupovni.getText()+"Srednji kurs: "
							+textFieldSrednji.getText()+"Skraceni naziv: "+textFieldSkraceniNaziv.getText()+"\n");
					dispose();	
				}	
			});
			
		}
		return btnObrisi;
	}


	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnOdustani;
	}
	


}
