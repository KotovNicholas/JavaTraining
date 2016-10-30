package ua.block02.guessTheNumber.controller;

import org.junit.Test;
import ua.block02.guessTheNumber.modal.RandomForGames;

import static org.junit.Assert.*;

/**
 * Created by Nicholas Kotov on 31.10.2016.
 */
public class TestControllerRandom {


    @Test
    public void testCheckRandom() throws Exception {

        int randomForGames = RandomForGames.rand(5, 5);

        assertEquals("Test random", randomForGames, 5);
    }


}
