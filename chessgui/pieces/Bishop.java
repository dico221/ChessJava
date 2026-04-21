package chessgui.pieces;

import chessgui.GamePanel;

public class Bishop extends Piece{
    public Bishop(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.WHITE){
            image = getImage("/sprites/w-bishop");
        }
        else{
            image = getImage("/sprites/b-bishop");
        }
    }
}
