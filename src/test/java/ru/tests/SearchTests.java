package ru.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {

  @Test
  public void testSearch() {
    //app.goTo().productionSite();
    app.goTo().integrationSite();
    app.user().loginRoleSpark();
    //Россия
    app.search().segmentRU("Лукойл");
    app.search().isElementPresent(By.xpath("//*[@class='js-items']//a[@class='company-link']"));
    //Украина
    app.search().segmentUA("Лукойл");
    app.search().isElementPresent(By.xpath("//*[@class='js-items']//a[@class='company-link']"));

    app.user().logout();
  }
}
