import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    // Komponen
    private JLabel userLabel, passLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton masukButton, keluarButton;
    private JCheckBox tampilpassCheckBox;

    // Daftar username dan password yang valid
    private String[][] credentials = { { "Pauziah", "admin123" }, { "iip", "user123" } };

    public Main() {
        // Set judul framea
        super("Login");

        // Set layout frame
        setLayout(new GridLayout(4, 2));

        // Buat komponen
        userLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");
        userField = new JTextField(20);
        passField = new JPasswordField(20);
        masukButton = new JButton("Masuk");
        keluarButton = new JButton("Keluar");
        tampilpassCheckBox = new JCheckBox("Tampilkan Password");

        // Tambahkan komponen ke frame
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(masukButton);
        add(keluarButton);
        add(new JLabel(""));
        add(tampilpassCheckBox);

        // Set event listener
        masukButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Proses login
                if (login(userField.getText(), new String(passField.getPassword()))) {
                    JOptionPane.showMessageDialog(Main.this, "Login berhasil!");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Username atau password salah!");
                }
            }
        });

        keluarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Keluar dari aplikasi
                System.exit(0);
            }
        });

        tampilpassCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Tampilkan atau sembunyikan password
                if (tampilpassCheckBox.isSelected()) {
                    passField.setEchoChar((char) 0);
                } else {
                    passField.setEchoChar('\u2022');
                }
            }
        });

        // Set default frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setVisible(true);
    }

    private boolean login(String username, String password) {
        for (String[] credential : credentials) {
            if (credential[0].equals(username) && credential[1].equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Main();
    }
}
