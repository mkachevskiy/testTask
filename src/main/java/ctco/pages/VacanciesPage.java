package ctco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VacanciesPage {
  protected WebDriver driver;
  private WebDriverWait wait;

  @FindBy(xpath = "//a[@href='https://ctco.lv/careers/vacancies/test-automation-engineer-3/']")
  WebElement testEngineer;

  public VacanciesPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOf(testEngineer));
  }

  public TestEngineerPage openTestEngineerVacancy() {
    testEngineer.click();
    return new TestEngineerPage(driver);
  }
}
