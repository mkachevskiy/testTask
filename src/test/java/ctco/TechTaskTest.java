package ctco;

import ctco.pages.MainPage;
import ctco.pages.TestEngineerPage;
import ctco.pages.VacanciesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TechTaskTest {
  private WebDriver driver;

  @BeforeAll
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }

  @Test
  public void checkSkillsSize() {
    MainPage mainPage = new MainPage(driver);
    VacanciesPage vacanciesPage = mainPage.pickVacanciesFromDropDown();
    TestEngineerPage testEngineerPage = vacanciesPage.openTestEngineerVacancy();
    Assertions.assertEquals(8, testEngineerPage.getSkillsSize());
  }

  @AfterAll
  public void tearDown() {
    driver.close();
  }
}
