package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrisonUI extends JFrame {
    private String prisonType;
    private JButton backButton;
    private JButton logoutButton;

    public PrisonUI(String prisonType) {
        this.prisonType = prisonType;
        setTitle(prisonType + " - Daftar Narapidana");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel(prisonType);
        titleLabel.setBounds(10, 10, 200, 25);
        titleLabel.setForeground(Color.RED); // Warna merah
        panel.add(titleLabel);

        // Add more UI elements based on prison type and prisoner categories

        backButton = new JButton("Back");
        backButton.setBounds(10, 320, 100, 25);
        backButton.setBackground(Color.GREEN); // Warna hijau
        backButton.setForeground(Color.WHITE); // Warna teks putih
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenuUI mainMenu = new MainMenuUI();
                mainMenu.setVisible(true);
                dispose();
            }
        });
        panel.add(backButton);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(470, 320, 100, 25);
        logoutButton.setBackground(Color.WHITE); // Warna putih
        logoutButton.setForeground(Color.BLACK); // Warna teks hitam
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
