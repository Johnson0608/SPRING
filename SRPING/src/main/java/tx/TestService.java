package tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

	@Test
	public void testDemo() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans_tx.xml");
		OrdersService service = (OrdersService) context.getBean("ordersService");
		service.accountMoney();
	}
}
