package ru.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {

  protected WebDriver wd;
  protected ApplicationManager app;

  public HelperBase(ApplicationManager app) {
    this.wd = app.getDriver();
    this.app = app;
  }

  protected void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }
}
