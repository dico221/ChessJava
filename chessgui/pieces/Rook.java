package chessgui.pieces;

import chessgui.GamePanel;

public class Rook extends Piece{
    public Rook(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.WHITE){
            image = getImage("/sprites/w-rook");
        }
        else{
            image = getImage("/sprites/b-rook");
        }
    }
}
