package com.tencent.coachhe;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author coachhe
 * @project TheZenOfDesignPatterns
 * @date 2025/5/9 10:30
 * @description
 */
public class Main {
    public static void main(String[] args) throws Exception {
        //定义⼀个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三"); //定义⼀个handler
        InvocationHandler handler = new GamePlayIH(player);
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产⽣⼀个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        // 登录
        proxy.login("张三", "password");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录结束游戏时间
        System.out.println("结束时间是：2009-8-25 10:58");
    }
}
