import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShowPage {
    private WebDriver driver;
    private By showTitle = By.xpath("//div[@class='ShowCatalogCard__title' and contains(text(),'Острые козырьки')]");

    public ShowPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickShowTitle() {
        driver.findElement(showTitle).click();
    }
}