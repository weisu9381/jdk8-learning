package rt.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {

	@Test
	public void contextLoads() {
		final String[] str1 = {"123","1233"};
		final String[] str2 = {"123","1233"};
		str1[1] = "123232";
		System.out.println(str1[1]);
	}

}
