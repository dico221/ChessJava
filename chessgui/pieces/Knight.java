package chessgui.pieces;

import chessgui.GamePanel;

public class Knight extends Piece{
    public Knight(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.WHITE){
            image = getImage("/sprites/w-knight");
        }
        else{
            image = getImage("/sprites/b-knight");
        }
    }
}
