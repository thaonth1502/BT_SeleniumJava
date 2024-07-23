package locators;

public class LocatorsCRM {

    //Login CRM page
  public static String headerLoginPage = "//h1[normalize-space()='Login']";
  public static String inputEmail = "//input[@id='email']";
  public static String inputPassword = "//input[@id='password']";
  public static String buttonLogin = "//button[normalize-space()='Login']";
  public static String linkForgotPassword= "//a[normalize-space()='Forgot Password?']";

  // Dashboard page
    public static String menuCustomer= "//ul[@id = 'side-menu']//span[normalize-space()='Customers']";

  //Customer page
    public static String buttonAddNewCustomer= "//a[normalize-space()='New Customer']";
    public static String headerCustomerPage = "//span[normalize-space()='Customers Summary']";

    // Add new Customer page
    public static String inputCompany = "//input[@id='company']";
    public static String inputVATNumber = "//input[@id='vat']";
    public static String inputPhoneNumber = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroups = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroup = "//div[@app-field-wrapper='groups_in[]']//input[@aria-label='Search']";
    public static String dropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//div[@app-field-wrapper='default_currency']//input";
    public static String dropdownDefaultLanguage = "//button[@data-id='default_language']";
    public static String inputSelectDefaultLanguage = "//select[@id='default_language']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']//div[text()='Nothing selected']";
    public static String inputSearchCountry = "//div[@app-field-wrapper='country']//input";
    public static String buttonSave = "//div[@id='profile-save-section']//button[contains(text(),'Save')]";
    public static String butonSaveAndCreateContact = "//div[@id='profile-save-section']//button[contains(text(),'Save and create contact')]";


}
