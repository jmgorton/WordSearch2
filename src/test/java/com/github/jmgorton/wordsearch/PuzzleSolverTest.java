package com.github.jmgorton.wordsearch;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

public class PuzzleSolverTest {

    @Test
    public void defaultConstructor() {
        PuzzleReader a = new PuzzleSolver();

        assertNull(a.file);
        assertNull(a.filePath);
        assertEquals(a.input, System.in);

        assertNotNull(a.puzzle);
        assertNotNull(a.puzzle.hiddenWords);
        assertNull(a.puzzle.topLeftCorner);
    }

    @Test
    public void testSolveOneWord() {
        String path = System.getProperty("user.dir");
        path += "/puzzles/Puzzle1b.txt";
        PuzzleSolver p = new PuzzleSolver(path);
        try {
            p.readPuzzle();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        p.solve();

        assertEquals(1, p.puzzle.locs.size());
        assertNotNull(p.puzzle.locs.get(0));
        assertEquals(5, p.puzzle.locs.get(0).length);

        assertEquals(Integer.valueOf(7), p.puzzle.locs.get(0)[0].x);
        assertEquals(Integer.valueOf(3), p.puzzle.locs.get(0)[4].x);
        assertEquals(Integer.valueOf(4), p.puzzle.locs.get(0)[0].y);
        assertEquals(Integer.valueOf(0), p.puzzle.locs.get(0)[4].y);
    }

    @Test
    public void testReverseWord() throws Exception {
        // object to use to invoke the method
        // method does not depend on the type of constructor we use
        PuzzleSolver ps = new PuzzleSolver();

        // argument types 
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = String.class;

        // retrieve the method in question
        Method reverseWord = PuzzleSolver.class.getDeclaredMethod("reverseWord", argTypes);
        // without the next line, we'd get an IllegalAccessException
        reverseWord.setAccessible(true);

        // invoke the method in question
        String output = (String) reverseWord.invoke(ps, "absolute");

        // check the output
        assertEquals("etulosba", output);
    }

    @Test
    public void testReverseTwoWords() throws Exception {
        PuzzleSolver ps = new PuzzleSolver();

        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = String.class;

        Method reverseWord = PuzzleSolver.class.getDeclaredMethod("reverseWord", argTypes);
        reverseWord.setAccessible(true);

        String output = (String) reverseWord.invoke(ps, "absolute oddnumber");

        assertEquals("rebmunddo etulosba", output);
        assertNotEquals("someotherstring", output);
    }

}