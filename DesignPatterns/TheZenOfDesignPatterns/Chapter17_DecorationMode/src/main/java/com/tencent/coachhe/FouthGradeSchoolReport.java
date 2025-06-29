package com.tencent.coachhe;

public class FouthGradeSchoolReport extends SchoolReport {
    //我的成绩单
    public void report() {
//成绩单的格式是这个样⼦的
        System.out.println("尊敬的XXX家⻓：");
        System.out.println("……");
        System.out.println("语⽂62数学65体育98⾃然63");
        System.out.println("……");
        System.out.println("家⻓签名：");
    }

    //家⻓签名
    public void sign(String name) {
        System.out.println("家⻓签名为：" + name);
    }
}