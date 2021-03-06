package com.github.jmgorton.wordsearch.model;

import java.util.*;

public class Puzzle {

    public List<String> hiddenWords;
    public Map<String, Coord[]> wordLocs;

    public PuzzleElement topLeftCorner = null;
    public PuzzleElement topRightCorner = null;
    public PuzzleElement bottomLeftCorner = null;

    // the project spec says the puzzle will always be a square
    public Integer size = null;

    public Puzzle() {
        this.hiddenWords = new ArrayList<String>();
        this.wordLocs = new HashMap<String, Coord[]>();
    }

}
