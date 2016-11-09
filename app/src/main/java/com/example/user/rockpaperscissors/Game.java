package com.example.user.rockpaperscissors;

import java.util.ArrayList;

/**
 * Created by user on 09/11/2016.
 */

public class Game {

    private String move;
    protected ArrayList<String> mComputerMove;

        public Game(String move){
            this.move = move;
            mComputerMove = new ArrayList<String>();
            setUpComputerMoves();
        }

        public void setUpComputerMoves() {
        String [] moves = {
                "Rock",
                "Paper",
                "Scissors"
        };
        for (String move : moves) {
            add(move);
        }
    }

        public void add(String newMove) {
            mComputerMove.add(newMove);
        }

        public String getMove() {
            return this.move;
        }





    }









