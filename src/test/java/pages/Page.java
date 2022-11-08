package pages;

import org.openqa.selenium.By;

public class Page {

    public String url = "https://www.google.com/";

    public By searchBar = By.xpath("//*[@title='Ara']");

    public By accentureLink = By.xpath("//a[@href='https://www.accenture.com/us-en']");
}
