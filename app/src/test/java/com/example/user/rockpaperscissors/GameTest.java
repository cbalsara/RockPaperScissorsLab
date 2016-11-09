package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/11/2016.
 */

public class GameTest {

    Game game;


    @Before
    public void before() {
        game = new Game("Rock");

    }

    @Test
    public void canGetMove() {
        assertEquals("Rock", game.getMove());
    }








}
