package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UnitedHealthCare extends CommonAPI {

    @Test
    public void findAdoctor () throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='find-doctor position-relative talign-center']//a[@class='position-relative'][contains(text(),'Find a Doctor')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void siteForProvider () throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='utility-nav mx-2']//a[contains(text(),'For Providers')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void siteForBroker () throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='utility-nav mx-2']//a[contains(text(),'For Brokers')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void signIn () throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='signin signin-menu ml-4']//button[@class='signin-menu__button m-0 py-0 pl-4 pr-8 position-relative border-hairline borderColor-greyDigital borderRadius-default width-auto color-inherit bg-white cursor-pointer lineHeight-h1'][contains(text(),'Sign In')]")).click();
        driver.findElement(By.xpath("//ul[@id='671978824-list1580257495561']//a[@class='signin-menu__link display-inlineBlock lineHeight-default weight-regular position-relative'][contains(text(),'Sign In to myuhc.com')]")).click();
        Thread.sleep(2000L);
    }

    @Test
    public void navigateSearchButton() throws InterruptedException {

        driver.get("https://www.uhc.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Medical");
        Thread.sleep(2000L);
    }

    @Test
    public void individualAndFamily () throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Individuals & Families')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void employer () throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Employers')]")).click();
        driver.findElement(By.xpath("//a[@class='weight-medium position-relative pr-4 hasChildren toggle-caret display-block'][contains(text(),'Group benefit plans')]")).getSize();
        Thread.sleep(2000L);
    }

    @Test
    public void employer1 () throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Employers')]")).click();
        driver.findElement(By.xpath("//a[@class='weight-medium position-relative pr-4 hasChildren toggle-caret display-block'][contains(text(),'Group benefit plans')]")).getSize();
        Thread.sleep(2000L);
    }

    @Test
    public void CheckMedicareWithValidZipcode () throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Medicare')]")).click();
        driver.findElement(By.xpath("//input[@id='1054237539']")).sendKeys("11372");
        Thread.sleep(2000L);
    }
    @Test
    public void Check() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Medicare')]")).click();
        driver.findElement(By.xpath("//input[@id='1054237539']")).sendKeys("00000");
        driver.findElement(By.xpath("//button[@class='button planfinder__submit weight-semiBold']")).click();
        Thread.sleep(2000L);
    }

    @Test
    public void changeLanguageToEspaneol () throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='display-inlineBlock weight-regular position-relative']")).click();
        Thread.sleep(2000L);
    }

    // Insurance Plans And products
    @Test
    public void checkMedicarePlans() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'View Medicare Plans')]")).click();
        Thread.sleep(2000L);
    }

    @Test
    public void checkSmallBusinessPlans() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'View Small Business Plans')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void checkIndividualAndFamilyPlans() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'View Small Business Plans')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void checkDentalPlans() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'View Dental Plans')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void checkShortTermPlansPlans() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'View Short Term Plans')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void checkMedicaidPlans() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'View Medicaid Plans')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void forNewMember () throws InterruptedException {
        driver.findElement(By.cssSelector("#ThreePackTile1 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(1)")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void getInfo () throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Get Started')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void getCardFromUnited () throws InterruptedException {
        driver.findElement(By.cssSelector("#main-content > div:nth-child(1) > div > div.container.responsivegrid.--py-4.--px-4.component.--m-0-last-child.--bgcolor-blueLight.aem-GridColumn.aem-GridColumn--default--12 > div > div > div > div.component.text.aem-GridColumn--offset--tablet--0.aem-GridColumn--default--none.aem-GridColumn--tablet--none.aem-GridColumn.aem-GridColumn--tablet--6.aem-GridColumn--offset--default--0.aem-GridColumn--default--4 > div > p")).getText();
        driver.findElement(By.cssSelector("#link-contact-us")).click();
        driver.findElement(By.cssSelector("div.cta--button:nth-child(2) > a:nth-child(1)")).click();
        Thread.sleep(2000L);
    }

    @Test
    public void getCareerInformation () throws InterruptedException {
        driver.findElement(By.cssSelector("li.lg-pb-2:nth-child(2) > a:nth-child(1)")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Visit UnitedHealth Group')]")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void newsRoom() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Newsroom')]")).click();
        driver.findElement(By.cssSelector("body.not-touch.msp-assemble.uhc.desktop.no-touch header.site-header:nth-child(3) div.navbar.navbar-default:nth-child(4) div.container-fluid div.collapse.navbar-collapse nav:nth-child(1) ul.nav.navbar-nav li.nav-list-item:nth-child(1) > a.nav-link")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void HealthCareFraud() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Health care fraud')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Report a Concern')]")).click();
        driver.findElement(By.xpath("//a[@class='report']//div[1]")).click();
        Thread.sleep(2000L);

    }
    @Test public void legal () throws InterruptedException {
        driver.findElement(By.cssSelector("li.lg-pb-2:nth-child(5) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("button.jump-menu__button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.gridColumn:nth-child(3) > li:nth-child(7) > a:nth-child(1)"));

        Thread.sleep(2000L);
    }
    @Test
    public void privacy () throws InterruptedException {
        driver.findElement(By.cssSelector("li.lg-pb-2:nth-child(6) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.text:nth-child(2) > div:nth-child(1) > p:nth-child(2) > a:nth-child(3)")).click();
        Thread.sleep(2000L);
    }
    @Test
    public void child() throws InterruptedException {
        driver.findElement(By.cssSelector("li.lg-pb-2:nth-child(6) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.text:nth-child(2) > div:nth-child(1) > p:nth-child(2) > a:nth-child(3)")).click();
        Thread.sleep(2000L);
    }

    @Test
    public void termOfUse () throws InterruptedException {
        driver.findElement(By.cssSelector("li.lg-pb-2:nth-child(7) > a:nth-child(1)")).click();
        //    driver.findElement(By.cssSelector("div.text:nth-child(2) > div:nth-child(1) > p:nth-child(2) > a:nth-child(3)")).click();
        Thread.sleep(2000L);
    }



    @Test
    public void marketPlaceHealthInsurance() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Marketplace insurance plans')]")).click();
        Thread.sleep(2000);
    }

    @Test
    public void MedicaidPlans() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Employer group plans')]")).click();
        Thread.sleep(2000);
    }
    @Test
    public void employergroupPalns() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Employer group plans')]")).click();
        Thread.sleep(2000);
    }

    @Test
    public void dentalInsurance() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Dental insurance')]")).click();
        Thread.sleep(2000);
    }

    @Test
    public void visionInsurance () throws InterruptedException {
        driver.findElement(By.xpath("//ul[@class='m-0 lg-display-grid lg-gridColumns-1']//a[@class='simple-list__link position-relative'][contains(text(),'Vision insurance')]")).click();
        Thread.sleep(2000);
    }
    @Test
    public void fitness() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Fitness')]")).click();
        Thread.sleep(2000);
    }

    By openEnrollment = By.xpath("//a[contains(text(),'Open enrollment')]");

    public WebElement openEnrollment() {
        return driver.findElement(openEnrollment);

    }



    }


