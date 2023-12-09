/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.chatapplication;

/**
 *
 * @author HP-PC
 */
public class ChatApplication {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new boxChat().setVisible(true);
            }
        });
    }
}
