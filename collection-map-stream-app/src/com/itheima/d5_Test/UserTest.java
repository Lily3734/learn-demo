package com.itheima.d5_Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        String Data = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#" +
                "10004:刘备:男:1890-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1990-07-07#10007:刘备:女:1999-01-01" +
                "#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        FetchInfo fetchInfo = new FetchInfo();
        fetchInfo.fetch(Data);
        List<User> users = fetchInfo.getUsers();
        System.out.println(users);
        Business2 business2 = new Business2();
        business2.traverse(business2.conversion(users));

    }
}
