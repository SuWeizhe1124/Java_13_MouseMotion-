
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Java_13_MouseMotion extends Frame {
    Java_13_MouseMotion(){
        this.setLocation(100,50);
        this.setTitle("Mouse Motion");
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() { //此處是使用內嵌類別委任視窗事件
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Java_13_MouseMotion frm = new Java_13_MouseMotion();
        frm.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x,y;
                Graphics g;
                x=e.getX();
                y=e.getY();
                g=frm.getGraphics();
                g.fillRect(x,y,2,2);
                frm.setTitle("x="+x+"y="+y);
            }
            public void mouseMoved(MouseEvent e){
                Point p; //取得座標,美觀用
                p=e.getPoint();
                frm.setTitle(p.toString());
            }
        });
    }
}