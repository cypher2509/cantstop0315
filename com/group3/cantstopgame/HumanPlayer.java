
/**
 * @author Dong han
 */

package com.group3.cantstopgame;
import javax.swing.*;
import java.awt.*;

public class HumanPlayer extends Player
{

    public HumanPlayer(String name) {
        super(name);

    }

    public void move(GUIclass gui) {
        int[] runners = getRunnerPlaces();
//        for (int i=0;i<runners.length;i++) {
//            String buttonName = "jButton" + Integer.toString(runners[i]);
////            JPanel jPanel = GUIclass.getjPanel2();
//            System.out.println(buttonName);
//            JButton button = gui.findButton(buttonName);
//            System.out.println(button.getName());
//            if (button != null) {
//                button.setBackground(Color.BLUE);
//            }

        }

    }

//    private JButton findButton(Frame frame, String  buttonName) {
////        Container container = frame.getComponents();
//        Component[] components = frame.getComponents();
//        System.out.println(frame.getName());
//        for (Component component:components) {
//            System.out.println(component.getName());
//            if (component instanceof JButton && component.getName().equals(buttonName)) {
//                return (JButton) component;
//            }
//        }
//        return null;
//    }

//}
