package chessgui.pieces;

import chessgui.GamePanel;

public class Pawn extends Piece{
    public Pawn(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.WHITE){
            image = getImage("/sprites/w-pawn");
        }
        else{
            image = getImage("/sprites/b-pawn");
        }
    }
}
