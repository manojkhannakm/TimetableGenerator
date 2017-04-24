package com.manojkhannakm.timetablegenerator;

import com.manojkhannakm.timetablegenerator.swing.Frame;

import javax.swing.*;

/**
 * @author Manoj Khanna
 */

public class TimetableGenerator {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(Frame::new);
    }

}
