package piece;

import main.GamePanel;
import main.Type;

public class Bishop extends Piece{
    public Bishop(int col, int row, int color) {
        super(col, row, color);

        type = Type.BISHOP;

        if (color == GamePanel.WHITE) {
            image = getImage("/piece/w-bishop");
        }else {
            image = getImage("/piece/b-bishop");
        }
    }

    public boolean canMove(int targetCol, int targetRow){

        if (isWithThinBoard(targetCol, targetRow) && !isSameSquare(targetCol, targetRow)){

            if (Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)) {
                return isValidSquare(targetCol, targetRow) && !pieceIsOnDiagonalLine(targetCol, targetRow);
            }
        }

        return false;
    }
}
