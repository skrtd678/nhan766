import javax.swing.*;
import java.awt.*;

public class LoginUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginUI() {
        setTitle("Đăng nhập hệ thống");
        setSize(420, 340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(245, 250, 255)); // màu nền sáng

        // 👉 Ảnh người dùng
        ImageIcon icon = new ImageIcon("user.png"); // cần có file "user.png" cùng thư mục
        Image img = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        JLabel iconLabel = new JLabel(new ImageIcon(img));
        iconLabel.setBounds(160, 10, 80, 80);
        add(iconLabel);

        JLabel title = new JLabel("HỆ THỐNG SINH VIÊN", SwingConstants.CENTER);
        title.setBounds(80, 90, 260, 30);
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        title.setForeground(new Color(0, 102, 204)); // xanh dương
        add(title);

        JLabel userLabel = new JLabel("Tài khoản:");
        userLabel.setBounds(50, 130, 80, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(140, 130, 200, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Mật khẩu:");
        passLabel.setBounds(50, 170, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 170, 200, 25);
        add(passwordField);

        JButton loginBtn = new JButton("Đăng nhập");
        loginBtn.setBounds(50, 220, 120, 30);
        loginBtn.setBackground(new Color(0, 102, 204));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);
        add(loginBtn);

        JButton registerBtn = new JButton("Đăng ký");
        registerBtn.setBounds(210, 220, 120, 30);
        registerBtn.setBackground(new Color(153, 204, 255));
        registerBtn.setFocusPainted(false);
        add(registerBtn);

        JButton forgotBtn = new JButton("Quên mật khẩu");
        forgotBtn.setBounds(120, 265, 160, 25);
        forgotBtn.setFocusPainted(false);
        forgotBtn.setBorderPainted(false);
        forgotBtn.setContentAreaFilled(false);
        forgotBtn.setForeground(Color.BLUE);
        add(forgotBtn);

        loginBtn.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());
            User u = UserDAO.login(user, pass);

            if (u != null) {
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                dispose();
                if (u.role.equals("admin"))
                    new AdminUI().setVisible(true);
                else
                    new UserUI().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        });

        registerBtn.addActionListener(e -> {
            dispose();
            new RegisterUI().setVisible(true);
        });

        forgotBtn.addActionListener(e -> {
            dispose();
            new ForgotPasswordUI().setVisible(true);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginUI().setVisible(true));
    }
}
