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

    @Test
    public void TestLooseByStone() {
        assertThat(Rule.Judge(Pattern.Stone, Pattern.Paper), is(Result.Lose));
    }

    @Test
    public void TestDrawByStone() {
        assertThat(Rule.Judge(Pattern.Stone, Pattern.Stone), is(Result.Draw));
    }

    @Test
    public void TestWinByScissor() {
        assertThat(Rule.Judge(Pattern.Scissor, Pattern.Paper), is(Result.Win));
    }

    @Test
    public void TestLooseByScissor() {
        assertThat(Rule.Judge(Pattern.Scissor, Pattern.Stone), is(Result.Lose));
    }

    @Test
    public void TestDrawByScissor() {
        assertThat(Rule.Judge(Pattern.Scissor, Pattern.Scissor), is(Result.Draw));
    }
}
