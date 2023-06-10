import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JFrame implements ActionListener {
  JRadioButton redButton, yellowButton, greenButton, blackButton, orangeButton;
  JLabel textLabel;

  public RadioButton() {
    super("Programming is fun");
    setSize(400, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    // Tambahkan label untuk menampilkan teks
    textLabel = new JLabel("Programming is fun");

    redButton = new JRadioButton("Red");
    redButton.setActionCommand("Red");
    redButton.addActionListener(this);

    yellowButton = new JRadioButton("Yellow");
    yellowButton.setActionCommand("Yellow");
    yellowButton.addActionListener(this);

    blackButton = new JRadioButton("Black");
    blackButton.setActionCommand("Black");
    blackButton.addActionListener(this);

    orangeButton = new JRadioButton("Orange");
    orangeButton.setActionCommand("Orange");
    orangeButton.addActionListener(this);

    greenButton = new JRadioButton("Green");
    greenButton.setActionCommand("Green");
    greenButton.addActionListener(this);

    JPanel vertical = new JPanel(new GridLayout(1, 1));
    // Add radio button ke group button
    ButtonGroup group = new ButtonGroup();
    group.add(redButton);
    group.add(yellowButton);
    group.add(blackButton);
    group.add(orangeButton);
    group.add(greenButton);
    vertical.add(textLabel);

    // Add radio button ke frame
    add(redButton);
    add(yellowButton);
    add(blackButton);
    add(orangeButton);
    add(greenButton);
    add(vertical);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    // Mengambil aksi command dari radio button yang dipilih
    String actionCommand = e.getActionCommand();

    // Kondisi untuk merubah warna teks
    if (actionCommand.equals("Red")) {
      textLabel.setForeground(Color.RED);
    } else if (actionCommand.equals("Yellow")) {
      textLabel.setForeground(Color.YELLOW);
    } else if (actionCommand.equals("Black")) {
      textLabel.setForeground(Color.BLACK);
    } else if (actionCommand.equals("Orange")) {
      textLabel.setForeground(Color.ORANGE);
    } else if (actionCommand.equals("Green")) {
      textLabel.setForeground(Color.GREEN);
    }
  }

  public static void main(String[] args) {
    new RadioButton();
  }
}
