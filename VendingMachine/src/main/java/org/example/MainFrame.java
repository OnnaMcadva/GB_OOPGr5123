package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import org.example.Services.VendingMachine;

public class MainFrame extends JFrame {


    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;

    JLabel lbAssort;
    JLabel lbWelcome;

    public void initialize() {


        JLabel lbFirstName = new JLabel("Выбирайте продукт из ассортимента, пожалуйста");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("А теперь накидайте монет");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);


        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);


        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        lbAssort = new JLabel();
        lbAssort.setFont(mainFont);
        //lbAssort.();


        JButton btnOk = new JButton("Купить товар");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();

                lbWelcome.setText("Заберите " + firstName + " в окошке внизу " + lastName);



            }

        });


        JButton btnClear = new JButton("Очистить поля ввода");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");

            }

        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        mainPanel.add(formPanel, BorderLayout.NORTH);


        mainPanel.add(lbWelcome, BorderLayout.CENTER);


        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);


        setTitle("VendingMachines");
        setSize(600, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


}