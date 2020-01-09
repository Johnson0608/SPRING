package ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
*   IOC 入门案例
*
*   第一步 导入jar包
*   第二步 创建类user，在类里面创建方法
*   第三步 创建spring配置文件，配置创建类
*   第四步 写代码测试对象创建
*
* */

public class TestIOC{

    @Test
    public  void testIOC()
    {
        // 1. 原始做法
        User user = new User();
        user.add();

        //2. 使用IOC的做法 加载spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_ioc.xml");
        User user1 = (User) context.getBean("user");
        user1.add();
    }

}
