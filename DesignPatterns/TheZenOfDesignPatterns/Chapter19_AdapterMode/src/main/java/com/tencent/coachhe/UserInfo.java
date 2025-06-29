package com.tencent.coachhe;

// 公司内部员工信息实现类
public class UserInfo implements IUserInfo {
    /*
     *获得家庭地址，下属送礼也可以找到地⽅
     */
    public String getHomeAddress() {
        System.out.println("这⾥是员⼯的家庭地址……");
        return null;
    }

    /*
     *获得家庭电话号码
     */
    public String getHomeTelNumber() {
        System.out.println("员⼯的家庭电话是……");
        return null;
    }

    /*
     *员⼯的职位，是部⻔经理还是普通职员
     */
    public String getJobPosition() {
        System.out.println("这个⼈的职位是BOSS……");
        return null;
    }

    /*
     *⼿机号码
     */
    public String getMobileNumber() {
        System.out.println("这个⼈的⼿机号码是0000……");
        return null;
    }

    /*
     *办公室电话，烦躁的时候最好"不⼩⼼"把电话线踢掉
     */
    public String getOfficeTelNumber() {
        System.out.println("办公室电话是……");
        return null;
    }

    /*
     *姓名，这个很重要
     */
    public String getUserName() {
        System.out.println("姓名叫做……");
        return null;
    }
}