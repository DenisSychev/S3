package ru.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {

  @Test
  public void testSearch() {
    app.login().roleSpark();
    app.search().fillSearchPanel();
    //app.goTo().logout();
  }
}
