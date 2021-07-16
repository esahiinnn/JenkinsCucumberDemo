package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GittiGidiyorHomePage {
    public GittiGidiyorHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@title='Giriş Yap']")
    public WebElement girisYap1;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]")
    public WebElement girisYap2;

    //Login Page olucak
    @FindBy(name = "kullanici")
    public WebElement emailAddressTextBox;

    @FindBy(id = "L-PasswordField")
    public WebElement passwordTextBox;

    @FindBy(id = "gg-login-enter")
    public WebElement girisYap;

    @FindBy(id = "//li[@class='next-link']")
    public WebElement nextPageButton;


    @FindBy(xpath = "//div[@class='cell-border-css']")
    public List<WebElement> urunlerListesi;

}
