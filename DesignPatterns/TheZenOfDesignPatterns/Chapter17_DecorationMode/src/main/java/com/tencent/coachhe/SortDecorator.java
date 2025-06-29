package com.tencent.coachhe;

// 排名情况修饰
public class SortDecorator extends Decorator {
    //构造函数
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //告诉⽼爸学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名……");
    }

    //⽼爸看完成绩单后再告诉他，加强作⽤
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}