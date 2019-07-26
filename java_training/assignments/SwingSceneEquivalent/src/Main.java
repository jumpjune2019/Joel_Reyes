import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	public static void main(String[] args) {
		final CardLayout cardlayout = new CardLayout();
		final JFrame frame = new JFrame("My First Swing Scene Magic");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final Container contentPane = frame.getContentPane();
		contentPane.setLayout(cardlayout);

		final JPanel panel1 = new JPanel();
		final JPanel panel2 = new JPanel();
		JButton button1 = new JButton("Go to scene 2");
		JButton button2 = new JButton("Go to scene 1");
		JLabel label1 = new JLabel("This is the Second scene");
		JLabel label2 = new JLabel("This is the First scene");
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new BorderLayout());
		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.BLUE);
		contentPane.setPreferredSize(new Dimension(600, 400));
		contentPane.add(panel1, "Panel 1");
		contentPane.add(panel2, "Panel 2");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setVisible(true);

		panel1.add(button2,BorderLayout.SOUTH);
		panel1.add(label1,BorderLayout.NORTH);
		panel2.add(button1,BorderLayout.SOUTH);
		panel2.add(label2,BorderLayout.NORTH);

		ActionListener btnListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.next(contentPane);
			}
		};

		button1.addActionListener(btnListener);
		button2.addActionListener(btnListener);

	}
}