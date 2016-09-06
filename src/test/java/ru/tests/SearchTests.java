package ru.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {

  @Test
  public void testSearch() {
    app.user().loginRoleSpark();
    app.search().segmentRU("Лукойл");
    app.user().logout();
  }
}
