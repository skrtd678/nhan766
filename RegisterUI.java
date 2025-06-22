import javax.swing.*;
import java.awt.*;

public class RegisterUI extends JFrame {
    public RegisterUI() {
        setTitle("Đăng ký tài khoản");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("ĐĂNG KÝ", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setBounds(90, 10, 160, 30);
        add(title);

        JLabel userLabel = new JLabel("Tài khoản:");
        userLabel.setBounds(40, 50, 80, 25);
        add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(120, 50, 160, 25);
        add(userField);

        JLabel passLabel = new JLabel("Mật khẩu:");
        passLabel.setBounds(40, 90, 80, 25);
        add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(120, 90, 160, 25);
        add(passField);

        JButton registerBtn = new JButton("Đăng ký");
        registerBtn.setBounds(60, 140, 100, 30);
        add(registerBtn);

        JButton backBtn = new JButton("Quay lại");
        backBtn.setBounds(180, 140, 100, 30);
        add(backBtn);

        registerBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            // Gọi DAO để lưu vào CSDL (sẽ thêm sau nếu có Hibernate)
            JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
            dispose();
            new LoginUI().setVisible(true);
        });

        backBtn.addActionListener(e -> {
            dispose();
            new LoginUI().setVisible(true);
        });
    }
}
