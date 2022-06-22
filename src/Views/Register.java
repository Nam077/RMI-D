package Views;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Register extends JFrame {

    /**
     *
     */

    public JPanel contentPane;
    public JPanel panel;
    public JButton submit_btnRegister;
    public JButton login_btnRegister;
    public JTextField emailRegister;
    public JLabel lblSignIn;
    public JLabel lblNewLabel;
    public JTextField nameRegister;
    public JLabel lblName;
    public JPasswordField passwordRegister;
    public JLabel lblPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Register frame = new Register();
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
    public Register() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 670, 536);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(82,177,226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(104, 68, 450, 392);
        contentPane.add(panel);
        panel.setLayout(null);

        submit_btnRegister = new JButton("Register");
        submit_btnRegister.setFont(new Font("Roboto", Font.PLAIN, 15));
        submit_btnRegister.setForeground(Color.WHITE);
        submit_btnRegister.setBorderPainted(false);
        submit_btnRegister.setFocusPainted(false);
        submit_btnRegister.setBackground(new Color(65, 194, 203));
        submit_btnRegister.setBounds(65, 322, 142, 40);
        panel.add(submit_btnRegister);

        login_btnRegister = new JButton("Login");
        login_btnRegister.setFont(new Font("Roboto", Font.PLAIN, 15));
        login_btnRegister.setForeground(Color.WHITE);
        login_btnRegister.setBorderPainted(false);
        login_btnRegister.setFocusPainted(false);
        login_btnRegister.setBackground(new Color(65, 194, 203));
        login_btnRegister.setBounds(235, 322, 142, 40);
        panel.add(login_btnRegister);

        emailRegister = new JTextField();

        emailRegister.setFont(new Font("Roboto", Font.PLAIN, 15));
        emailRegister.setBackground(new Color(246,246,246));
        emailRegister.setBorder(null);
        emailRegister.setToolTipText("Email User");
        emailRegister.setColumns(10);
        emailRegister.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        emailRegister.setBounds(65, 116, 312, 40);
        panel.add(emailRegister);

        lblSignIn = new JLabel("Sign Up");
        lblSignIn.setVerticalAlignment(SwingConstants.BOTTOM);
        lblSignIn.setForeground(new Color(65, 194, 203));
        lblSignIn.setFont(new Font("Roboto", Font.BOLD, 40));
        lblSignIn.setBounds(152, 23, 142, 57);
        panel.add(lblSignIn);

        lblNewLabel = new JLabel("Email");
        lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        lblNewLabel.setBounds(65, 96, 80, 13);
        panel.add(lblNewLabel);

        nameRegister = new JTextField();
        nameRegister.setToolTipText("Name User");
        nameRegister.setFont(new Font("Roboto", Font.PLAIN, 15));
        nameRegister.setColumns(10);
        nameRegister.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        nameRegister.setBackground(new Color(246, 246, 246));
        nameRegister.setBounds(65, 194, 312, 40);
        panel.add(nameRegister);

        lblName = new JLabel("Name");
        lblName.setFont(new Font("Roboto", Font.PLAIN, 15));
        lblName.setBounds(65, 176, 80, 13);
        panel.add(lblName);

        passwordRegister = new JPasswordField();
        passwordRegister.setToolTipText("User Password");
        passwordRegister.setFont(new Font("Roboto", Font.PLAIN, 15));
        passwordRegister.setColumns(10);
        passwordRegister.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        passwordRegister.setBackground(new Color(246, 246, 246));
        passwordRegister.setBounds(65, 267, 312, 40);
        panel.add(passwordRegister);

        lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Roboto", Font.PLAIN, 15));
        lblPassword.setBounds(65, 248, 80, 13);
        panel.add(lblPassword);
        setLocationRelativeTo(null);
    }
    public void notification(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
