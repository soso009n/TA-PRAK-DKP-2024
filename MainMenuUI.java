package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuUI extends JFrame {
    private JButton malePrisonButton;
    private JButton femalePrisonButton;
    private JButton juvenilePrisonButton;
    private JButton logoutButton;

    public MainMenuUI() {
        setTitle("Main Menu - Daftar Narapidana");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        malePrisonButton = new JButton("Penjara Laki-Laki");
        malePrisonButton.setBounds(10, 10, 160, 25);
        malePrisonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrisonUI malePrisonUI = new PrisonUI("Penjara Laki-Laki");
                malePrisonUI.setVisible(true);
                dispose();
            }
        });
        panel.add(malePrisonButton);

        femalePrisonButton = new JButton("Penjara Perempuan");
        femalePrisonButton.setBounds(200, 10, 160, 25);
        femalePrisonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrisonUI femalePrisonUI = new PrisonUI("Penjara Perempuan");
                femalePrisonUI.setVisible(true);
                dispose();
            }
        });
        panel.add(femalePrisonButton);

        juvenilePrisonButton = new JButton("Penjara Anak-Anak");
        juvenilePrisonButton.setBounds(10, 50, 160, 25);
        juvenilePrisonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrisonUI juvenilePrisonUI = new PrisonUI("Penjara Anak-Anak");
                juvenilePrisonUI.setVisible(true);
                dispose();
            }
        });
        panel.add(juvenilePrisonButton);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(200, 50, 160, 25);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginUI loginUI = new LoginUI();
                loginUI.setVisible(true);
                dispose();
            }
        });
        panel.add(logoutButton);

        add(panel);
    }
}


