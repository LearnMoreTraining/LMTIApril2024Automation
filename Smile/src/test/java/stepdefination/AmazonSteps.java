package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import resuablecode.LaunchBrowser;
import resuablecode.ReadExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AmazonSteps extends LaunchBrowser {

   private String name ;
   private WebElement categoryElement ;

   private boolean flag ;

   private int a ;

    @When("user enters the product name {string} in search box")
    public void searchBox(String productname){
        name = productname;
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname); //hardcode value
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("abc");
    }

    @Given("abc")
    public void m1(){

    }

    @Given("user navigates to Amazon Homepage")
    public void homePage(){

        driver = new ChromeDriver(); //local variable
        driver.get("https://www.amazon.in/");

    }

    @Then("user validates the title of search result page")
    public void validateTitle() {

      String expectedTitle = "Amazon.in : "+name;
      String actualTitle =  driver.getTitle();  //string //actual result

    //    Assert.assertEquals(expectedTitle,actualTitle);

        if(expectedTitle.equals(actualTitle)){
            Assert.assertTrue(true);
        }
        else{
           Assert.assertTrue(false);
        }

    }

    @And("user clicks the search icon")
    public void searchIcon() {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Given("xyz")
    public void xyz() {

    }


    @Given("user navigate to learnmore page")
    public void userNavigateToLearnmorePage() {
        driver = new ChromeDriver(); //local variable
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
    }

    @When("user enter the username {string} and password {string}")
    public void userEnterTheUsernameAndPassword(String username, String password) throws IOException {
        driver.findElement(By.id("abc")).sendKeys(ReadExcel.getData("login",0,0));
        driver.findElement(By.id("password")).sendKeys(ReadExcel.getData("login",1,0));
    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    @Then("validate the error message")
    public void validateTheErrorMessage() {

    }

    @When("user clicks on baby wishlist")
    public void userClicksOnBabyWishlist() {
        WebElement accountListElement = driver.findElement(By.id("nav-link-accountList"));
        Actions a = new Actions(driver);
        a.clickAndHold(accountListElement).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();

    }

    @Then("validate the title")
    public void validateTheTitle() {

                Assert.assertEquals("","");

    }

    @When("user selects the value from the category dropdown")
    public void userSelectsTheValueFromTheCategoryDropdown() {
        categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select categoryDropdown = new Select(categoryElement);
       // categoryDropdown.selectByIndex(2);
       // categoryDropdown.selectByVisibleText("Baby");
        categoryDropdown.selectByValue("search-alias=fashion");
    }

    @And("user extract the value from the category dropdown")
    public void userExtractTheValueFromTheCategoryDropdown() {
//       int categorySize = categoryElement.findElements(By.tagName("option")).size();
//
//       List<String> dropdownValues = new ArrayList<String>(); //empty list

//       for(int i=0; i < categorySize;i++ ){
//          String catergoryValue=  categoryElement.findElements(By.tagName("option")).get(i).getText();
//          dropdownValues.add(catergoryValue);
//        }
//
//        System.out.println(dropdownValues);

       List <WebElement> dropdownElement = categoryElement.findElements(By.tagName("option"));
       List <String> values = new ArrayList<String>();
       for(WebElement e:dropdownElement){
           values.add(e.getText());
       }
        System.out.println(values);

        flag = false ;
        a = 0;
       for(String dropValues:values){
           if(dropValues.equals("Bookss")){
               flag = true;
               a++;
           }
       }


    }

    @Given("user navigates to jquery")
    public void userNavigatesToJquery() {

        driver = new EdgeDriver();
        driver.get("https://jqueryui.com/droppable/");
    }

    @When("user preforms drag and drop action")
    public void userPreformsDragAndDropAction() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);
        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
        Actions dragAction = new Actions(driver);
        dragAction.dragAndDrop(dragElement,dropElement).build().perform();
        driver.switchTo().defaultContent();
    }

    @Given("user extract the column one values")
    public void userExtractTheColumnOneValues() {
//
//       int columnOneSize= driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::th")).size();
//
//        for(int i=0;i<columnOneSize;i++){
//
//          String columnOneValue=  driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::th")).get(i).getText();
//            System.out.println(columnOneValue);
//        }

        WebElement table = driver.findElement(By.xpath("//table[@class='infobox vcard']"));
       int sizee= table.findElements(By.tagName("td")).size();
       for(int j=2; j < sizee;j++){

           System.out.println( table.findElements(By.tagName("td")).get(j).getText());
       }

    }

    @Then("validate the dropdown values")
    public void validateTheDropdownValues() {

        Assert.assertTrue("Value not found inside the dropdown",flag);

        if( a == 1){
            Assert.assertTrue("duplicate value not found",true);
        }
        else{
            Assert.assertTrue("duplicate value found",false);
            Assert.assertTrue(true);
        }

    }
}
