/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piece;

import chess.Board;
import chess.Position;

/**
 *
 * @author Antou
 */
public class Queen extends Piece{

    public Queen(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public Boolean isValidMove(Board b, Position s, Position e) {
        if (b.getPiece(e) != null && b.getPiece(s).isWhite == b.getPiece(e).isWhite) {
            return false;
        }

        int diffX = Math.abs(s.x - e.x);
        int diffY = Math.abs(s.y - e.y);
        if (diffX != 0 && diffY != 0 && diffX != diffY) {
            return false;
        }

        //check pieces in between these two positions
        int num = numberOfPiecesBetween(b, s, e);
        if(num > 2){
            return false;
        }
        else if(num == 2 && b.getPiece(e) == null){
            return false;
        }

        return true;
    }

    @Override
    public void applyMove(Board b, Position s, Position e) {
    }

    @Override
    public String toString() {
        return super.toString()+'Q'; 
    }
    
    
}