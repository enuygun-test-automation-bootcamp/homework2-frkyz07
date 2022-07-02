package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class SearchBoxTest {

    @Test
    void searcboxpage() {
        WebElement searchBoxPage = (WebElement) new SearchBox();
        Select searchBox = (Select) searchBoxPage.findElement(By.id("searchBox"));
        assertEquals(true, searchBox.isDisplayed());

    }
}