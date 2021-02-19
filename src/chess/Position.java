/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Antou
 */
public class Position {

    /**
     * The positions x and y of the board.
     */
    public Integer x, y;

    public Position(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public Position(String s){
        s = s.toLowerCase();
        this.x = 7-(s.charAt(1) - '0' - 1);
        this.y = s.charAt(0) - 'a';
    }

    
    @Override
    public boolean equals(Object obj) {
        Position comp = (Position) obj;
        return comp.x == x && comp.y == y;
    }

}
