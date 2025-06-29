package com.tencent.coachhe;

import java.util.Map;

// 外部系统用户信息
public interface IOuterUser {
    //基本信息，⽐如名称、性别、⼿机号码等
    Map getUserBaseInfo();

    //⼯作区域信息
    Map getUserOfficeInfo();

    //⽤户的家庭信息
    Map getUserHomeInfo();
}