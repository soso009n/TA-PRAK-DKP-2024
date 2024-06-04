package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaftarNarapidanaApp extends JFrame {
    private final CardLayout cardLayout;
    private final JPanel mainPanel;
    private final LoginPage loginPage;
    private final PrisonPage prisonPage;

    public DaftarNarapidanaApp() {
        setTitle("Aplikasi Daftar Narapidana");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        loginPage = new LoginPage(new SubmitListener());
        prisonPage = new PrisonPage(new BackListener(), new LogoutListener());

        mainPanel.add(loginPage, "Login");
        mainPanel.add(prisonPage, "Prison");

        add(mainPanel);
        showLoginPage();
    }

    private void showLoginPage() {
        cardLayout.show(mainPanel, "Login");
    }

    private void showPrisonPage() {
        cardLayout.show(mainPanel, "Prison");
    }

    private class SubmitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = loginPage.getUsername();
            String password = loginPage.getPassword();
            if (username.equals("admin") && password.equals("admin")) {
                showPrisonPage();
            } else {
                JOptionPane.showMessageDialog(DaftarNarapidanaApp.this, "Username atau password salah!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class BackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            showLoginPage();
        }
    }

    private class LogoutListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            showLoginPage();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DaftarNarapidanaApp().setVisible(true);
            }
        });
    }
}
