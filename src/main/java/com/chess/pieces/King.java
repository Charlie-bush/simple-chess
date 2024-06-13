package com.chess.pieces;

import com.chess.Move;
import com.chess.Player;

import java.util.List;

public class King extends Piece {

    public King(String startingFile, int startingRank, Player player) {
        super(startingFile, startingRank, player);
    }

    @Override
    public String getStringRepresentation() {
        return "K";
    }

    @Override
    public List<Move> getAvailableMoves() {
        //TODO implement
        return List.of();
    }

}
