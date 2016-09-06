package ru.appmanager;


import org.openqa.selenium.By;

public class SearchHelper extends HelperBase {

  public SearchHelper(ApplicationManager app) {
    super(app);
  }

  public void segmentRU(String word) {
    click(By.xpath("//div[@class='search-block']/div[1]/div[1]/button"));
    click(By.linkText("RU - Россия"));
    type(By.xpath("//span[@class='twitter-typeahead']/input[2]"), word);
    click(By.xpath("//div[@class='search-block']/div[1]/div[4]/button"));
  }
}
