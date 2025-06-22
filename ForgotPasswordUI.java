import javax.swing.*;
import java.awt.*;

public class ForgotPasswordUI extends JFrame {
    public ForgotPasswordUI() {
        setTitle("Quên mật khẩu");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("QUÊN MẬT KHẨU", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setBounds(90, 10, 180, 30);
        add(title);

        JLabel userLabel = new JLabel("Tài khoản:");
        userLabel.setBounds(40, 60, 80, 25);
        add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(120, 60, 160, 25);
        add(userField);

        JLabel newPassLabel = new JLabel("Mật khẩu mới:");
        newPassLabel.setBounds(40, 100, 100, 25);
        add(newPassLabel);

        JPasswordField newPassField = new JPasswordField();
        newPassField.setBounds(140, 100, 140, 25);
        add(newPassField);

        JButton resetBtn = new JButton("Đặt lại");
        resetBtn.setBounds(60, 150, 100, 30);
        add(resetBtn);
         JButton backBtn = new JButton("Quay lại");
        backBtn.setBounds(180, 150, 100, 30);
        add(backBtn);
        backBtn.setBounds(180, 150, 100, 30);
        add(backBtn);

        resetBtn.addActionListener(e -> {
            String user = userField.getText();
            String newPass = new String(newPassField.getPassword());
            // Gọi DAO để cập nhật mật khẩu trong DB
            JOptionPane.showMessageDialog(this, "Đặt lại mật khẩu thành công!");
            dispose();
            new LoginUI().setVisible(true);
        });

        backBtn.addActionListener(e -> {
            dispose();
            new LoginUI().setVisible(true);
        });
    }
}
