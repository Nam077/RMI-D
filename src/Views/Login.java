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

public class Login extends JFrame {

    private JPanel contentPane;
    private JPanel panel;
    public JButton submit_btnLogin;
    public JButton reg_btnLogin;
    public JTextField emailLogin;
    public JPasswordField passwordLogin;
    public JLabel lblSignIn;
    public JLabel lblNewLabel;
    public JLabel lblPassword;
    public JLabel lblForgotPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
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
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 670, 536);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(82, 177, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(104, 68, 450, 392);
        contentPane.add(panel);
        panel.setLayout(null);

        submit_btnLogin = new JButton("Login");
        submit_btnLogin.setFont(new Font("Roboto", Font.PLAIN, 15));
        submit_btnLogin.setForeground(Color.WHITE);
        submit_btnLogin.setBorderPainted(false);
        submit_btnLogin.setFocusPainted(false);
        submit_btnLogin.setBackground(new Color(65, 194, 203));
        submit_btnLogin.setBounds(65, 257, 142, 40);
        panel.add(submit_btnLogin);

        reg_btnLogin = new JButton("Register");
        reg_btnLogin.setFont(new Font("Roboto", Font.PLAIN, 15));
        reg_btnLogin.setForeground(Color.WHITE);
        reg_btnLogin.setBorderPainted(false);
        reg_btnLogin.setFocusPainted(false);
        reg_btnLogin.setBackground(new Color(65, 194, 203));
        reg_btnLogin.setBounds(235, 257, 142, 40);
        panel.add(reg_btnLogin);

        emailLogin = new JTextField();

        emailLogin.setFont(new Font("Roboto", Font.PLAIN, 15));
        emailLogin.setBackground(new Color(246, 246, 246));
        emailLogin.setBorder(null);
        emailLogin.setToolTipText("User Password");
        emailLogin.setColumns(10);
        emailLogin.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
        emailLogin.setBounds(65, 116, 312, 40);
        panel.add(emailLogin);

        lblSignIn = new JLabel("Sign In");
        lblSignIn.setVerticalAlignment(SwingConstants.BOTTOM);
        lblSignIn.setForeground(new Color(65, 194, 203));
        lblSignIn.setFont(new Font("Roboto", Font.BOLD, 40));
        lblSignIn.setBounds(160, 24, 125, 57);
        panel.add(lblSignIn);

        lblNewLabel = new JLabel("Email");
        lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        lblNewLabel.setBounds(65, 96, 80, 13);
        panel.add(lblNewLabel);

        passwordLogin = new JPasswordField();
        passwordLogin.setToolTipText("User Password");
        passwordLogin.setFont(new Font("Roboto", Font.PLAIN, 15));
        passwordLogin.setColumns(10);
        passwordLogin.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));

        passwordLogin.setBackground(new Color(246, 246, 246));
        passwordLogin.setBounds(65, 199, 312, 40);
        panel.add(passwordLogin);

        lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Roboto", Font.PLAIN, 15));
        lblPassword.setBounds(65, 180, 80, 13);
        panel.add(lblPassword);

        lblForgotPassword = new JLabel("Forgot Password");
        lblForgotPassword.setForeground(new Color(65, 194, 203));
        lblForgotPassword.setFont(new Font("Roboto", Font.PLAIN, 15));
        lblForgotPassword.setBounds(164, 329, 121, 18);
        panel.add(lblForgotPassword);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void notification(String message) {
        JOptionPane.showMessageDialog(null, message);
       
    }
}
