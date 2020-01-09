package ioc.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

	public static void main(String[] args) {
		//1 加载spring配置文件，根据创建对象
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans_ioc.xml");
		//2 得到配置创建的对象
		Person person = (Person) context.getBean("person");
		person.test1();
	}
}
