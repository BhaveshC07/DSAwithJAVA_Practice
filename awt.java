
import java.awt.*;
import java.awt.event.*;
public class awt {

    public static void main(String[] args) {
        Frame f = new Frame("Simple Frame with Canvas");
        //A Canvas control represents a rectangular area where application can draw something or can receive inputs created by user.
        Canvas canvas = new Canvas();
        canvas.setSize(200, 150); // Set the size of the canvas

        f.setLayout(new FlowLayout());
        f.add(canvas); // Add the canvas to the frame

        f.setSize(400, 400);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

