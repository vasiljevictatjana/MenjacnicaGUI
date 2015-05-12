package menjacnica.gui;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Component;
import java.awt.Toolkit;

import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPopupMenu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.Dimension;

import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JScrollPane scrollPane;
	private JTable table;
	private JPopupMenu popupMenu;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JPanel panel;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamenu;
	private JScrollPane scrollPane_1;
	protected JTextArea txtrStatus;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				ugasiAplikaciju();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/ikonica/kamatica.jpg")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 511, 357);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getScrollPane_1(), BorderLayout.SOUTH);
	
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ucitajIzFajla();
				}
			});
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sacuvajUFajl();
				}
			});
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ugasiAplikaciju();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(contentPane,
							"Autor: Tatjana Vasiljevic, Verzija 1.0", " O autoru programa",
							JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAbout;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			addPopup(scrollPane, getPopupMenu());
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setFillsViewportHeight(true);
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
					));
					addPopup(table, getPopupMenu());
				}
		return table;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmNewMenuItem());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMenuItem_1());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
			mntmObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziObrisiKursGUI();
					
				}
			});
		}
		return mntmObrisiKurs;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Dodaj kurs");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziDodajKursGUI();
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Izvrsi zamenu");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziIzvrsiZamenuGUI();
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(100, 10));
			panel.add(getBtnDodajKurs());
			panel.add(getBtnObrisiKurs());
			panel.add(getBtnIzvrsiZamenu());
		}
		return panel;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziDodajKursGUI();
				}
			});
			btnDodajKurs.setPreferredSize(new Dimension(100, 23));
		}
		return btnDodajKurs;
	}
	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
			btnObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziObrisiKursGUI();
				}
			});
			btnObrisiKurs.setPreferredSize(new Dimension(100, 23));
		}
		return btnObrisiKurs;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziIzvrsiZamenuGUI();
				}
			});
			btnIzvrsiZamenu.setPreferredSize(new Dimension(100, 23));
		}
		return btnIzvrsiZamenu;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane_1.setViewportView(getTxtrStatus());
		}
		return scrollPane_1;
	}
	private JTextArea getTxtrStatus() {
		if (txtrStatus == null) {
			txtrStatus = new JTextArea();
			JTextArea text = new JTextArea();
		}
		return txtrStatus;
	}
	
	private void ucitajIzFajla() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(contentPane);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				txtrStatus.append("Ucitan fajl: " + file.getAbsolutePath());
				txtrStatus.append("\n");
			}	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}


	private void sacuvajUFajl() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(contentPane);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				txtrStatus.append("Sacuvan fajl: " + file.getAbsolutePath());
				txtrStatus.append("\n");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
			//JFileChooser fc = new JFileChooser();
			//int returnVal = fc.showSaveDialog(contentPane);

			//if (returnVal == JFileChooser.APPROVE_OPTION) {
				//File file = fc.getSelectedFile();
				//txtrStatus.setText(txtrStatus.getText()+"\n"+"Sacuvan fajl:" +file.getAbsolutePath());
			//}
		
	}
	
	private void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(contentPane,
				"Da li zelite da izadjete iz programa", "Izlazak",
				JOptionPane.YES_NO_CANCEL_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	private void prikaziDodajKursGUI() {
		DodajKursGUI prozor = new DodajKursGUI(this);
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}

	private void prikaziObrisiKursGUI() {
		ObrisiKursGUI prozor = new ObrisiKursGUI(this);
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	
	private void prikaziIzvrsiZamenuGUI() {
		IzvrsiZamenuGUI prozor = new IzvrsiZamenuGUI(this);
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
}


