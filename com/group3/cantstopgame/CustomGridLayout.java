package com.group3.cantstopgame;

import java.awt.*;
import javax.swing.*;

public class CustomGridLayout extends GridLayout {

    private int[] rowHeights;

    public CustomGridLayout(int rows, int cols, int[] rowHeights) {
        super(rows, cols);
        this.rowHeights = rowHeights;
    }

    public void layoutContainer(Container parent) {
        super.layoutContainer(parent);
        int y = 0;
        int numComponents = parent.getComponentCount();
        int numTotalComponents = getRows() * getColumns();
        if (numComponents < numTotalComponents) {
            for (int i = numComponents; i < numTotalComponents; i++) {
                JLabel blank = new JLabel();
                blank.setPreferredSize(new Dimension(0, 0));
                parent.add(blank);
            }
        }
        for (int i = 0; i < numComponents; i += getColumns()) {
            int rowHeight = rowHeights[i / getColumns()];
            for (int j = 0; j < getColumns(); j++) {
                Component c = parent.getComponent(i + j);
                c.setBounds(c.getX(), y, c.getWidth(), rowHeight);
            }
            y += rowHeight;
        }
    }

}
