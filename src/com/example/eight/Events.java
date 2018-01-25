package com.example.eight;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events {

    public static void main(String[] args) {

        JButton button = new JButton("Click me!");

        // Classic event handler
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // TODO process event here
            }
        });

        // Lambdas event handler
        button.addActionListener(evt -> {
            // TODO process event here
        });
    }

}
