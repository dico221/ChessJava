package chessgui.pieces;

import chessgui.GamePanel;

public class Queen extends Piece{
    public Queen(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.WHITE){
            image = getImage("/sprites/w-queen");
        }
        else{
            image = getImage("/sprites/b-queen");
        }
    }
}
