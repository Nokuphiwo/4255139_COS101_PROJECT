package sprint3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Gui_4255139 {
    private JFrame frame;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField userNameField;
    private JTextField emailField;
    private JTextField accountNumberField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;

    public Gui_4255139() {
        frame = new JFrame("SNP Bank Application Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(8,2));

        JLabel firstNameLabel = new JLabel("Name:");
        firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Surname:");
        lastNameField = new JTextField();

        JLabel userNameLabel = new JLabel("User Name:");
        userNameField = new JTextField();

        JLabel emailLabel = new JLabel("Email Address:");
        emailField = new JTextField();

        JLabel accountNumberLabel = new JLabel("Account Number:");
        accountNumberField = new JTextField();

        JLabel passwordLabel = new JLabel("Password/Pin:");
        passwordField = new JPasswordField();

        JLabel confirmPasswordLabel = new JLabel("Confirm Password/Pin:");
        confirmPasswordField = new JPasswordField();

        JButton registerButton = new JButton("Register");

        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(userNameLabel);
        frame.add(userNameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(accountNumberLabel);
        frame.add(accountNumberField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);

        frame.add(new JLabel());
        frame.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });

        frame.setVisible(true);
    }

    private void registerUser() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String userName = userNameField.getText();
        String email = emailField.getText();
        String accountNumber = accountNumberField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (password.equals(confirmPassword)) {
            // Registration successful, display information and write to a file
            String userInfo = "Name and surname: " + firstName + " " + lastName + "\n" +
                    "User name: " + userName + "\n" +
                    "User email: " + email + "\n" +
                    "User account number: " + accountNumber + "\n" +
                    "User password: " + password;

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registration_info.txt"))) {
                writer.write(userInfo);
                JOptionPane.showMessageDialog(frame, "User Registration Successful! Welcome to SNP Bank");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error writing to file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Passwords do not match. Registration failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Gui_4255139();
            }
        });
    }
}


        
            
    
