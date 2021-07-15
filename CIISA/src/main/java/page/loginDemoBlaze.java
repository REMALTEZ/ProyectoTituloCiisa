package page;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.metodosGenericos;

import static reportePdf.ImedReports.reporteObjetoDesplegado;
import static utils.HtmlReport.addWebReportImage;

public class loginDemoBlaze {

    private WebDriver driver;

    public loginDemoBlaze() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }
/*****Login DEMO BLAZER********************************/


   String User="AdminCiisa";
   String Pass= "admin123";

   @FindBy(xpath = "//body/nav[@id='narvbarx']/a[@id='nava']/font[1]/font[1]")
   private WebElement homePrincipal;

    @FindBy(id = "login2")
    private WebElement Login;

    @FindBy(id = "loginusername")
    private WebElement txtUserName;

    @FindBy(id = "loginpassword")
    private WebElement txtPassUser;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElement btonIngresar;

    private void loginDemoBlazer() throws InterruptedException {

        boolean IconoLogin = metodosGenericos.visualizarObjeto(Login, 200);
        if (IconoLogin) {
            Thread.sleep(200);
            Login.click();
            addWebReportImage("Ingreso Login Demo Blazer", "Ingresar Login de acceso", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se realiza Ingreso de login a Demo Blazer", "Ingresar datos Usuario acceso", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Ingreso Login Demo Blazer", "No es Posible Ingresar Login de acceso", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Al Ingresar de login a Shopping", " No es Posible Ingresar Login de acceso", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

        boolean userName = metodosGenericos.visualizarObjeto(txtUserName, 10);
        if (userName) {
            Thread.sleep(200);
            txtUserName.sendKeys(User);
            addWebReportImage("Ingreso Login Shopping", "Ingresar usuario de acceso", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se realiza Ingreso de login a Shopping", "Ingresar datos Usuario acceso", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Ingreso Login Shopping", "No es Posible Ingresar datos de acceso", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Al Ingresar de login a Shopping", "Ingresar datos de acceso", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

        boolean password = metodosGenericos.visualizarObjeto(txtPassUser, 10);
        if (password) {
            Thread.sleep(400);
            txtPassUser.sendKeys(Pass);
            addWebReportImage("Ingreso Login Shopping", "Ingresa Password de Acceso", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se realiza Ingreso de Password de Acceso", "Ingresar Password  acceso", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Ingreso Login Shopping", "No es Posible Ingresar Password de acceso", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Al Ingresar de login a Shopping", " No es Posible Ingresar Password de acceso", false);
            System.out.println("No es  Posible realizar Ingreso de Password");
            Assert.assertTrue(false);
        }

        boolean BotonIngresar = metodosGenericos.visualizarObjeto(btonIngresar, 10);
        if (BotonIngresar) {
            Thread.sleep(400);
            btonIngresar.click();
            addWebReportImage("Ingreso Correcto a Shopping", "Ingresa a Plataforma Shopping", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se realiza Ingreso a Plataforma Shopping", "Acceso Correcto", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Ingreso Correcto a Shopping", "No es Posible Ingresar a Plataforma Shopping", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Ingreso Correcto a Shopping", " No es Posible a Plataforma Shopping", false);
            System.out.println("No es  Posible realizar Ingreso de Password");
            Assert.assertTrue(false);
        }


    }
/*******************************************************************************************************************************************/






}
