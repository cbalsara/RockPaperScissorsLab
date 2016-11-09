package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/11/2016.
 */

public class GameTest {

    Game game;
    ArrayList<String> TestMoves;


    @Before
    public void before() {
        TestMoves = new ArrayList<String>();
        TestMoves.add("Rock");
        TestMoves.add("Paper");
        TestMoves.add("Scissors");
//        game = new Game("Rock");

    }

    @Test
    public void canGetMove() {
        Game game = new Game("Rock");
        assertEquals("Rock", game.getMove());
    }

    @Test
    public void createComputerMovesWithList() {
        assertEquals(3, TestMoves.size());
    }

//
//    @Test
//    public void getAnswerTest() {
//        Answers answers = new Answers(testAnswers);
//
//        String answer = answers.getAnswer();
//
//        System.out.println("The answer is... " + answer);
//        assertNotNull(answer);
//    }
//
//
//    @Test
//    public void addTest() {
//        Answers answers = new Answers();
//
//        int originalNumberOfAnswers = answers.getLength();
//        answers.add("Yes");
//
//        assertEquals(originalNumberOfAnswers + 1, answers.getLength());
//    }
//}






}
