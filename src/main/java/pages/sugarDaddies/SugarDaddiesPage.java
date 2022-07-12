package pages.sugarDaddies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Urls.QUIZ_PAGE_URL;

public class SugarDaddiesPage extends BasePage {

    public SugarDaddiesPage (WebDriver driver) {super(driver);}

    private final By startButton = By.xpath("//a[@class='kdNXkxwUq4 pm5pi2']");

    public SugarDaddiesPage visitSiteRegButtonClick (int numButton) {
        By visitSiteRegButton = By.xpath("(//a[@class[contains(.,'kdNXkxwUq4 YoBEnJWLT5f')]])[" + numButton + "]");
        driver.findElement(visitSiteRegButton).click();
        return this;
    }

    public SugarDaddiesPage visitSiteRegButtonInTopSitesForSugarDatingClick (int numButton) {
        By visitSiteRegButtonInTopSitesForSugarDating = By.xpath("(//a[@class[contains(.,'kdNXkxwUq4 sI6SWSbCha')]])[" + numButton + "]");
        driver.findElement(visitSiteRegButtonInTopSitesForSugarDating).click();
        return this;
    }

    public SugarDaddiesPage sendMessageRegButtonClick (int numButton) {
        By sendMessageRegButton = By.xpath("(//a[@class[contains(.,'kdNXkxwUq4 CKTfJI')]])[" + numButton + "]");
        driver.findElement(sendMessageRegButton).click();
        return this;
    }

    public SugarDaddiesPage loadMoreRegButtonClick () {
        By loadMoreRegButton = By.xpath("//a[@class[contains(.,'itiWPdyG wkdHlJTRhVlG')]]");
        driver.findElement(loadMoreRegButton).click();
        return this;
    }

    public SugarDaddiesPage addProfilesRegButtonClick () {
        By addProfilesRegButton = By.xpath("//a[@class[contains(.,'HNU3Ex_yJuRH')]]");
        driver.findElement(addProfilesRegButton).click();
        return this;
    }

    public SugarDaddiesPage startButtonClick () {
        driver.findElement(startButton).click();
        return this;
    }

    public Boolean startButtonCheck () {
        return driver.getCurrentUrl().contains(QUIZ_PAGE_URL);
    }

    public  SugarDaddiesPage findSugarCityButtonClick (int numButton) {
        By findSugarCityButton = By.xpath("(//a[@class='wzRPS '])[" + numButton + "]");
        driver.findElement(findSugarCityButton).click();
        return this;
    }

    public  SugarDaddiesPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='MrhZv'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public  SugarDaddiesPage readFullReviewButtonClick (int numButton) {
        By readFullReview = By.xpath("(//a[@class='BvI3yPWqv'])[" + numButton + "]");
        driver.findElement(readFullReview).click();
        return this;
    }

}
