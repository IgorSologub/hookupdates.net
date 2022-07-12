package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {super(driver);}

    private final By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[1]");
    private final By learnMoreRegButton = By.xpath("//a[contains(@class,'kdNXkxwUq4 VCcG0dc')]");
    private final By nameInput = By.xpath("//input[@id='author']");
    private final By emailInput= By.xpath("//input[@id='email']");
    private final By commentIInput = By.xpath("//textarea[@id='comment']");
    private final By submitButton = By.xpath("//button[@class='kdNXkxwUq4']");
    private final By submitMessage = By.xpath("//div[@id='form-message']");
    private final By loadMoreButton = By.xpath("//button[@class='itiWPdyG DOtCpFU O5IFWFti2eV js-showner-more']");
    private final By reviewBlock = By.xpath("(//tr[@class='PwuM'])[2]");

    public MainPage moveToChangeLanguageButton () {
        moveToElement(changeLanguageButton);
        return this;
    }

    public MainPage changeLanguageButtonClick (int numButton) {
        By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[" + numButton + "]");
        driver.findElement(changeLanguageButton).click();
        return this;
    }

    public MainPage learnMoreRegButtonClick () {
        driver.findElement(learnMoreRegButton).click();
        return this;
    }

    public MainPage downloadAppRegButtonClick (int numButton) {
        By downloadAppRegButton = By.xpath("(//a[contains(@class,'kdNXkxwUq4 oarpzU2')])[" + numButton + "]");
        driver.findElement(downloadAppRegButton).click();
        return this;
    }

    public MainPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='cE5oyNKlOD'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public MainPage readArticleButtonClick (int numButton) {
        By readArticle = By.xpath("(//a[@class='L9zU5PBR'])[" + numButton + "]");
        driver.findElement(readArticle).click();
        return this;
    }

    public MainPage faqCollapseButtonClick (int numButton) {
        By faqButton = By.xpath("(//div[@class='Lq23tEd6oH'])[" + numButton + "]");
        driver.findElement(faqButton).click();
        return this;
    }

    public Boolean faqTextVisibleCheck (int numButton) {
        By faqText = By.xpath("(//div[@class='IzyEB2u'])[" + numButton + "]");
        return driver.findElement(faqText).isDisplayed();
    }

    public MainPage enterName (String name) {
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }

    public MainPage enterEmail (String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public MainPage enterComment (String comment) {
        driver.findElement(commentIInput).sendKeys(comment);
        return this;
    }

    public MainPage submitButtonClick () {
        driver.findElement(submitButton).click();
        return this;
    }

    public Boolean submitMessageVisibleCheck () {
        boolean isVisible = driver.findElements(submitMessage).size() > 0;
        if (!isVisible) {
            waitOneSeconds();
            submitButtonClick();
            waitFiveSeconds();
            isVisible = driver.findElements(submitMessage).size() > 0;
        }
        return isVisible;
    }


    public Boolean inputErrorVisibleCheck () {
        boolean errorsCheck = driver.findElements(By.xpath("//*[@class='fh-q_ error']")).size() == 3;
        if (!errorsCheck) {
            waitOneSeconds();
            submitButtonClick();
            waitFiveSeconds();
            errorsCheck = driver.findElements(submitMessage).size() == 3;
        }
        return errorsCheck;
    }

    public MainPage loadMoreButtonClick () {
        driver.findElement(loadMoreButton).click();
        return this;
    }

    public Boolean reviewBlockVisibleCheck () {
        return elementVisibleCheck(reviewBlock);
    }

}
