package Products;

import org.openqa.selenium.By;

public class ProductsElements {
    By ProductsTab = By.xpath("//a[@href='/products']");
    By SearchField = By.xpath("//input[@id='search_product']");
    By SearchButton = By.xpath("//button[@id='submit_search']");
    By FirstProduct = By.xpath("//img[@src='/get_product_picture/33']");
}
