package ru.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserHelper extends HelperBase {

  public UserHelper(ApplicationManager app) {
    super(app);
  }

  public void loginRoleSpark() {
    //wd.get(app.getProperty("web.baseUrl"));
    //wd.get(app.getProperty("web.integrationUrl") + "promo");
    type(By.xpath("//input[@name='username']"), app.getProperty("web.roleTesIntegrationLogin"));
    type(By.xpath("//input[@name='password']"), app.getProperty("web.roleTesIntegrationPassword"));
    click(By.xpath("//*[contains(@class,'login-btn')]"));
    //Проверяем наличие элементов на странице

    isElementPresent(By.xpath("//*[@class='dashbord-panel']"));
    isElementPresent(By.xpath("//*[@class='header-menu'"));
    isElementPresent(By.xpath("//input[contains(@class,'search-input')]"));

    /*WebElement dashbordPanel = wd.findElement(By.xpath("//*[@class='dashbord-panel']"));
    assertTrue(dashbordPanel.isDisplayed());
    WebElement headerMenu = wd.findElement(By.xpath("//*[@class='header-menu']"));
    assertTrue(headerMenu.isDisplayed());
    WebElement searchPanel = wd.findElement(By.xpath("//input[contains(@class,'search-input')]"));
    assertEquals(true, searchPanel.isDisplayed());*/
  }

  public void logout() {
    click(By.xpath("//*[@class='sp-i-header-profile']"));
    click(By.linkText("Выход"));
  }

}