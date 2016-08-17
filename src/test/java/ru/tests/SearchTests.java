package ru.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {

  @Test
  public void testSearch() {
    app.login().roleSpark(app.getProperty("web.roleSparkLogin"), app.getProperty("web.roleSparkPassword"));
    app.goTo().logout();
  }
}
