package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class YohCoba {
    private JButton btnMenu1;
    private JButton btnMenu2;
    private JTextField txtUangUser;
    private JButton submitButton;
    private JTextField txtTotal;
    private JTextArea txtHasil;
    private JButton btnReset;
    private JPanel myPanel;
    private JButton paket1Button;
    private JButton paket2Button;
    private JButton iyaButton;
    private JButton tidakButton;

    private static String menu="";
    private static int harga = 0;
    private static double diskon = 0;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Travel");
        frame.setContentPane(new YohCoba().myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    public YohCoba() {
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu = "";
                harga = 0;
                txtHasil.setText("");
                txtTotal.setText("");
                txtUangUser.setText("");
            }
        });
        btnMenu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(menu.equals("")){
                    menu = " ";
                    harga = harga+5000000;
                }else{
                    JOptionPane.showMessageDialog(null,"Hanya bisa memilih 1 Menu\n harap klik reset");
                }
            }
        });
        btnMenu2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(menu.equals("")){
                    menu = " ";
                    harga = harga+7000000;
                }else{
                    JOptionPane.showMessageDialog(null,"Hanya bisa memilih 1 Menu\n harap klik reset");
                }
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uangUser = txtUangUser.getText();
                if(menu.equals("") || uangUser.equals("")){
                    JOptionPane.showMessageDialog(null,"Harap memilih Paket dan masukkan uang !!");
                }else{
                    int uangCash = Integer.parseInt(uangUser);
                    if(harga>uangCash){
                        JOptionPane.showMessageDialog(null,"Jumlah uang kurang !!");
                    }else{
                        int total = uangCash - harga;
                        txtHasil.setText(menu);
                        txtTotal.setText(Integer.toString((int) total));
                    }
                }
            }
        });
        paket1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHasil.setText("Paket travel Kota tua Jakarta + Kepulauan Seribu, Harga Rp 5.000.000,0");
            }
        });
        paket2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHasil.setText("Paket travel Pulau Bali + Kepulauan Lombok, Harga Rp 7.000.000,0");
            }
        });
        iyaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                IDandPasswords idandPasswords = new IDandPasswords();

                LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

                txtHasil.setText("Anda terdaftar sebagai member");
                menu = " ";


            }
        });
        tidakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHasil.setText("Anda tidak terdaftar sebagai member");

            }
        });
    }
}

