package testsuit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;

public class Testsuite extends Utility {
    @Before
    public void setUrl() {
        openBrowser("https://www.amazon.co.uk/");
    }

    @Test
    public void test1() {
        clickFindElement(By.xpath("//input[@id='sp-cc-accept']"));
        sendTextToElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"), "Dell Laptop");
        mouseHoverToElementAndClick(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        mouseHoverToElementAndClick(By.xpath("//*[@id=\"p_89/Dell\"]/span/a/div/label/i"));
        asserties(By.xpath("//span[contains(text(),'RESULTS')]"), "RESULTS", "not found");
        List<WebElement> totalproduct = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        int count = totalproduct.size();
        System.out.println(count);
        List<String>Listname=new ArrayList<>();

        for (WebElement element:totalproduct) {
            Listname.add(element.getText());

        }
        System.out.println(Listname+",");
        }

        @After
    public void close(){
        setclose();
        }


    }
