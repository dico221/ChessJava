package chessgui;

import javax.swing.JFrame;

public class Main {
   public static void main(String[] args) {
        JFrame window = new JFrame("Scacchi con la gui in java");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gp.launchGame();

   } 
}
