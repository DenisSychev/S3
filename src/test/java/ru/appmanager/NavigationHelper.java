package ru.appmanager;


import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(ApplicationManager app) {
    super(app);
  }

  public void logout() {
    click(By.xpath("//a[@class='js-logout']']"));
  }
}
