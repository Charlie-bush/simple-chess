package com.chess.pieces;

import com.chess.Move;
import com.chess.Player;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PawnTest {

    @Test
    public void testWhitePawnCanMoveCorrectlyAtBeginning() {
        Pawn pawn = new Pawn("b", 2, Player.WHITE);
        List<Move> availableMoves = pawn.getAvailableMoves();
        assertThat(availableMoves.contains(new Move("b", 2, "b", 4)), equalTo(true));
        assertThat(availableMoves.contains(new Move("b", 2, "b", 3)), equalTo(true));

        pawn.movePiece(new Move("b", 2, "b", 3));
        availableMoves = pawn.getAvailableMoves();
        assertThat(availableMoves.size(), equalTo(1));
        assertThat(availableMoves.contains(new Move("b", 3, "b", 4)), equalTo(true));

    }

    @Test
    public void testBlackPawnCanMoveCorrectlyAtBeginning() {
        Pawn pawn = new Pawn("b", 7, Player.BLACK);
        List<Move> availableMoves = pawn.getAvailableMoves();
        assertThat(availableMoves.contains(new Move("b", 7, "b", 6)), equalTo(true));
        assertThat(availableMoves.contains(new Move("b", 7, "b", 5)), equalTo(true));

        pawn.movePiece(new Move("b", 7, "b", 6));
        availableMoves = pawn.getAvailableMoves();
        assertThat(availableMoves.size(), equalTo(1));
        assertThat(availableMoves.contains(new Move("b", 6, "b", 5)), equalTo(true));

    }


}