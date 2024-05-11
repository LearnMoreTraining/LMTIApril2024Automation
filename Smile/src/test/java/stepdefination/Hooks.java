package stepdefination;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuablecode.LaunchBrowser;

import java.io.IOException;

public class Hooks extends LaunchBrowser  {


    @Before()
    public void preCondition() throws IOException {
        System.out.println("Execution Started");
        LaunchBrowser.launchUrl();
    }

    @After()
    public void postCondition(){

        System.out.println("Execution Ended");

    }

    @AfterStep()
    public void takeScreenshot(Scenario sc){

       byte[] byteData= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       sc.attach(byteData,"image/png",sc.getName());
    }

    @BeforeStep()
    public void beforeStep(){
        System.out.println("beforestep");
    }


}
