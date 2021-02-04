package com.solver.Janken;

public class Rule {
    public static Result JudgeByStone(Pattern opponent) {
        switch(opponent) {
            case Stone:
                return Result.Draw;
            case Scissor:
                return Result.Win;
            case Paper:
            default:
                return Result.Lose;
        }
    }

    public static Result Judge(Pattern my, Pattern opponent) {
        return JudgeByStone(opponent);
    }
}
