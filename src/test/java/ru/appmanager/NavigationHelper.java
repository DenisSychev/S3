package ru.appmanager;


import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(ApplicationManager app) {
    super(app);
  }

  public void productionSite() {
    wd.get(app.getProperty("web.baseUrl"));
  }

  public void integrationSite() {
    wd.get(app.getProperty("web.integrationUrl") + "promo");
  }
}
