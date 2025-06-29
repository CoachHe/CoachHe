package com.tencent.coachhe;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    //⾸先要定义你要美化的⽅法，先给⽼爸说学校最⾼成绩
    private void reportHighScore() {
        System.out.println("这次考试语⽂最⾼是75，数学是78，⾃然是80");
    }

    //在⽼爸看完毕成绩单后，我再汇报学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名……");
    }

    //由于汇报的内容已经发⽣变更，那所以要重写⽗类
    public void report() {
        this.reportHighScore();//先说最⾼成绩
        super.report();//然后⽼爸看成绩单
        this.reportSort();//然后告诉⽼爸学习学校排名
    }
}