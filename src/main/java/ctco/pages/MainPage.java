package ctco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
  protected WebDriver driver;

  @FindBy(xpath = "//a[@href='https://ctco.lv/careers/']")
  WebElement careers;

  @FindBy(xpath = "//a[@href='https://ctco.lv/careers/vacancies/']")
  WebElement vacancies;

  public MainPage(WebDriver driver) {
    this.driver = driver;
    driver.get("https://ctco.lv/en");
    PageFactory.initElements(driver, this);
  }

  public VacanciesPage pickVacanciesFromDropDown() {
    Actions actions = new Actions(driver);
    actions.moveToElement(careers);
    actions.perform();
    vacancies.click();
    return new VacanciesPage(driver);
  }
}
