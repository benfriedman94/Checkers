/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdfd63checkers;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;

/**
 *
 * @author bdfd63
 */
public class CheckerBoard extends Bdfd63Checkers {
    //declare variables
    private int numRows;
    private int numCols;
    private int boardWidth;
    private int boardHeight;
    private int squareWidth;
    private int squareHeight;
    private Color lightColor;
    private Color darkColor;
    private GridPane board = null;
    //constructor for undefined colors
    public CheckerBoard(int rows, int cols, int width, int height){
        //call second constructor, pass default colors
        this(rows, cols, width, height, Color.RED, Color.BLACK);
    }
    //constructor for defined colors
    public CheckerBoard(int rows, int cols, int width, int height, Color light, Color dark){
        numRows = rows;
        numCols = cols;
        boardWidth = width;
        boardHeight = height;
        lightColor = light;
        darkColor = dark;
        squareWidth = boardWidth/numCols;
        squareHeight = boardHeight/numRows;
    }
    
    public GridPane build() {
        board = new GridPane();
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                if (i%2 == j%2){
                    board.add(new Rectangle(squareWidth, squareHeight, lightColor), i, j);
                }else{
                    board.add(new Rectangle(squareWidth, squareHeight, darkColor), i, j);
                }
            }
        }
        return board;
    }
    
    public GridPane getBoard() {
        return board;
    }    
    
    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getWidth() {
        return boardWidth;
    }

    public int getHeight() {
        return boardHeight;
    }

    public Color getLightColor() {
        return lightColor;
    }

    public Color getDarkColor() {
        return darkColor;
    }
    
    public int getSquareWidth() {
        return squareWidth;
    }

    public int getSquareHeight() {
        return squareHeight;
    }
    
}
