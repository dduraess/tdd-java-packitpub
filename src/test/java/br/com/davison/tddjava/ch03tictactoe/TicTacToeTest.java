package br.com.davison.tddjava.ch03tictactoe;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TicTacToeTest {

    @Rule
    public ExpectedException exception =
            ExpectedException.none();

    @Test//(expected = RuntimeException.class)
    public void naoDeveEstarForaDoQuadro(){
        //dado que
        TipTapToe ttt = new TipTapToe();
        //quando
        ttt.jogarProximo(3, 0);
        //então
        exception.expect(RuntimeException.class);
    }

}