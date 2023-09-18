import javax.swing.JFrame;
import java.awt.*;
//IMPORTS NECESSARY FOR THE FRAME

public class GameFrame extends JFrame{

    static int SCREEN_WIDTH = 1000;
    static int SCREEN_HEIGHT = 1000;
    //HEIGHT AND WIDTH OF THE FRAME
    GameFrame(){
        JFrame frame = new JFrame();//CALSS THE FRAME
        frame.add(new Stone());//ADDS THE STONE CLASS THAT HOLDS THE HAILSTONE SEQUENCE
        frame.setTitle("SEQUENCING...");//TITLE OF THE FRAME
        frame.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));//SETS DIMENSIONS FOR THE FRAME
        frame.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//FRAME QUITS WHEN CLOSED
        frame.setResizable(false);
        frame.pack();//PACKS THE FRAME
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);//PUTS FRAME IN THE MIDDLE OF SCREEN


    }
}
