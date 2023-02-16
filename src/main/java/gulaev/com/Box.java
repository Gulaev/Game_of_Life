package gulaev.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static gulaev.com.Config.SIZE;

public class Box extends JPanel {

    Cell cell;

    public Box (int x, int y) {
        super();
        cell = new Cell();
        setBounds(x * Config.SIZE,y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Config.getColor(Status.NONE));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cell.turn();
            }
        });
    }

    public void setColor() {
        setBackground(Config.getColor(cell.status));
    }

    public void step1() {
        cell.step1();
        setColor();
    }
    public void step2() {
        cell.step2();
        setColor();
    }
}
