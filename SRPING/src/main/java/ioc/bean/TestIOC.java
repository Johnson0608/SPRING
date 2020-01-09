package ioc.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

	public static void main(String[] agrs) {

		//1 加载spring配置文件，根据创建对象
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans_ioc.xml");
		//2 得到配置创建的对象
		Bean3 bean3 = (Bean3) context.getBean("bean3");
		bean3.add();
		//System.out.println(bean3);
	}
}
