import javax.swing.*;
import java.awt.*;

public class AdminUI extends JFrame {
    public AdminUI() {
        setTitle("Bảng điều khiển Admin");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Xin chào ADMIN!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        add(label, BorderLayout.CENTER);
    }
}
