import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JFrame implements ActionListener {
  JRadioButton redButton, greenButton, blueButton;
  JLabel textLabel;

  public RadioButton() {
    super("Radio Button Example");
    setSize(400, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    // Buat radio button untuk warna merah
    redButton = new JRadioButton("Merah");
    redButton.setActionCommand("merah");
    redButton.addActionListener(this);

    // Buat radio button untuk warna hijau
    greenButton = new JRadioButton("Hijau");
    greenButton.setActionCommand("hijau");
    greenButton.addActionListener(this);

    // Buat radio button untuk warna biru
    blueButton = new JRadioButton("Biru");
    blueButton.setActionCommand("biru");
    blueButton.addActionListener(this);

    // Tambahkan radio button ke dalam group button
    ButtonGroup group = new ButtonGroup();
    group.add(redButton);
    group.add(greenButton);
    group.add(blueButton);

    // Tambahkan label untuk menampilkan teks
    textLabel = new JLabel("Warna Teks");
    add(textLabel);

    // Tambahkan radio button ke dalam frame
    add(redButton);
    add(greenButton);
    add(blueButton);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    // Mengambil aksi command dari radio button yang dipilih
    String actionCommand = e.getActionCommand();

    // Ubah warna teks sesuai dengan radio button yang dipilih
    if (actionCommand.equals("merah")) {
      textLabel.setForeground(Color.RED);
    } else if (actionCommand.equals("hijau")) {
      textLabel.setForeground(Color.GREEN);
    } else if (actionCommand.equals("biru")) {
      textLabel.setForeground(Color.BLUE);
    }
  }

  public static void main(String[] args) {
    new RadioButton();
  }
}
