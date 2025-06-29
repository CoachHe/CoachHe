package com.tencent.coachhe;

// 公司内部员工信息
public interface IUserInfo {
    //获得⽤户姓名
    String getUserName();

    //获得家庭地址
    String getHomeAddress();

    //⼿机号码，这个太重要，⼿机泛滥呀
    String getMobileNumber();

    //办公电话，⼀般是座机
    String getOfficeTelNumber();

    //这个⼈的职位是什么
    String getJobPosition();

    //获得家庭电话，这有点不好，我不喜欢打家庭电话讨论⼯作
    String getHomeTelNumber();
}