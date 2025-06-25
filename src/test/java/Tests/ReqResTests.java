package Tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestdata.Success_Status;
import static Common.CommonTestdata.delete_Success;
import static Common.RequestBuilder.*;

@Test
@Feature("Req Res")
@Story("Employees")
public class ReqResTests {

    @Description("As an API user, I want to recover employee's data")
    @Severity(SeverityLevel.BLOCKER)
    public void recoveringEmployeeDataTests() {
        recoveringEmployeeDataResponse().
                then().
                assertThat().
                statusCode(Success_Status);
    }

    @Description("As an API user, I want to update the employee’s email")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dependsOnMethods = "recoveringEmployeeDataTests" )
    public void updateEmployeesEmailTests() {
        updateEmployeesEmailResponse().
                then().
                assertThat().
                statusCode(Success_Status);
    }


    @Description("As an API user, I want to delete the employee's last name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dependsOnMethods = "updateEmployeesEmailTests" )
    public void deletingEmployeesLastNameTests() {
        deletingEmployeesLastNameResponse().
                then().
                assertThat().
                statusCode(delete_Success);
    }
}
