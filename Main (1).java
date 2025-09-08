import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckBox {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	// Validation
	
	System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
	if(driver.findElement(By.id("remember")).isSelected()) {
		driver.findElement(By.id("remember")).click();
		System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
		
		System.out.println(driver.getTitle());
	}

	}

}
