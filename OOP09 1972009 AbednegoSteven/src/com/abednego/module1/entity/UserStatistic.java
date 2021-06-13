package com.abednego.module1.entity;

/**
 * @author AbednegoSteven - 1972009
 */
public class UserStatistic {
    private int totalWin = 0;
    private int totalDraw = 0;
    private int totalLose = 0;

    public void addWinStatistic(){
        totalWin= totalWin+1;
    }
    public void addDrawStatistic(){
        totalDraw+=1;
    }
    public void addLoseStatistic(){
        totalLose+=1;
    }

    @Override
    public String toString() {
        return "Win : " + totalWin +
                ", Draw : " + totalDraw +
                ", Lose : " + totalLose;
    }
}
