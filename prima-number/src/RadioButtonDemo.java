import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo extends JFrame {
  JRadioButton redButton, yellowButton, greenButton, blackButton, orangeButton;
  JLabel textLabel;

  public RadioButtonDemo() {
    super("Programming is fun");
    setSize(400, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    redButton = new JRadioButton("Red");
    redButton.setActionCommand("Red");

    yellowButton = new JRadioButton("Yellow");
    yellowButton.setActionCommand("Yellow");

    blackButton = new JRadioButton("Black");
    blackButton.setActionCommand("Black");

    orangeButton = new JRadioButton("Orange");
    orangeButton.setActionCommand("Orange");

    greenButton = new JRadioButton("Green");
    greenButton.setActionCommand("Green");

    // Add radio button ke group button
    ButtonGroup group = new ButtonGroup();
    group.add(redButton);
    group.add(yellowButton);
    group.add(blackButton);
    group.add(orangeButton);
    group.add(greenButton);

    // Add radio button ke frame
    add(redButton);
    add(yellowButton);
    add(blackButton);
    add(orangeButton);
    add(greenButton);

    setVisible(true);
  }

  public static void main(String[] args) {
    new RadioButtonDemo();
  }
}
