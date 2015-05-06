import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class MainWindow {

	private JFrame frame;
	private JTextField txtSendAMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Game");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Host...");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Connect...");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		Canvas canvas = new Canvas();
		panel_1.add(canvas, "name_2422630421540172");
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(1.0);
		panel.add(splitPane);
		
		JPanel panel_3 = new JPanel();
		splitPane.setLeftComponent(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnPlayerList = new JTextPane();
		txtpnPlayerList.setContentType("text/html");
		txtpnPlayerList.setText("<html>\r\n<h2>Player List</h2>\r\n\r\n</html>");
		txtpnPlayerList.setEditable(false);
		panel_3.add(txtpnPlayerList, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		splitPane.setRightComponent(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {600, 0};
		gbl_panel_2.rowHeights = new int[] {300, 15};
		gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0};
		panel_2.setLayout(gbl_panel_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.insets = new Insets(0, 0, 5, 0);
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 0;
		panel_2.add(textPane, gbc_textPane);
		
		txtSendAMessage = new JTextField();
		txtSendAMessage.setText("Send a message");
		txtSendAMessage.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		GridBagConstraints gbc_txtSendAMessage = new GridBagConstraints();
		gbc_txtSendAMessage.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSendAMessage.insets = new Insets(0, 0, 5, 0);
		gbc_txtSendAMessage.anchor = GridBagConstraints.SOUTH;
		gbc_txtSendAMessage.gridx = 0;
		gbc_txtSendAMessage.gridy = 1;
		panel_2.add(txtSendAMessage, gbc_txtSendAMessage);
		txtSendAMessage.setColumns(10);
	}

}
