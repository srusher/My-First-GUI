import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.*;

public class GUI implements ActionListener{

    private JFrame frame;
    private JPanel panel;

    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel fullNameLabel;

    private JTextField firstName;
    private JTextField lastName;
    private JTextField fullName;

    private JButton buttonName;
    private JButton buttonClear;
    private JLabel labelAuthor;


    public GUI() {
        frame = new JFrame();

        firstNameLabel = new JLabel("Enter First Name:");
        firstName = new JTextField(15);

        lastNameLabel = new JLabel("Enter Last Name:");
        lastName = new JTextField(15);

        fullNameLabel = new JLabel("Full Name:");
        fullName = new JTextField(31);
        fullName.setEditable(false);

        buttonName = new JButton("Create Full Name");
        buttonName.addActionListener(this);

        buttonClear = new JButton("Clear Names");
        buttonClear.addActionListener(this);

        labelAuthor = new JLabel("Author: Sam Rusher");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(firstNameLabel);
        panel.add(firstName);
        panel.add(lastNameLabel);
        panel.add(lastName);
        panel.add(fullNameLabel);
        panel.add(fullName);

        panel.add(buttonName);
        panel.add(buttonClear);
        panel.add(labelAuthor);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new GUI();

    }


    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == buttonName) {
        fullName.setText(firstName.getText() + " "+ lastName.getText());
        }
        else if (e.getSource() == buttonClear){
            firstName.setText("");
            lastName.setText("");
            fullName.setText("");
        }
    }

}
