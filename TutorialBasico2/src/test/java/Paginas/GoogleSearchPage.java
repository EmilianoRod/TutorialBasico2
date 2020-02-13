package Paginas;

public class GoogleSearchPage extends BasePage {

    private String searchBox = "//input[@name='q']";
    private String searchButton = "//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']";

    public GoogleSearchPage ()  {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void enterSearchCriteria(String searchText)  { sendKeysTo(searchBox, searchText); }

    public void clickOnSearchGoogle() {  clickElement(searchButton); }
}
