package com.chess.pieces;

import com.chess.Move;
import com.chess.Player;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(String startingFile, int startingRank, Player player) {
        super(startingFile, startingRank, player);
    }

    @Override
    public List<Move> getAvailableMoves() {
        //If not moved can move two positions
        List<Move> availableMoves = new ArrayList<>();
        //Check if piece is in way if so cannot move forward
        if (player == Player.WHITE) {
            if (rank == 8) {
                //TODO Ignore as should be promoted
            } else {
                if (rank == 2) {
                    availableMoves.add(new Move(file , rank, file, (rank + 2)));
                }
                availableMoves.add(new Move(file , rank, file, (rank + 1)));
            }
        } else {
            if (rank == 0) {
                //TODO Ignore as should be promoted
            } else {
                if (rank == 7) {
                    availableMoves.add(new Move(file , rank, file, (rank - 2)));
                }
                availableMoves.add(new Move(file , rank, file, (rank - 1)));
            }
        }
        //TODO filter if piece directly in front and if able to take diagonally
        //TODO Also general filter if moving would cause check
        return availableMoves;
    }

}
