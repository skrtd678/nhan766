import javax.swing.*;
import java.awt.*;

public class UserUI extends JFrame {
    public UserUI() {
        setTitle("Bảng điều khiển người dùng");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Xin chào USER!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        add(label, BorderLayout.CENTER);
    }
}
