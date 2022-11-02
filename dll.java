import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener; import java.awt.event.ActionEvent; import javax.swing.JTextField;
import javax.swing.SwingConstants; import javax.swing.JTextArea; import javax.swing.JTextPane;

public class dll extends JFrame {

    private JPanel contentPane; private JTextField textField; private JTextField textField_1; private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) { EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                dll frame = new dll(); frame.setVisible(true);
            } catch (Exception e) { e.printStackTrace();
            }
        }
    });
    }

    /**
     * Create the frame.
     */
    public dll() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setBounds(100, 100, 450, 300);
        contentPane = new JPanel(); contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane); contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Add"); btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a, b;
                a = Integer.parseInt(textField.getText()); b = Integer.parseInt(textField_1.getText()); int c = a + b;
                textField_2.setText("addition : " + c);
            }
        });
        btnNewButton.setBounds(158, 144, 96, 21); contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Value 1 "); btnNewButton_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_1.setBounds(52, 31, 85, 21); contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Value 2"); btnNewButton_2.setBounds(52, 82, 85, 21); contentPane.add(btnNewButton_2);

        textField = new JTextField(); textField.setBounds(158, 32, 96, 19); contentPane.add(textField); textField.setColumns(10);

        textField_1 = new JTextField(); textField_1.setBounds(158, 83, 96, 19); contentPane.add(textField_1); textField_1.setColumns(10);

        textField_2 = new JTextField(); textField_2.setEditable(false); textField_2.setBounds(283, 145, 96, 19);

        contentPane.add(textField_2); textField_2.setColumns(10);
    }
}

