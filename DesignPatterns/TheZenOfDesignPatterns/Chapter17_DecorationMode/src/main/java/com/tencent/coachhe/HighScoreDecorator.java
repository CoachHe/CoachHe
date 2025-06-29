package com.tencent.coachhe;

// 最高成绩修饰
public class HighScoreDecorator extends Decorator {
    //构造函数
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //我要汇报最⾼成绩
    private void reportHighScore() {
        System.out.println("这次考试语⽂最⾼是75，数学是78，⾃然是80");
    }

    //我要在⽼爸看成绩单前告诉他最⾼成绩，否则等他⼀看，就抡起扫帚揍我，我哪⾥还有机会说啊
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}