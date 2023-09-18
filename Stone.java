import java.awt.*;
import javax.swing.JPanel;
//IMPORTS NECESSARY FOR THE GRAPHICS
public class Stone extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g, 50);
        //CALLS FOR THE DRAW METHOD
    }

    public void draw(Graphics g,int x) {
        int z = 0;//USED AS THE Y POSITION OF LABEL
        int font_size = 10;//FONT SIZE FOR LABEL
        int Space_Out = 20;//THE NUMBER THE HORIZONTAL COLUMNS ARE SPACED OUT BY
        for (int i = x; i > 1; ) {
            //LOOP FUNCTIONS BY SETTING A NEW VARIABLE (i) EQUAL TO THE NUMBER INPUT
            if ((i % 2) > 0) {
                //IF THE NUMBER IS ODD THE, MULTIPLY BY 3 THEN ADD 1 AND STORES THE RESULT IN i
                for (int l = i; l > 0; l--) {
                    //THIS LOOP ADDS A STRING LABEL FOR THE QUANTITY OF THE NUMBER PRODUCED
                    g.setColor(Color.blue);
                    g.setFont(new Font("Ink Free", Font.BOLD, font_size));
                    g.drawString("X", z, l*font_size);
                }
                i = i * 3 + 1;
                z += Space_Out;
            }
            else {
                //IF THE NUMBER IS EVEN IT IS HALFED THEN STORED IN i
                for (int b = i; b > 0; b--) {
                    g.setColor(Color.red);
                    g.setFont(new Font("Ink Free", Font.BOLD, font_size));
                    g.drawString("X", z, b*font_size);
                }
                i = i / 2;
                z += Space_Out;
            }
        }
    }
}
