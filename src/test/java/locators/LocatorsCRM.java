package locators;

public class LocatorsCRM {

    //Login CRM page
  public static String headerLoginPage = "//h1[normalize-space()='Login']";
  public static String inputEmail = "//input[@id='email']";
  public static String inputPassword = "//input[@id='password']";
  public static String checkboxRememberMe = "//input[@id='remember']";
  public static String buttonLogin = "//button[normalize-space()='Login']";
  public static String linkForgotPassword= "//a[normalize-space()='Forgot Password?']";

  // Dashboard page
    public static String menuCustomer= "//span[normalize-space()='Customers']";
    public static String menuProjects = "//span[normalize-space()='Projects']";

  //Project Page

    public static String buttonAddNewProject = "//div[@id='vueApp']/descendant::a[normalize-space()='New Project']";
    public static String buttonGantt = "//div[@id='vueApp']/descendant::a[contains(@href,'gantt')]";
    public static String headerProjectPage = "//span[normalize-space()='Projects Summary']";
    public static String inputSearchProjectPage = "//div[@id='projects_filter']/descendant::input";

  //Add new Project Page

    public static String headerAddNewProjectPage = "//h4[normalize-space()='Add new project']";
    public static String nameTabProject = "//a[@href='#tab_project']";
    public static String nameTabProjectSetting = "//a[@href='#tab_settings']";
    public static String inputProjectName = "//input[@id='name']";
    public static String dropdownCustomer = "//button[@data-id='clientid']";
    public static String inputSearchCustomer = "//button[@data-id='clientid']//following-sibling::div/div/input";
    public static String checkboxCalculateProgressTasks = "//input[@id='progress_from_tasks']";
    public static String dropdownBillingType = "//button[@data-id='billing_type']";
    public static String dropdownStatus = "//button[@data-id='status']";
    public static String inputRatePerHour = "//input[@id='project_rate_per_hour']";
    public static String inputEstimatedHours = "//input[@id='estimated_hours']";
    public static String dropdownMembers = "//button[@data-id='project_members[]']";
    public static String inputSearchMember = "//button[@data-id='project_members[]']//following-sibling::div/div/input";
    public static String calenderStartDate = "//input[@id='start_date']";
    public static String calenderDeadline = "//input[@id='deadline']";
    public static String inputTags = "//input[@placeholder='Tag']";
    public static String inputDescipton = "//iframe[@id='description_ifr']";
    public static String checkboxSendEmail = "//input[@id='send_created_email']";
    public static String btn_Save = "//button[normalize-space()='Save']";


  //Customer page
    public static String buttonAddNewCustomer= "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomers = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//div[@class='_buttons']//a[normalize-space()='Contacts']";
    public static String headerCustomerPage = "//span[normalize-space()='Customers Summary']";
    public static String inputSearchCustomerPage = "//div[@id='clients_filter']//input";

    // Add new Customer page
    public static String nameTabCustomer = "//a[@href='#contact_info']";
    public static String nameTabBillingShipping = "//a[@href='#billing_and_shipping']";
    public static String inputCompany = "//input[@id='company']";
    public static String inputVATNumber = "//input[@id='vat']";
    public static String inputPhoneNumber = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroups = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroup = "//div[@app-field-wrapper='groups_in[]']//input[@aria-label='Search']";
    public static String dropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//div[@app-field-wrapper='default_currency']//input[@aria-label='Search']";
    public static String dropdownDefaultLanguage = "//div[@class='form-group']//button[@data-id='default_language']";
    public static String selectDefaultLanguage = "//div[@class='form-group']//select[@id='default_language']";
    public static String inputSelectDefaultLanguage = "//select[@id='default_language']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']";
    public static String inputSearchCountry = "//div[@app-field-wrapper='country']//input[@aria-label='Search']";
    public static String buttonSave = "//div[@id='profile-save-section']//button[normalize-space()='Save']";
    public static String btn_SaveAndCreateContact = "//div[@id='profile-save-section']//button[normalize-space()='Save and create contact']";


}
