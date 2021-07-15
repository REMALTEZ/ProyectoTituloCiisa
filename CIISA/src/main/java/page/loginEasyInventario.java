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

public class loginEasyInventario {

    private WebDriver driver;
    public loginEasyInventario() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "username")
    private WebElement txtUserName;

    @FindBy(id = "password")
    private WebElement txtPass;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
    private WebElement btnIngresar;

    String User="admin";
    String Pass= "admin321";

    private void loginEasy() throws InterruptedException {

        //Ingreso de usuario Login
        boolean userName = metodosGenericos.visualizarObjeto(txtUserName, 10);
        if (userName) {
            Thread.sleep(200);
            txtUserName.sendKeys(User);
            addWebReportImage("Ingreso Login Plataforma Inventario Easy", "Ingresar usuario de acceso", Status.PASS, false);
            reporteObjetoDesplegado(true, "Ingreso Login Plataforma Inventario Easy", "Ingresar datos Usuario acceso", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Ingreso Login Plataforma Inventario Easy", "No es Posible Ingresar datos de acceso", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Ingreso Login Plataforma Inventario Easy", "Ingresar datos de acceso", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

        //Ingreso pass
        boolean password = metodosGenericos.visualizarObjeto(txtPass, 10);
        if (password) {
            Thread.sleep(400);
            txtPass.sendKeys(Pass);
            addWebReportImage("Ingreso Login Plataforma Inventario Easy", "Ingresa Password de Acceso", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se realiza Ingreso de Password de Acceso", "Ingresar Password  acceso", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Plataforma Inventario Easy", "No es Posible Ingresar Password de acceso", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Al Ingresar Plataforma Inventario Easy", " No es Posible Ingresar Password de acceso", false);
            System.out.println("No es  Posible Ingresar Plataforma Inventario Easy");
            Assert.assertTrue(false);
        }

        //Ingresa a plataforma
        boolean BotonIngresar = metodosGenericos.visualizarObjeto(btnIngresar, 10);
        if (BotonIngresar) {
            Thread.sleep(400);
            btnIngresar.click();
            addWebReportImage("Ingreso Correcto a Plataforma Inventario Easy", "Ingresa a Plataforma Inventario Easyg", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se realiza Ingreso a Plataforma Shopping", "Acceso Correcto a Plataforma Inventario Easy", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Ingreso Correcto a Plataforma Inventario Easy", "No es Posible Ingresar a Plataforma Inventario Easy", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Ingreso Correcto a Shopping", " No es Posible a Plataforma Inventario Easy ", false);
            System.out.println("No es  Posible ingresar Plataforma Inventario Easy");
            Assert.assertTrue(false);
        }

    }






}
