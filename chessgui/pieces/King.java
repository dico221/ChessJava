package chessgui.pieces;

import chessgui.GamePanel;

public class King extends Piece{
    public King(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.WHITE){
            image = getImage("/sprites/w-king");
        }
        else{
            image = getImage("/sprites/b-king");
        }
    }
}
