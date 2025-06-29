package com.tencent.coachhe;

public class Father {
    public static void main1(String[] args) {
//把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
//看成绩单
        sr.report();
//签名？休想！
    }

    public static void main2(String[] args) {
//把美化过的成绩单拿过来
        SchoolReport sr = new SugarFouthGradeSchoolReport();
//看成绩单
        sr.report();
//然后⽼爸，⼀看，很开⼼，就签名了
        sr.sign("⽼三");//我叫⼩三，⽼爸当然叫⽼三
    }

    // 装饰模式
    public static void main(String[] args) {
//把成绩单拿过来
        SchoolReport sr;
//原装的成绩单
        sr = new FouthGradeSchoolReport();
//加了最⾼分说明的成绩单
        sr = new HighScoreDecorator(sr);
//⼜加了成绩排名的说明
        sr = new SortDecorator(sr);
//看成绩单
        sr.report();
//然后⽼爸⼀看，很开⼼，就签名了
        sr.sign("⽼三");//我叫⼩三，⽼爸当然叫⽼三
    }
}