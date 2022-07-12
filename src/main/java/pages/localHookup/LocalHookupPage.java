package pages.localHookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LocalHookupPage extends BasePage {

    public LocalHookupPage (WebDriver driver) {super(driver);}

    private final By learnMoreButton = By.xpath("//a[@class='kdNXkxwUq4 m5PGR5']");
    private final By loadMoreButton = By.xpath("//button[@class='itiWPdyG DOtCpFU js-showner-more js-showner-sortgroups']");
    private final By cityBlock = By.xpath("//div[normalize-space()='Chicago']");
    private final By loadMoreReviewButton = By.xpath("//button[@class='itiWPdyG DOtCpFU O5IFWFti2eV js-showner-more']");
    private final By reviewBlock = By.xpath("(//tr[@class='PwuM'])[2]");
    private final By authorButton = By.xpath("//a[@class='nX4I7cpe6nD']");
    private final By nextSliderButton = By.xpath("//button[@class='js-sites-next-sm slick-next slick-arrow']");
    private final By blogSlide = By.xpath("(//div[@class='NN3hTho4SV'])[6]");
    private final By scrollToBlogSlider = By.xpath("(//h3[@class='AO0wtO8Jz9 FreUwO'])[1]");

    public LocalHookupPage learnMoreButtonClick () {
        driver.findElement(learnMoreButton).click();
        return this;
    }

    public LocalHookupPage loadMoreButtonClick () {
        driver.findElement(loadMoreButton).click();
        return this;
    }

    public Boolean cityBlockCheck () {
        return elementVisibleCheck(cityBlock);
    }

    public LocalHookupPage visitSiteButtonClick (int numButton) {
        By visitSiteButton = By.xpath("(//a[@class[contains(.,'kdNXkxwUq4 oarpzU2')]])[" + numButton + "]");
        driver.findElement(visitSiteButton).click();
        return this;
    }

    public LocalHookupPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class[contains(.,'cE5oyNKlOD')]])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public LocalHookupPage latestNewsButtonClick (int numButton) {
        By latestNewsButton = By.xpath("(//a[@class='vsOMDg'])[" + numButton + "]");
        driver.findElement(latestNewsButton).click();
        return this;
    }

    public LocalHookupPage loadMoreReviewButtonClick () {
        driver.findElement(loadMoreReviewButton).click();
        return this;
    }

    public Boolean reviewBlockCheck () {
        return elementVisibleCheck(reviewBlock);
    }

    public LocalHookupPage articlesButtonClick (int numButton) {
        By articlesButton = By.xpath("(//a[@class='Xhi38Im'])[" + numButton + "]");
        driver.findElement(articlesButton).click();
        return this;
    }

    public LocalHookupPage authorButtonClick () {
        driver.findElement(authorButton).click();
        return this;
    }

    public Boolean authorCheck () {
        return driver.getTitle().contains("Lisa");
    }

    public LocalHookupPage scrollToBlogSlider () {
        scrollToElement(scrollToBlogSlider);
        return this;
    }

    public LocalHookupPage nextBlogSliderButtonClick () {
        driver.findElement(nextSliderButton).click();
        return this;
    }

    public Boolean blogSliderVisibleCheck () {
        return elementVisibleCheck(blogSlide);
    }

}
