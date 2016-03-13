package com.manojkhannakm.timetablegenerator.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Manoj Khanna
 */

public class TableEditor extends JDialog {

    protected TableEditor(Frame frame, String title) {
        super(frame, title, true);

        setLayout(new GridBagLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);

//        add();

        pack();
        setLocationRelativeTo(frame);
        setVisible(true);
    }

//    protected abstract

    private class ComponentRow {


    }

}
