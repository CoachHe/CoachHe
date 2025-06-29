package com.tencent.coachhe;

// 真实角色
public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String _name) {
        this.name = _name;
    }

    //构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实⻆⾊！");
        } else {
            this.name = _name;
        }
    }

    //打怪，最期望的就是杀⽼怪
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    //进游戏之前你肯定要登录吧，这是⼀个必要条件
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的⽤户" + this.name + "登录成功！");
    }

    //升级，升级有很多⽅法，花钱买是⼀种，做任务也是⼀种
    public void upgrade() {
        System.out.println(this.name + "⼜升了⼀级！");
    }
}