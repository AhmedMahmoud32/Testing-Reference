package Products;

import Assertions.Assertions;
import BrowserActions.BrowserActions;
import CommonUtilities.CommonUtilities;
import org.openqa.selenium.WebDriver;

public class ProductsHelper extends ProductsElements {
    WebDriver driver;
    CommonUtilities commonUtilities;
    BrowserActions browserActions;
    Assertions assertions;

    public ProductsHelper(WebDriver driver) {
        this.driver = driver;
        commonUtilities = new CommonUtilities(driver);
        browserActions = new BrowserActions(driver);
        assertions = new Assertions(driver);
    }

    public void navigateToProductsPage() {
        commonUtilities.clickElement(ProductsTab);
    }

    public void searchItem (String item){
        commonUtilities.enterText(SearchField, item);
        commonUtilities.clickElement(SearchButton);
    }
    public void scrollDown (){
        browserActions.scrollDown();
    }
    public void hoverOnFirstProduct (){
        browserActions.hoverOnElement(FirstProduct);
    }

}
