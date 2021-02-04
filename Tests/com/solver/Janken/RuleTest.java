package com.solver.Janken;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

class RuleTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void TestWinByStone() {
        assertThat(Rule.Judge(Pattern.Stone, Pattern.Scissor), is(Result.Win));
    }
}
