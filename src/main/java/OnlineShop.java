import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;

public class OnlineShop {

    public static void main(String[] args) {

        createAccount();
        logIn();
        addProductToCart();
        deleteItemFromCart();
    }

    public static void createAccount() {

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.fishmag.ro");

        WebElement myAccount = driver.findElement(By.cssSelector(".top > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
        myAccount.click();
        WebElement firstName = driver.findElement(By.cssSelector("#registrationFormLite > fieldset:nth-child(1) > p:nth-child(1) > input:nth-child(2)"));
        firstName.sendKeys("Nelu");
        WebElement lastName = driver.findElement(By.cssSelector("#registrationFormLite > fieldset:nth-child(1) > p:nth-child(2) > input:nth-child(2)"));
        lastName.sendKeys("Ogica");
        WebElement emailAdress = driver.findElement(By.cssSelector("#registrationFormLite > fieldset:nth-child(1) > p:nth-child(3) > input:nth-child(2)"));
        emailAdress.sendKeys("ctccheck"+ new Random().nextInt()  +"@yopmail.com");
        WebElement password = driver.findElement(By.cssSelector("#registrationFormLite > fieldset:nth-child(1) > p:nth-child(4) > input:nth-child(2)"));
        password.sendKeys("Test123");
        WebElement checkPassword = driver.findElement(By.cssSelector("#registrationFormLite > fieldset:nth-child(1) > p:nth-child(5) > input:nth-child(2)"));
        checkPassword.sendKeys("Test123");
        WebElement registerButton = driver.findElement(By.cssSelector("#registration_submit > span:nth-child(1)"));
        registerButton.click();
        WebElement logOut = driver.findElement(By.cssSelector(".top > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
        logOut.click();
        driver.close();

    }

    public static void logIn(){
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.fishmag.ro");

        WebElement logIn = driver.findElement(By.cssSelector(".top > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
        logIn.click();
        WebElement emailAddressField = driver.findElement(By.cssSelector("#login_username"));
        emailAddressField.sendKeys("ctccheck1@yopmail.com");
        WebElement passwordField = driver.findElement(By.cssSelector("#login_password"));
        passwordField.sendKeys("Test123");
        WebElement logInButton = driver.findElement(By.cssSelector("#login_submit > span:nth-child(1)"));
        logInButton.click();
        WebElement logOut = driver.findElement(By.cssSelector(".top > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
        logOut.click();
        driver.close();

    }

    public static void addProductToCart() {

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.fishmag.ro");

        WebElement logIn = driver.findElement(By.cssSelector(".top > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
        logIn.click();
        WebElement emailAddressField = driver.findElement(By.cssSelector("#login_username"));
        emailAddressField.sendKeys("ctccheck1@yopmail.com");
        WebElement passwordField = driver.findElement(By.cssSelector("#login_password"));
        passwordField.sendKeys("Test123");
        WebElement logInButton = driver.findElement(By.cssSelector("#login_submit > span:nth-child(1)"));
        logInButton.click();
        WebElement carpFishing = driver.findElement(By.cssSelector("nav.nav > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
        carpFishing.click();
        WebElement forgedHooks = driver.findElement(By.cssSelector("div.product:nth-child(1) > h3:nth-child(2) > a:nth-child(1)"));
        forgedHooks.click();
        WebElement chooseSize = driver.findElement(By.cssSelector("#A24O285"));
        chooseSize.click();
        WebElement addToCart = driver.findElement(By.cssSelector("#productAddToCart"));
        addToCart.click();
        WebElement myCart = driver.findElement(By.cssSelector(".last > a:nth-child(1)"));
        myCart.click();
        WebElement logOut = driver.findElement(By.cssSelector(".top > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
        logOut.click();
        driver.close();

    }

    public static void deleteItemFromCart(){

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.fishmag.ro");

        WebElement logIn = driver.findElement(By.cssSelector(".top > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
        logIn.click();
        WebElement emailAddressField = driver.findElement(By.cssSelector("#login_username"));
        emailAddressField.sendKeys("ctccheck1@yopmail.com");
        WebElement passwordField = driver.findElement(By.cssSelector("#login_password"));
        passwordField.sendKeys("Test123");
        WebElement logInButton = driver.findElement(By.cssSelector("#login_submit > span:nth-child(1)"));
        logInButton.click();
        WebElement myCart = driver.findElement(By.cssSelector(".last > a:nth-child(1)"));
        myCart.click();
        WebElement deleteItem = driver.findElement(By.cssSelector("td.image > a:nth-child(2)"));
        deleteItem.click();
        WebElement logOut = driver.findElement(By.cssSelector(".top > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
        logOut.click();
        driver.close();

    }



}
