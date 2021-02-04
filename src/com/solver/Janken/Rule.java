package com.solver.Janken;

public class Rule {
    public static Result JudgeByStone(Pattern opponent) {
        switch(opponent) {
            case Stone:
                return Result.Draw;
            case Scissor:
                return Result.Win;
            case Paper:
                return Result.Lose;
        }
        return Result.Lose;
    }

    public static Result JudgeByScissor(Pattern opponent) {
        switch(opponent) {
            case Stone:
                return Result.Lose;
            case Scissor:
                return Result.Draw;
            case Paper:
                return Result.Win;
        }
        return Result.Lose;
    }

    public static Result Judge(Pattern my, Pattern opponent) {
        switch(my){
            case Stone:
                return JudgeByStone(opponent);
            case Scissor:
                return JudgeByScissor(opponent);
        }
        return JudgeByStone(opponent);
    }
}
