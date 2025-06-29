package com.tencent.coachhe;

/**
 * @author coachhe
 * @project TheZenOfDesignPatterns
 * @date 2025/5/9 11:17
 * @description
 */
public class Main {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库中查到11个
        for (int i = 0; i < 11; i++) {
            youngGirl.getMobileNumber();
        }

        //⽼板⼀想不对呀，兔⼦不吃窝边草，还是找借⽤⼈员好点
        //我们只修改了这句话
        IUserInfo youngGirlOut = new OuterUserInfo();
        //从数据库中查到11个
        for (int i = 0; i < 11; i++) {
            youngGirlOut.getMobileNumber();
        }
    }
}
