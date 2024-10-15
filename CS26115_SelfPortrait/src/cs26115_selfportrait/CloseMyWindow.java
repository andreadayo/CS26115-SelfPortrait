/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs26115_selfportrait;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Dhea
 */
public class CloseMyWindow extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

