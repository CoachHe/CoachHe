package com.tencent.coachhe;

import java.util.HashMap;
import java.util.Map;

// 外部系统用户信息实现类
public class OuterUser implements IOuterUser {
    /*
     *⽤户的基本信息
     */
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员⼯叫混世魔王……");
        baseInfoMap.put("mobileNumber", "这个员⼯电话是……");
        return baseInfoMap;
    }

    /*
     *员⼯的家庭信息
     */
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员⼯的家庭电话是……");
        homeInfo.put("homeAddress", "员⼯的家庭地址是……");
        return homeInfo;
    }

    /*
     *员⼯的⼯作信息,⽐如,职位等
     */
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个⼈的职位是BOSS……");
        officeInfo.put("officeTelNumber", "员⼯的办公电话是……");
        return officeInfo;
    }
}