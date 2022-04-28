import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.CompaniesPage;
import pageobjects.UserLoginPage;
import uiTitles.CompaniesPageUITitles;
import utils.UserCreator;

public class CompaniesPageTest extends AbstractTest {

    @Test
    public void testUICompaniesPage() {
        CompaniesPage companiesPage = new  UserLoginPage(driver).openPage()
                .fillFormRegistrationAndClickButtonRegistration(UserCreator.getUserName(),UserCreator.getEmail(),UserCreator.getPassword())
                .clickButtonCompanies();
        Assert.assertEquals(companiesPage.getHeaderCompanies(), CompaniesPageUITitles.EXPECTED_PAGE_TITLE);
        Assert.assertEquals(companiesPage.getColumnTitleType(), CompaniesPageUITitles.EXPECTED_COLUMN_TYPE_TITLE);
        Assert.assertEquals(companiesPage.getColumnTitleName(), CompaniesPageUITitles.EXPECTED_COLUMN_COMPANIES_NAME_TITLE);
        Assert.assertEquals(companiesPage.getColumnTitleAuthor(), CompaniesPageUITitles.EXPECTED_COLUMN_AUTHOR_TITLE);
        Assert.assertEquals(companiesPage.getColumnTitleDateOfChange(), CompaniesPageUITitles.EXPECTED_COLUMN_DATE_TITLE);
        Assert.assertEquals(companiesPage.getButtonAddTaskName(), CompaniesPageUITitles.EXPECTED_BUTTON_ADD_COMPANY_TITLE);
    }
}