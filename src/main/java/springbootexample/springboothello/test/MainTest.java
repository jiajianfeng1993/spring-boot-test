package springbootexample.springboothello.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class MainTest {

//	@Autowired
//	Redis

	@RequestMapping("/")
	public String test(){
		return "testOKKKK?";
	}
	public Integer i=new Integer(0);

	public int getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public static void main(String[] args) throws Exception{
		System.out.println("start main...");
//		SpringApplication.run(SpringBootHelloApplication.class, args);
//		final int i=0;
		final TestDemo springBootHelloApplication = new TestDemo();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					if(Integer.valueOf(500).equals(springBootHelloApplication.getI()))
						System.out.println("OK....");
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("exec");
				springBootHelloApplication.setI(500);
			}
		}).start();
//		springBootHelloApplication.setI(100);
	}
}
class TestDemo{
	Integer i;

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}
}
