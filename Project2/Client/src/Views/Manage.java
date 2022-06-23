package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import com.toedter.calendar.JDateChooser;

public class Manage extends JFrame {
	public String path = "E:\\Java\\Eclipse\\Manage\\Imgs\\";
	Timer timer;
	int index, indexLb = 1;
	public JPanel contentPane, LogoutPanel;
	public JTable tableUser;
	public JLabel AuthUser;
	public JComboBox roleUser, nameUserManage, nameVehicleManage, chartYear;
	public JTextField searchUser;
	public JTextField idUser;
	public JTextField emailUser;
	public JTextField nameUser;
	public JTextField passwordUser;
	public JTextField addressUser;
	public JTextField phoneUser;
	public JTextField codeUser;
	public JTextField searchVehicle;
	public JTextField idVehicle;
	public JTextField nameVehicle;
	public JTextField colorVehicle;
	public JTextField typeVehicle;
	public JTextField seat_capacityVehicle;
	public JDateChooser dateUser, dateVehicle, dateManage;
	public JTextField capacityVehicle;
	public JTextField brandVehicle;
	public JTable tableVehicle;
	public JTextField searchManage;
	public JTextField idManage;
	public JTextField nameManage;
	public JTextField plateManage;
	public JTable tableManage;
	public JLabel slide;
	public JPanel panelChart1;
	public JButton addUser, deleteUser, updateUser;
	public JButton addVehicle, deleteVehicle, updateVehicle;
	public JButton addManage, deleteManage, updateManage, viewManage;
	public JTextField engine_noMange;
	public JTextField chassis_noManage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage frame = new Manage();
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
	public Manage() {
		Insets insets = UIManager.getInsets("TabbedPane.contentBorderInsets");
		insets.top = -1;
		UIManager.put("TabbedPane.contentBorderInsets", insets);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1208, 725);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 194, 203));
		panel.setBounds(10, 10, 282, 688);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel HomePanel = new JPanel();

		HomePanel.setBackground(new Color(0, 100, 250));
		HomePanel.setBounds(10, 195, 262, 56);
		panel.add(HomePanel);
		HomePanel.setLayout(null);

		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(255, 0, 7, 56);
		HomePanel.add(panel_2_2);

		JLabel lblNewLabel = new JLabel("Trang Ch\u1EE7");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel.setBounds(80, 16, 96, 24);
		HomePanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(28, 0, 36, 56);
		HomePanel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(path + "house-solid (1).png"));

		JPanel UserPanel = new JPanel();
		UserPanel.setLayout(null);
		UserPanel.setBackground(new Color(0, 155, 245));
		UserPanel.setBounds(10, 259, 262, 56);
		panel.add(UserPanel);

		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBackground(Color.WHITE);
		panel_2_2_1.setBounds(255, 0, 7, 56);
		UserPanel.add(panel_2_2_1);

		JLabel lblNgiDng = new JLabel("Ng\u01B0\u1EDDi D\u00F9ng");
		lblNgiDng.setForeground(Color.WHITE);
		lblNgiDng.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNgiDng.setBounds(80, 16, 120, 24);
		UserPanel.add(lblNgiDng);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(path + "user-solid.png"));
		lblNewLabel_1_1.setBounds(28, 0, 36, 56);
		UserPanel.add(lblNewLabel_1_1);

		JPanel VehiclePanel = new JPanel();
		VehiclePanel.setLayout(null);
		VehiclePanel.setBackground(new Color(0, 155, 245));
		VehiclePanel.setBounds(10, 325, 262, 56);
		panel.add(VehiclePanel);

		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setBackground(Color.WHITE);
		panel_2_2_1_1.setBounds(255, 0, 7, 56);
		VehiclePanel.add(panel_2_2_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Ph\u01B0\u01A1ng Ti\u1EC7n");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(80, 16, 131, 24);
		VehiclePanel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(path + "bicycle-solid.png"));
		lblNewLabel_1_1_1.setBounds(28, 0, 36, 56);
		VehiclePanel.add(lblNewLabel_1_1_1);

		JPanel ManagePanel = new JPanel();
		ManagePanel.setLayout(null);
		ManagePanel.setBackground(new Color(0, 155, 245));
		ManagePanel.setBounds(10, 391, 262, 56);
		panel.add(ManagePanel);

		JPanel panel_2_2_1_1_1 = new JPanel();
		panel_2_2_1_1_1.setLayout(null);
		panel_2_2_1_1_1.setBackground(Color.WHITE);
		panel_2_2_1_1_1.setBounds(255, 0, 7, 56);
		ManagePanel.add(panel_2_2_1_1_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("\u0110\u0103ng K\u00FD");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(80, 16, 96, 24);
		ManagePanel.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon(path + "bars-progress-solid.png"));
		lblNewLabel_1_1_1_1.setBounds(28, 0, 36, 56);
		ManagePanel.add(lblNewLabel_1_1_1_1);

		JPanel ChartPanel = new JPanel();
		ChartPanel.setLayout(null);
		ChartPanel.setBackground(new Color(0, 155, 245));
		ChartPanel.setBounds(10, 457, 262, 56);
		panel.add(ChartPanel);

		JPanel panel_2_2_1_1_1_1 = new JPanel();
		panel_2_2_1_1_1_1.setLayout(null);
		panel_2_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_2_1_1_1_1.setBounds(255, 0, 7, 56);
		ChartPanel.add(panel_2_2_1_1_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Bi\u1EC3u \u0110\u1ED3");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(80, 16, 96, 24);
		ChartPanel.add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(path + "chart-area-solid.png"));
		lblNewLabel_1_1_1_1_1.setBounds(28, 0, 36, 56);
		ChartPanel.add(lblNewLabel_1_1_1_1_1);

		LogoutPanel = new JPanel();
		LogoutPanel.setLayout(null);
		LogoutPanel.setBackground(new Color(0, 155, 245));
		LogoutPanel.setBounds(10, 523, 262, 56);
		panel.add(LogoutPanel);

		JPanel panel_2_2_1_1_1_1_1 = new JPanel();
		panel_2_2_1_1_1_1_1.setLayout(null);
		panel_2_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_2_1_1_1_1_1.setBounds(255, 0, 7, 56);
		LogoutPanel.add(panel_2_2_1_1_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("\u0110\u0103ng Xu\u1EA5t");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(80, 16, 96, 24);
		LogoutPanel.add(lblNewLabel_2_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1.setIcon(new ImageIcon(path + "arrow-right-from-bracket-solid.png"));
		lblNewLabel_1_1_1_1_1_1.setBounds(28, 0, 36, 56);
		LogoutPanel.add(lblNewLabel_1_1_1_1_1_1);

		JLabel avatar = new JLabel("");
		avatar.setIcon(new ImageIcon(path + "kindpng_1636340 (1).png"));
		avatar.setBounds(87, 36, 100, 100);
		panel.add(avatar);

		AuthUser = new JLabel("Nguyễn Blbla");
		AuthUser.setHorizontalAlignment(SwingConstants.CENTER);
		AuthUser.setVerticalAlignment(SwingConstants.CENTER);
		AuthUser.setForeground(Color.WHITE);
		AuthUser.setFont(new Font("Roboto", Font.BOLD, 20));
		AuthUser.setBounds(10, 146, 262, 33);
		panel.add(AuthUser);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		tabbedPane.setBounds(302, 10, 882, 666);
		contentPane.add(tabbedPane);

		JPanel Home = new JPanel();
		Home.setBackground(Color.WHITE);
		tabbedPane.addTab("Trang Chủ", null, Home, null);
		Home.setLayout(null);

		slide = new JLabel("");
		slide.setIcon(new ImageIcon(path + "1 (1).jpg"));
		slide.setBounds(142, 201, 600, 320);
		Home.add(slide);

		JLabel labelSlide = new JLabel("");
		labelSlide.setForeground(new Color(65, 194, 203));
		labelSlide.setFont(new Font("Roboto", Font.BOLD, 23));
		labelSlide.setHorizontalAlignment(SwingConstants.CENTER);
		labelSlide.setBounds(10, 562, 857, 67);
		Home.add(labelSlide);

		JLabel lblNewLabel_3 = new JLabel("PHẦN MỀM ĐĂNG KÝ Ô TÔ - XE MÁY");
		lblNewLabel_3.setBackground(Color.CYAN);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Roboto", Font.BOLD, 40));
		lblNewLabel_3.setBounds(10, 43, 857, 67);
		Home.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Thực hiện: Nguyễn Thị Mai Lan");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Roboto", Font.BOLD, 17));
		lblNewLabel_4.setBounds(10, 120, 857, 24);
		Home.add(lblNewLabel_4);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 100, 250));
		panel_1.setForeground(Color.ORANGE);
		panel_1.setBounds(10, 10, 857, 160);
		Home.add(panel_1);
		Object[] roles = { "Admin", "User" };

		JPanel panelUser = new JPanel();
		panelUser.setBorder(null);
		panelUser.setBackground(Color.WHITE);
		tabbedPane.addTab("Người Dùng", null, panelUser, null);
		panelUser.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 852, 282);
		panelUser.add(scrollPane);

		tableUser = new JTable();
		tableUser.setRowHeight(40);
		scrollPane.setViewportView(tableUser);

		deleteUser = new JButton("Xóa");
		deleteUser.setForeground(Color.WHITE);
		deleteUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		deleteUser.setFocusPainted(false);
		deleteUser.setBorderPainted(false);
		deleteUser.setBackground(new Color(220, 53, 69));
		deleteUser.setBounds(772, 312, 90, 40);
		panelUser.add(deleteUser);

		searchUser = new JTextField();
		searchUser.setToolTipText("User Password");
		searchUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		searchUser.setColumns(10);
		searchUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		searchUser.setBackground(new Color(246, 246, 246));
		searchUser.setBounds(10, 312, 348, 40);
		panelUser.add(searchUser);

		updateUser = new JButton("Sửa");
		updateUser.setForeground(Color.WHITE);
		updateUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		updateUser.setFocusPainted(false);
		updateUser.setBorderPainted(false);
		updateUser.setBackground(new Color(255, 193, 7));
		updateUser.setBounds(672, 312, 90, 40);
		panelUser.add(updateUser);

		addUser = new JButton("Thêm");
		addUser.setForeground(Color.WHITE);
		addUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		addUser.setFocusPainted(false);
		addUser.setBorderPainted(false);
		addUser.setBackground(new Color(25, 135, 84));
		addUser.setBounds(572, 312, 90, 40);
		panelUser.add(addUser);

		JButton viewUser = new JButton("Xem");
		viewUser.setForeground(Color.WHITE);
		viewUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		viewUser.setFocusPainted(false);
		viewUser.setBorderPainted(false);
		viewUser.setBackground(new Color(65, 194, 203));
		viewUser.setBounds(472, 312, 90, 40);
		panelUser.add(viewUser);

		JButton searchUserbt = new JButton("Tìm");
		searchUserbt.setForeground(Color.WHITE);
		searchUserbt.setFont(new Font("Roboto", Font.PLAIN, 15));
		searchUserbt.setFocusPainted(false);
		searchUserbt.setBorderPainted(false);
		searchUserbt.setBackground(new Color(13, 202, 240));
		searchUserbt.setBounds(368, 312, 90, 40);
		panelUser.add(searchUserbt);

		idUser = new JTextField();
		idUser.setToolTipText("User Password");
		idUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		idUser.setColumns(10);
		idUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		idUser.setBackground(new Color(246, 246, 246));
		idUser.setBounds(10, 382, 419, 40);
		panelUser.add(idUser);

		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId.setBounds(10, 362, 80, 13);
		panelUser.add(lblId);

		emailUser = new JTextField();
		emailUser.setToolTipText("User Password");
		emailUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		emailUser.setColumns(10);
		emailUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		emailUser.setBackground(new Color(246, 246, 246));
		emailUser.setBounds(443, 382, 419, 40);
		panelUser.add(emailUser);

		JLabel lblId_1 = new JLabel("Email");
		lblId_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1.setBounds(443, 362, 80, 13);
		panelUser.add(lblId_1);

		nameUser = new JTextField();
		nameUser.setToolTipText("User Password");
		nameUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		nameUser.setColumns(10);
		nameUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		nameUser.setBackground(new Color(246, 246, 246));
		nameUser.setBounds(10, 452, 419, 40);
		panelUser.add(nameUser);

		JLabel lblId_2 = new JLabel("Tên tài khoản");
		lblId_2.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_2.setBounds(10, 432, 235, 24);
		panelUser.add(lblId_2);

		passwordUser = new JTextField();
		passwordUser.setToolTipText("User Password");
		passwordUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		passwordUser.setColumns(10);
		passwordUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		passwordUser.setBackground(new Color(246, 246, 246));
		passwordUser.setBounds(10, 522, 419, 40);
		panelUser.add(passwordUser);

		JLabel lblId_1_1 = new JLabel("Mật khẩu");
		lblId_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_1.setBounds(10, 496, 80, 24);
		panelUser.add(lblId_1_1);

		addressUser = new JTextField();
		addressUser.setToolTipText("User Password");
		addressUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		addressUser.setColumns(10);
		addressUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		addressUser.setBackground(new Color(246, 246, 246));
		addressUser.setBounds(443, 522, 419, 40);
		panelUser.add(addressUser);

		JLabel lblId_3 = new JLabel("Địa chỉ");
		lblId_3.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_3.setBounds(443, 496, 80, 24);
		panelUser.add(lblId_3);

		phoneUser = new JTextField();
		phoneUser.setToolTipText("User Password");
		phoneUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		phoneUser.setColumns(10);
		phoneUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		phoneUser.setBackground(new Color(246, 246, 246));
		phoneUser.setBounds(10, 592, 307, 40);
		panelUser.add(phoneUser);

		JLabel lblId_1_2 = new JLabel("Số điện thoại");
		lblId_1_2.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_2.setBounds(10, 566, 129, 24);
		panelUser.add(lblId_1_2);

		codeUser = new JTextField();
		codeUser.setToolTipText("User Password");
		codeUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		codeUser.setColumns(10);
		codeUser.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		codeUser.setBackground(new Color(246, 246, 246));
		codeUser.setBounds(327, 592, 313, 40);
		panelUser.add(codeUser);

		JLabel lblId_3_1 = new JLabel("CCCD");
		lblId_3_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_3_1.setBounds(327, 572, 80, 13);
		panelUser.add(lblId_3_1);

		JLabel lblId_1_2_1 = new JLabel("Vai trò");
		lblId_1_2_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_2_1.setBounds(650, 572, 80, 20);
		panelUser.add(lblId_1_2_1);

		roleUser = new JComboBox();
		roleUser.setBorder(null);
		roleUser.setModel(new DefaultComboBoxModel(roles));
		roleUser.setBackground(new Color(246, 246, 246));
		roleUser.setFont(new Font("Roboto", Font.PLAIN, 15));
		roleUser.setBounds(650, 592, 212, 40);
		panelUser.add(roleUser);

		dateUser = new JDateChooser();
		dateUser.getCalendarButton().setText("Pick");
		dateUser.getJCalendar().setBackground(new Color(246, 246, 246));
		dateUser.getCalendarButton().setBackground(new Color(0, 100, 250));
		dateUser.setDateFormatString("yyyy-MM-dd");
		dateUser.setBounds(443, 452, 419, 40);
		panelUser.add(dateUser);

		JLabel lblId_2_2 = new JLabel("Ngày sinh");
		lblId_2_2.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_2_2.setBounds(443, 428, 80, 24);
		panelUser.add(lblId_2_2);

		JPanel panelVehicle = new JPanel();
		panelVehicle.setBorder(null);
		panelVehicle.setBackground(Color.WHITE);
		tabbedPane.addTab("Quản lý xe", null, panelVehicle, null);
		panelVehicle.setLayout(null);

		deleteVehicle = new JButton("Xóa");
		deleteVehicle.setForeground(Color.WHITE);
		deleteVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		deleteVehicle.setFocusPainted(false);
		deleteVehicle.setBorderPainted(false);
		deleteVehicle.setBackground(new Color(220, 53, 69));
		deleteVehicle.setBounds(772, 312, 90, 40);
		panelVehicle.add(deleteVehicle);

		searchVehicle = new JTextField();
		searchVehicle.setToolTipText("User Password");
		searchVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		searchVehicle.setColumns(10);
		searchVehicle.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		searchVehicle.setBackground(new Color(246, 246, 246));
		searchVehicle.setBounds(10, 312, 348, 40);
		panelVehicle.add(searchVehicle);

		updateVehicle = new JButton("Sửa");
		updateVehicle.setForeground(Color.WHITE);
		updateVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		updateVehicle.setFocusPainted(false);
		updateVehicle.setBorderPainted(false);
		updateVehicle.setBackground(new Color(255, 193, 7));
		updateVehicle.setBounds(672, 312, 90, 40);
		panelVehicle.add(updateVehicle);

		addVehicle = new JButton("Thêm");
		addVehicle.setForeground(Color.WHITE);
		addVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		addVehicle.setFocusPainted(false);
		addVehicle.setBorderPainted(false);
		addVehicle.setBackground(new Color(25, 135, 84));
		addVehicle.setBounds(572, 312, 90, 40);
		panelVehicle.add(addVehicle);

		JButton viewVehicle = new JButton("Xem");
		viewVehicle.setForeground(Color.WHITE);
		viewVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		viewVehicle.setFocusPainted(false);
		viewVehicle.setBorderPainted(false);
		viewVehicle.setBackground(new Color(65, 194, 203));
		viewVehicle.setBounds(472, 312, 90, 40);
		panelVehicle.add(viewVehicle);

		JButton searchUser_1 = new JButton("Tìm");
		searchUser_1.setForeground(Color.WHITE);
		searchUser_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		searchUser_1.setFocusPainted(false);
		searchUser_1.setBorderPainted(false);
		searchUser_1.setBackground(new Color(13, 202, 240));
		searchUser_1.setBounds(368, 312, 90, 40);
		panelVehicle.add(searchUser_1);

		idVehicle = new JTextField();
		idVehicle.setToolTipText("User Password");
		idVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		idVehicle.setColumns(10);
		idVehicle.disable();
		idVehicle.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		idVehicle.setBackground(new Color(246, 246, 246));
		idVehicle.setBounds(10, 382, 419, 40);
		panelVehicle.add(idVehicle);

		JLabel lblId_4 = new JLabel("Id");
		lblId_4.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_4.setBounds(10, 362, 80, 13);
		panelVehicle.add(lblId_4);

		nameVehicle = new JTextField();
		nameVehicle.setToolTipText("User Password");
		nameVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		nameVehicle.setColumns(10);
		nameVehicle.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		nameVehicle.setBackground(new Color(246, 246, 246));
		nameVehicle.setBounds(443, 382, 419, 40);
		panelVehicle.add(nameVehicle);

		JLabel lblId_1_3 = new JLabel("Tên xe");
		lblId_1_3.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_3.setBounds(443, 362, 80, 13);
		panelVehicle.add(lblId_1_3);

		colorVehicle = new JTextField();
		colorVehicle.setToolTipText("User Password");
		colorVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		colorVehicle.setColumns(10);
		colorVehicle.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		colorVehicle.setBackground(new Color(246, 246, 246));
		colorVehicle.setBounds(10, 452, 419, 40);
		panelVehicle.add(colorVehicle);

		JLabel lblId_2_1 = new JLabel("Màu");
		lblId_2_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_2_1.setBounds(10, 432, 80, 24);
		panelVehicle.add(lblId_2_1);

		typeVehicle = new JTextField();
		typeVehicle.setToolTipText("User Password");
		typeVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		typeVehicle.setColumns(10);
		typeVehicle.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		typeVehicle.setBackground(new Color(246, 246, 246));
		typeVehicle.setBounds(10, 522, 419, 40);
		panelVehicle.add(typeVehicle);

		JLabel lblId_1_1_1 = new JLabel("Ngày sản xuất");
		lblId_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_1_1.setBounds(440, 432, 134, 24);
		panelVehicle.add(lblId_1_1_1);

		JLabel lblId_3_2 = new JLabel("Loại  xe");
		lblId_3_2.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_3_2.setBounds(10, 502, 80, 24);
		panelVehicle.add(lblId_3_2);

		seat_capacityVehicle = new JTextField();
		seat_capacityVehicle.setToolTipText("User Password");
		seat_capacityVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		seat_capacityVehicle.setColumns(10);
		seat_capacityVehicle.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		seat_capacityVehicle.setBackground(new Color(246, 246, 246));
		seat_capacityVehicle.setBounds(443, 522, 419, 40);
		panelVehicle.add(seat_capacityVehicle);

		JLabel sdfsdfdsf = new JLabel("Phân khối");
		sdfsdfdsf.setFont(new Font("Roboto", Font.PLAIN, 15));
		sdfsdfdsf.setBounds(10, 572, 74, 24);
		panelVehicle.add(sdfsdfdsf);

		capacityVehicle = new JTextField();
		capacityVehicle.setToolTipText("User Password");
		capacityVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		capacityVehicle.setColumns(10);
		capacityVehicle.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		capacityVehicle.setBackground(new Color(246, 246, 246));
		capacityVehicle.setBounds(10, 595, 419, 40);
		panelVehicle.add(capacityVehicle);

		JLabel lblId_1_2_2 = new JLabel("Số chỗ ngồi");
		lblId_1_2_2.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_2_2.setBounds(443, 502, 119, 24);
		panelVehicle.add(lblId_1_2_2);
		brandVehicle = new JTextField();
		brandVehicle.setToolTipText("User Password");
		brandVehicle.setFont(new Font("Roboto", Font.PLAIN, 15));
		brandVehicle.setColumns(10);
		brandVehicle.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		brandVehicle.setBackground(new Color(246, 246, 246));
		brandVehicle.setBounds(443, 595, 419, 40);
		panelVehicle.add(brandVehicle);

		JLabel lblId_3_1_1 = new JLabel("Hãng xe");
		lblId_3_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_3_1_1.setBounds(443, 572, 80, 24);
		panelVehicle.add(lblId_3_1_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 852, 292);
		panelVehicle.add(scrollPane_1);

		tableVehicle = new JTable();
		tableVehicle.setRowHeight(30);
		scrollPane_1.setViewportView(tableVehicle);

		dateVehicle = new JDateChooser();
		dateVehicle.setDateFormatString("yyyy-MM-dd");
		dateVehicle.setBounds(443, 452, 419, 40);
		panelVehicle.add(dateVehicle);

		JPanel panelManage = new JPanel();
		panelManage.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		panelManage.setBackground(Color.WHITE);
		tabbedPane.addTab("Quản lý đăng ký", null, panelManage, null);
		panelManage.setLayout(null);

		deleteManage = new JButton("Xóa");
		deleteManage.setForeground(Color.WHITE);
		deleteManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		deleteManage.setFocusPainted(false);
		deleteManage.setBorderPainted(false);
		deleteManage.setBackground(new Color(220, 53, 69));
		deleteManage.setBounds(772, 312, 90, 40);
		panelManage.add(deleteManage);

		searchManage = new JTextField();
		searchManage.setToolTipText("User Password");
		searchManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		searchManage.setColumns(10);
		searchManage.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		searchManage.setBackground(new Color(246, 246, 246));
		searchManage.setBounds(10, 312, 348, 40);
		panelManage.add(searchManage);

		updateManage = new JButton("Sửa");
		updateManage.setForeground(Color.WHITE);
		updateManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		updateManage.setFocusPainted(false);
		updateManage.setBorderPainted(false);
		updateManage.setBackground(new Color(255, 193, 7));
		updateManage.setBounds(672, 312, 90, 40);
		panelManage.add(updateManage);

		addManage = new JButton("Thêm");
		addManage.setForeground(Color.WHITE);
		addManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		addManage.setFocusPainted(false);
		addManage.setBorderPainted(false);
		addManage.setBackground(new Color(25, 135, 84));
		addManage.setBounds(572, 312, 90, 40);
		panelManage.add(addManage);

		viewManage = new JButton("Xem");
		viewManage.setForeground(Color.WHITE);
		viewManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		viewManage.setFocusPainted(false);
		viewManage.setBorderPainted(false);
		viewManage.setBackground(new Color(65, 194, 203));
		viewManage.setBounds(472, 312, 90, 40);
		panelManage.add(viewManage);

		JButton se = new JButton("Tìm");
		se.setForeground(Color.WHITE);
		se.setFont(new Font("Roboto", Font.PLAIN, 15));
		se.setFocusPainted(false);
		se.setBorderPainted(false);
		se.setBackground(new Color(13, 202, 240));
		se.setBounds(368, 312, 90, 40);
		panelManage.add(se);

		idManage = new JTextField();
		idManage.setToolTipText("User Password");
		idManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		idManage.setColumns(10);
		idManage.disable();
		idManage.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		idManage.setBackground(new Color(246, 246, 246));
		idManage.setBounds(10, 382, 419, 40);
		panelManage.add(idManage);

		JLabel lblId_4_1 = new JLabel("Id");
		lblId_4_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_4_1.setBounds(10, 362, 80, 13);
		panelManage.add(lblId_4_1);

		JLabel lblId_1_3_1 = new JLabel("Tên người dùng");
		lblId_1_3_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_3_1.setBounds(439, 358, 134, 24);
		panelManage.add(lblId_1_3_1);

		nameManage = new JTextField();
		nameManage.setToolTipText("User Password");
		nameManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		nameManage.setColumns(10);
		nameManage.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		nameManage.setBackground(new Color(246, 246, 246));
		nameManage.setBounds(10, 525, 419, 40);
		panelManage.add(nameManage);

		JLabel Date = new JLabel("Ngày đăng kí");
		Date.setFont(new Font("Roboto", Font.PLAIN, 15));
		Date.setBounds(10, 432, 134, 24);
		panelManage.add(Date);

		JLabel lblId_1_1_1_1 = new JLabel("Tên xe");
		lblId_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_1_1_1.setBounds(439, 428, 100, 24);
		panelManage.add(lblId_1_1_1_1);

		JLabel Name = new JLabel("Tên đăng ký");
		Name.setFont(new Font("Roboto", Font.PLAIN, 15));
		Name.setBounds(10, 502, 134, 24);
		panelManage.add(Name);

		plateManage = new JTextField();
		plateManage.setToolTipText("User Password");
		plateManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		plateManage.setColumns(10);
		plateManage.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		plateManage.setBackground(new Color(246, 246, 246));
		plateManage.setBounds(443, 525, 419, 40);
		panelManage.add(plateManage);

		JLabel lblId_1_2_2_1 = new JLabel("Biển số xe");
		lblId_1_2_2_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_2_2_1.setBounds(443, 502, 119, 24);
		panelManage.add(lblId_1_2_2_1);

		nameUserManage = new JComboBox();
		nameUserManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		nameUserManage.setBorder(null);
		nameUserManage.setBackground(new Color(246, 246, 246));
		nameUserManage.setBounds(439, 382, 419, 40);
		panelManage.add(nameUserManage);

		nameVehicleManage = new JComboBox();
		nameVehicleManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		nameVehicleManage.setBorder(null);
		nameVehicleManage.setBackground(new Color(246, 246, 246));
		nameVehicleManage.setBounds(439, 452, 419, 40);
		panelManage.add(nameVehicleManage);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 10, 852, 291);
		panelManage.add(scrollPane_2);

		tableManage = new JTable();
		tableManage.setRowHeight(40);
		scrollPane_2.setViewportView(tableManage);

		dateManage = new JDateChooser();
		dateManage.setBounds(10, 455, 419, 39);
		dateManage.setDateFormatString("yyyy-MM-dd");
		panelManage.add(dateManage);

		engine_noMange = new JTextField();
		engine_noMange.setToolTipText("User Password");
		engine_noMange.setFont(new Font("Roboto", Font.PLAIN, 15));
		engine_noMange.setColumns(10);
		engine_noMange.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		engine_noMange.setBackground(new Color(246, 246, 246));
		engine_noMange.setBounds(10, 599, 419, 40);
		panelManage.add(engine_noMange);

		JLabel lblEngineno = new JLabel("Mã máy");
		lblEngineno.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblEngineno.setBounds(10, 576, 80, 24);
		panelManage.add(lblEngineno);

		chassis_noManage = new JTextField();
		chassis_noManage.setToolTipText("User Password");
		chassis_noManage.setFont(new Font("Roboto", Font.PLAIN, 15));
		chassis_noManage.setColumns(10);
		chassis_noManage.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
		chassis_noManage.setBackground(new Color(246, 246, 246));
		chassis_noManage.setBounds(443, 599, 419, 40);
		panelManage.add(chassis_noManage);

		JLabel lblId_1_2_2_1_1 = new JLabel("Số khung");
		lblId_1_2_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblId_1_2_2_1_1.setBounds(443, 576, 119, 24);
		panelManage.add(lblId_1_2_2_1_1);

		JPanel panelChart = new JPanel();
		panelChart.setBorder(null);
		panelChart.setBackground(Color.WHITE);
		tabbedPane.addTab("Biểu đố", null, panelChart, null);
		panelChart.setLayout(null);

		chartYear = new JComboBox();
		chartYear.setBounds(10, 10, 222, 33);
		panelChart.add(chartYear);

		JLabel lblNewLabel_2 = new JLabel("Chọn Theo Năm");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(261, 15, 245, 23);
		panelChart.add(lblNewLabel_2);

		panelChart1 = new JPanel();
		panelChart1.setBounds(10, 53, 857, 576);
		panelChart.add(panelChart1);
		setLocationRelativeTo(null);

		HomePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		UserPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		VehiclePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		ManagePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		ChartPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		String[] arrLabel = { "Sáng Tạo", "Hướng đến khách hàng", "Đoàn kết – Chuyên nghiệp",
				"Làm hết sức – Chơi hết mình", "Trung Thực – Chân Thành – Trách Nhiệm" };
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (index > 12) {
					index = 1;
				}
				if (indexLb > arrLabel.length - 1) {
					indexLb = 0;
				}

				Image image = new ImageIcon(path + "3 (" + index + ").png").getImage();
				Icon ic = new ImageIcon(
						image.getScaledInstance(slide.getWidth(), slide.getHeight(), image.SCALE_SMOOTH));
				slide.setIcon(ic);
				labelSlide.setText(arrLabel[indexLb].toUpperCase());
				index++;
				indexLb++;
			}
		});
		timer.start();

		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int index = tabbedPane.getSelectedIndex();
				if (index == 0) {
					HomePanel.setBackground(new Color(0, 100, 250));
					UserPanel.setBackground(new Color(0, 155, 245));
					VehiclePanel.setBackground(new Color(0, 155, 245));
					ManagePanel.setBackground(new Color(0, 155, 245));
					ChartPanel.setBackground(new Color(0, 155, 245));
				}
				if (index == 1) {
					UserPanel.setBackground(new Color(0, 100, 250));
					HomePanel.setBackground(new Color(0, 155, 245));
					VehiclePanel.setBackground(new Color(0, 155, 245));
					ManagePanel.setBackground(new Color(0, 155, 245));
					ChartPanel.setBackground(new Color(0, 155, 245));
				} else if (index == 2) {
					VehiclePanel.setBackground(new Color(0, 100, 250));
					HomePanel.setBackground(new Color(0, 155, 245));
					UserPanel.setBackground(new Color(0, 155, 245));
					ManagePanel.setBackground(new Color(0, 155, 245));
					ChartPanel.setBackground(new Color(0, 155, 245));
				} else if (index == 3) {
					ManagePanel.setBackground(new Color(0, 100, 250));
					HomePanel.setBackground(new Color(0, 155, 245));
					VehiclePanel.setBackground(new Color(0, 155, 245));
					UserPanel.setBackground(new Color(0, 155, 245));
					ChartPanel.setBackground(new Color(0, 155, 245));
				} else if (index == 4) {
					ChartPanel.setBackground(new Color(0, 100, 250));
					HomePanel.setBackground(new Color(0, 155, 245));
					ManagePanel.setBackground(new Color(0, 155, 245));
					VehiclePanel.setBackground(new Color(0, 155, 245));
					UserPanel.setBackground(new Color(0, 155, 245));
				}
			}
		});

	}

	public static void notification(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
