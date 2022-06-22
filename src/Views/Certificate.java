package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Certificate extends JFrame {

    private JPanel contentPane;
    public JButton exitCer;
    public JLabel idCer, nameCer, dateCer, monthCer, addressCer, chasicCer, engineCer, yearCer, brandCer, modelCer, colorCer, plateCer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Certificate frame = new Certificate();
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
    public Certificate() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1258, 493);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(UIManager.getColor("CheckBox.darkShadow"), 5, true));
        panel.setBackground(new Color(249, 237, 179));
        panel.setForeground(Color.BLACK);
        panel.setBounds(10, 10, 611, 382);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("T\u00EAn ch\u1EE7 xe(Full name):");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel.setBounds(23, 33, 174, 21);
        panel.add(lblNewLabel);

        JLabel lblTnaChaddress = new JLabel("T\u00EAn \u0111\u1ECBa ch\u1EC9(Address): ");
        lblTnaChaddress.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblTnaChaddress.setBounds(23, 77, 174, 21);
        panel.add(lblTnaChaddress);

        JLabel lblNhnHiubrand_1_1 = new JLabel("Nh\u00E3n hi\u1EC7u(Brand):");
        lblNhnHiubrand_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1.setBounds(23, 121, 139, 21);
        panel.add(lblNhnHiubrand_1_1);

        JLabel lblNhnHiubrand_1_1_1_1 = new JLabel("S\u1ED1 m\u00E1y(Engine No):");
        lblNhnHiubrand_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1_1_1.setBounds(23, 152, 152, 21);
        panel.add(lblNhnHiubrand_1_1_1_1);

        JLabel lblNhnHiubrand_1_1_1_1_1 = new JLabel("S\u1ED1 khungChassic No):");
        lblNhnHiubrand_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1_1_1_1.setBounds(23, 183, 167, 21);
        panel.add(lblNhnHiubrand_1_1_1_1_1);

        JLabel lblNhnHiubrand_1_1_1_1_1_1 = new JLabel("M\u00E0u s\u01A1n(Color):");
        lblNhnHiubrand_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1_1_1_1_1.setBounds(23, 211, 124, 21);
        panel.add(lblNhnHiubrand_1_1_1_1_1_1);

        JLabel lblNhnHiubrand_1_1_1_1_1_1_1 = new JLabel("Ho\u1EA1t \u0111\u1ED9ng trong ph\u1EA1m vi:");
        lblNhnHiubrand_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1_1_1_1_1_1.setBounds(23, 242, 196, 21);
        panel.add(lblNhnHiubrand_1_1_1_1_1_1_1);

        JLabel lblNhnHiubrand_1_1_1_1_1_1_1_1 = new JLabel("Bi\u1EC3n s\u1ED1 \u0111\u0103ng k\u00FD");
        lblNhnHiubrand_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNhnHiubrand_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNhnHiubrand_1_1_1_1_1_1_1_1.setBounds(23, 284, 136, 21);
        panel.add(lblNhnHiubrand_1_1_1_1_1_1_1_1);

        JLabel lblNhnHiubrand_1_1_1_1_1_1_1_2 = new JLabel("(N Plate)");
        lblNhnHiubrand_1_1_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1_1_1_1_1_1_2.setBounds(48, 315, 72, 21);
        panel.add(lblNhnHiubrand_1_1_1_1_1_1_1_2);

        JLabel lblNhnHiubrand_1_1_1 = new JLabel("S\u1ED1 lo\u1EA1i(Model):");
        lblNhnHiubrand_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1_1.setBounds(333, 121, 117, 21);
        panel.add(lblNhnHiubrand_1_1_1);

        JLabel lblNhnHiubrand_1_1_1_2 = new JLabel("\u0110\u00E0 N\u1EB5ng, ng\u00E0y      th\u00E1ng       n\u0103m");
        lblNhnHiubrand_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1_1_2.setBounds(310, 284, 291, 21);
        panel.add(lblNhnHiubrand_1_1_1_2);

        JLabel lblNhnHiubrand_1_1_1_2_1 = new JLabel("C\u1EE5c tr\u01B0\u1EDFng");
        lblNhnHiubrand_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNhnHiubrand_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNhnHiubrand_1_1_1_2_1.setBounds(278, 313, 291, 21);
        panel.add(lblNhnHiubrand_1_1_1_2_1);

        JLabel lblNhnHiubrand_1_1_1_2_1_1 = new JLabel("Phan Văn Giang");
        lblNhnHiubrand_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNhnHiubrand_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNhnHiubrand_1_1_1_2_1_1.setBounds(278, 337, 291, 21);
        panel.add(lblNhnHiubrand_1_1_1_2_1_1);

        nameCer = new JLabel("Nguyễn Mai Lan");
        nameCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        nameCer.setBounds(197, 33, 404, 21);
        panel.add(nameCer);

        addressCer = new JLabel("Nguyễn Mai Lan");
        addressCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        addressCer.setBounds(197, 77, 404, 21);
        panel.add(addressCer);

        engineCer = new JLabel("Nguyễn Mai Lan");
        engineCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        engineCer.setBounds(197, 152, 404, 21);
        panel.add(engineCer);

        chasicCer = new JLabel("Nguyễn Mai Lan");
        chasicCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chasicCer.setBounds(197, 183, 404, 21);
        panel.add(chasicCer);

        colorCer = new JLabel("Nguyễn Mai Lan");
        colorCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        colorCer.setBounds(197, 211, 404, 21);
        panel.add(colorCer);

        brandCer = new JLabel("Nguyễn Mai Lan");
        brandCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        brandCer.setBounds(161, 121, 139, 21);
        panel.add(brandCer);

        modelCer = new JLabel("Nguyễn Mai Lan");
        modelCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        modelCer.setBounds(450, 121, 139, 21);
        panel.add(modelCer);

        JLabel lblNguynVnNam_1_1_2_1_1 = new JLabel("Vi\u1EC7t Nam");
        lblNguynVnNam_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNguynVnNam_1_1_2_1_1.setBounds(217, 242, 384, 21);
        panel.add(lblNguynVnNam_1_1_2_1_1);

        plateCer = new JLabel("38H5 2347 27735");
        plateCer.setHorizontalAlignment(SwingConstants.LEFT);
        plateCer.setFont(new Font("Times New Roman", Font.BOLD, 18));
        plateCer.setBounds(161, 284, 152, 21);
        panel.add(plateCer);

        dateCer = new JLabel("33");
        dateCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        dateCer.setBounds(424, 284, 18, 21);
        panel.add(dateCer);

        monthCer = new JLabel("33");
        monthCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        monthCer.setBounds(495, 284, 18, 21);
        panel.add(monthCer);

        yearCer = new JLabel("33");
        yearCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        yearCer.setBounds(557, 284, 44, 21);
        panel.add(yearCer);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setForeground(Color.BLACK);
        panel_1.setBorder(new LineBorder(UIManager.getColor("CheckBox.darkShadow"), 5, true));
        panel_1.setBackground(new Color(249, 237, 179));
        panel_1.setBounds(631, 10, 611, 382);
        contentPane.add(panel_1);

        JLabel lblNewLabel_1 = new JLabel("C\u1ED8NG HO\u00C0 X\u00C3 H\u1ED8I CH\u1EE6 NGH\u0128A VI\u1EC6T NAM");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblNewLabel_1.setBounds(0, 10, 612, 41);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Socialist Republic of Vietnam");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_1_1.setBounds(10, 40, 591, 26);
        panel_1.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("B\u1ED8 C\u00D4NG AN");
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblNewLabel_1_2.setBounds(1, 77, 610, 41);
        panel_1.add(lblNewLabel_1_2);

        JLabel lblNewLabel_1_1_1 = new JLabel("Ministry of Public Security");
        lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_1_1_1.setBounds(10, 107, 591, 26);
        panel_1.add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_1_1_1_1 = new JLabel("The Traffic Police Department");
        lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_1_1_1_1.setBounds(10, 158, 591, 26);
        panel_1.add(lblNewLabel_1_1_1_1);

        JLabel lblNewLabel_1_2_1 = new JLabel("C\u1EE4C C\u1EA2NH S\u00C1T GIAO TH\u00D4NG");
        lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblNewLabel_1_2_1.setBounds(5, 128, 602, 41);
        panel_1.add(lblNewLabel_1_2_1);

        JLabel lblNewLabel_1_2_1_1 = new JLabel("CH\u1EE8NG NH\u1EACN \u0110\u0102NG K\u00DD ");
        lblNewLabel_1_2_1_1.setForeground(Color.RED);
        lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        lblNewLabel_1_2_1_1.setBounds(0, 193, 612, 41);
        panel_1.add(lblNewLabel_1_2_1_1);

        JLabel lblNewLabel_1_2_1_1_1 = new JLabel("XE Ô TÔ, XE G\u1EAEN M\u00C1Y");
        lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2_1_1_1.setForeground(Color.RED);
        lblNewLabel_1_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        lblNewLabel_1_2_1_1_1.setBounds(0, 226, 612, 41);
        panel_1.add(lblNewLabel_1_2_1_1_1);

        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Motorbike Registration Certificate");
        lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_1_1_1_1_1.setBounds(10, 261, 591, 26);
        panel_1.add(lblNewLabel_1_1_1_1_1);

        idCer = new JLabel("S\u1ED1(Number):");
        idCer.setHorizontalAlignment(SwingConstants.CENTER);
        idCer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        idCer.setBounds(10, 310, 591, 26);
        panel_1.add(idCer);

        JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("");
        lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_1_1_1_1_1_1_1.setBounds(356, 310, 245, 26);
        panel_1.add(lblNewLabel_1_1_1_1_1_1_1);

        JButton exportCer = new JButton("Xu\u1EA5t \u1EA3nh");
        exportCer.setForeground(Color.WHITE);
        exportCer.setFont(new Font("Roboto", Font.PLAIN, 15));
        exportCer.setFocusPainted(false);
        exportCer.setBorderPainted(false);
        exportCer.setBackground(new Color(65, 194, 203));
        exportCer.setBounds(479, 406, 142, 40);
        contentPane.add(exportCer);

        exitCer = new JButton("Tho\u00E1t");
        exitCer.setForeground(Color.WHITE);
        exitCer.setFont(new Font("Roboto", Font.PLAIN, 15));
        exitCer.setFocusPainted(false);
        exitCer.setBorderPainted(false);
        exitCer.setBackground(new Color(65, 194, 203));
        exitCer.setBounds(631, 406, 142, 40);
        contentPane.add(exitCer);
    }
}
