package com.tencent.coachhe;

// 游戏玩家
public interface IGamePlayer {
    //登录游戏
    void login(String user, String password);

    //杀怪，这是⽹络游戏的主要特⾊
    void killBoss();

    //升级
    void upgrade();

}