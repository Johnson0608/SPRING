package ioc.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value="user")   // <ioc.bean id="user" class=""/>
@Scope(value="prototype")
public class User {

	public void add() {
		System.out.println("add...........");
	}
}
