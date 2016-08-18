package ru.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class AuthorizationHelper extends HelperBase {

  public AuthorizationHelper(ApplicationManager app) {
    super(app);
  }

  public void roleSpark() {
    wd.get(app.getProperty("web.baseUrl"));
    type(By.xpath("//input[@name='username']"), app.getProperty("web.roleSparkLogin"));
    type(By.xpath("//input[@name='password']"), app.getProperty("web.roleSparkPassword"));
    click(By.xpath("//input[@class='login-btn']"));
    //Проверяем наличие элементов на странице
    WebElement dashbordPanel = wd.findElement(By.xpath("//*[@class='dashbord-panel']"));
    assertTrue(dashbordPanel.isDisplayed());
    WebElement headerMenu = wd.findElement(By.xpath("//*[@class='header-menu']"));
    assertTrue(headerMenu.isDisplayed());
  }

}
