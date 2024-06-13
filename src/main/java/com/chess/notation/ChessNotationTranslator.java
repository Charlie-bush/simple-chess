package com.chess.notation;

import com.chess.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChessNotationTranslator {

    private static final String CHECK_MATE = "#";
    private static final String CHECK = "+";

    public List<Move> translateChessNotationIntoMoves(String algebraicNotation) {
        List<Move> moves = new ArrayList<>();

        int moveStartPointer = 0;
        while (moveStartPointer < algebraicNotation.length()) {
            String substring = algebraicNotation.substring(moveStartPointer, moveStartPointer + 1);
            Pattern pattern = Pattern.compile("[abcdefgh][1-8]]");
            Matcher matcher = pattern.matcher(substring);
            if (matcher.matches()) {

            }
            moveStartPointer++;
        }
        return null;
    }
}
