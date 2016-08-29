package ru.appmanager;


import org.openqa.selenium.By;

public class SearchHelper extends HelperBase {

  public SearchHelper(ApplicationManager app) {
    super(app);
  }

  public void fillSearchPanel() {
    type(By.xpath("//input[contains(@class,'search-input')]"), "Лукойл");
  }
}
