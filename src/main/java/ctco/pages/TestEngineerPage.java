package ctco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestEngineerPage {
  protected WebDriver driver;
  private WebDriverWait wait;
  private static final String TITLE_LOCATOR = "//h1[contains(text(), 'TEST AUTOMATION ENGINEER')]";

  @FindBy(xpath = TITLE_LOCATOR)
  WebElement jobTitle;

  @FindBy(xpath = TITLE_LOCATOR + "//parent::div/div/ul[1]/li")
  List<WebElement> skills;

  public TestEngineerPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOf(jobTitle));
  }

  public int getSkillsSize() {
    return skills.size();
  }
}
