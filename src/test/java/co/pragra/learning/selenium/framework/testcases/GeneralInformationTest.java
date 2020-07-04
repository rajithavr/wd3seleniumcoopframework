package co.pragra.learning.selenium.framework.testcases;

import co.pragra.learning.selenium.framework.data.ExcelDataProvider;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.GeneralInformationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GeneralInformationTest {

    WebDriver driver = DriverManager.getDriver();

    @Test(enabled = true, dataProviderClass = ExcelDataProvider.class,dataProvider ="generalInfoProvider")

    public void testGeneralInfo(Object [] data) throws InterruptedException {

        GeneralInformationPage page;
        page = new GeneralInformationPage(driver);
        //Thread.sleep(9000);
        page.enterStatus((String)data[0]);
        page.enterReason((String)data[1]);
        page.enterESIS_ID(data[2]);
        page.isActive(data[3]);
        page.enterweeks(data[4]);
        page.enterFname((String)data[5]);
        page.enterLname((String)data[6]);
        page.enterNickname((String)data[7]);
        page.enterMiddlename((String)data[8]);
        page.enterstudentCell(data[9]);
        page.enterstudentPhone(data[10]);
        page.enterDOB((String)data[11]);
        page.enterGender((String)data[12]);
        page.enterbirthcountry((String)data[13]);
        page.enterbirthcity((String)data[14]);
        page.enterCitizenship((String)data[15]);
        page.enterlanguage((String)data[16]);
        //Thread.sleep(8000);
        page.enterspecialProjectgrp((String)data[17]);
        page.enterstudentgrpContact(data[18]);
        page.enterstudentAttribute((String)data[19]);
        page.entersaudiType((String)data[20]);
        page.enteracademicSituation((String)data[21]);
        page.enterstudentEmail((String)data[22]);
        page.enterstudentsecEmail((String)data[23]);
        page.enterstudentthirdEmail((String)data[24]);
        page.entermaritalStatus((String)data[25]);
        page.enterPEN(data[26]);
        page.isGroup(data[27]);//need to check xpath
        page.entermemberofGroup((String)data[28]);
        page.enterappRecDate((String)data[29]);
        //page.enterstudentChoice((String)data[30]);
        page.enterprogName((String)data[32]);
        page.enterresident((String)data[33]);
        page.entereduCode((String)data[34]);
        page.enterGPI(data[36]);
        page.enterCourses((String)data[38]);
        page.enterFTE1(data[39]);
        page.enterFTE2(data[40]);
        page.enterFTE(data[41]);
        page.enterTOEFL(data[42]);
        page.enterIELTS(data[43]);
        page.enterDivision((String)data[44]);
        page.enterGrade((String)data[45]);

        page.enterfirstenrolled((String)data[48]);
        page.enterpaidTo((String)data[49]);
        page.enterschoolStartDate((String)data[50]);
        page.enterschoolEndDate((String)data[51]);
        page.entertutionStartDate((String)data[52]);
        page.entertutionEndDate((String)data[53]);
        page.enterdistrictLastDate((String)data[54]);
        page.entersecAddress((String)data[55]);
        page.enterstudentCity((String)data[56]);
        page.enterstudentProvince((String)data[57]);
        page.enterstudentCountry((String)data[58]);
        page.enterstudentPostal((String)data[59]);
        page.enteruniversity((String)data[60]);
        page.iswithParents((String)data[61]);

    }

}