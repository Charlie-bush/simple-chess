package com.chess.pieces;

import com.chess.Board;
import com.chess.Move;
import com.chess.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    protected String file;
    protected int rank;
    protected final Player player;
    protected final List<Move> previousMoves = new ArrayList<>();


    public Piece(String startingFile, int startingRank, Player player) {
        this.file = startingFile;
        this.rank = startingRank;
        this.player = player;
    }

    public String getFile() {
        return file;
    }

    public String getStringRepresentation() {
        return "";
    }

    public List<Move> getAvailableMoves() {
        return null;
    }

    public List<Move> getPreviousMoves() {
        return previousMoves;
    }

    protected boolean doesMovingCauseCheck(Move move, Board board) {
        //TODO check
        return false;
    }

    public void movePiece(Move move) {
        this.file = move.toFile();
        this.rank = move.toRank();
        //TODO implement
    }
}
