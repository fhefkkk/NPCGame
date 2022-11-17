import javax.swing.JFrame;

public class GamWin extends JFrame {
    public void launch() {
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口大小
        this.setSize(400, 400);
        //设置窗口位置
        this.setLocationRelativeTo(null);
        //设置窗口标题
        this.setTitle("RPGGame");
    }

    public static void main(String[] args) {
        GamWin gamWin = new GamWin();
        gamWin.launch();
    }
}
