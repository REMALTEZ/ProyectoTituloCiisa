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

public class AgregaPhonesDemoBlazer {

    private WebDriver driver;

    public AgregaPhonesDemoBlazer() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    /*****MENU CATEGORIA************************************/
    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement homePrincipal;

    @FindBy(xpath = "//a[contains(text(),'Phones')]")
    private WebElement menuPhones;

    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
    private WebElement menuLaptos;

    @FindBy(xpath = "//a[contains(text(),'Monitors')]")
    private WebElement menuMonitor;

    public void menuCategorias() throws InterruptedException {

        boolean menuPhone = metodosGenericos.visualizarObjeto(menuPhones, 200);
        if (menuPhone) {
            Thread.sleep(200);
            menuPhones.click();
            addWebReportImage("Recorrido Menu Categorias", "Se Selecciona Menu Categoria Phones", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Se Seleccionar Menu Categoria Phones", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Recorrido Menu Categorias", "No es Se Seleccionar Menu Categoria Phones", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Se Seleccionar Menu Categoria Phones", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

        boolean monitor = metodosGenericos.visualizarObjeto(menuMonitor, 200);
        if (monitor) {
            Thread.sleep(200);
            menuMonitor.click();
            addWebReportImage("Recorrido Menu Categorias", "Se Selecciona Menu Categoria monitor", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Se Seleccionar Menu Categoria monitor", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Recorrido Menu Categorias", "No es Se Seleccionar Menu Categoria monitor", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Se Seleccionar Menu Categoria monitor", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

        boolean menuLapto = metodosGenericos.visualizarObjeto(menuLaptos, 200);
        if (menuLapto) {
            Thread.sleep(200);
            menuLaptos.click();
            addWebReportImage("Recorrido Menu Categorias", "Se Selecciona Menu Categoria Laptos", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Se Seleccionar Menu Categoria Laptos", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Recorrido Menu Categorias", "No es Se Seleccionar Menu Categoria Phones", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Se Seleccionar Menu Categoria Laptos", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

    }

/*******************************************************************************************************************************************/


    /*********Selecciona Phone********************************/

    @FindBy (xpath = "//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
    private WebElement celSamsungS6;


    @FindBy (xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[2]/div[1]/a[1]")
    private  WebElement addCellSamsung;

    @FindBy (xpath = "//a[contains(text(),'Nokia lumia 1520')]")
    private WebElement celNokia;

    @FindBy (xpath = "//font[contains(text(),'Añadir a la cesta')]")
    private  WebElement addCellNokia;

    @FindBy (xpath = "//a[contains(text(),'Nexus 6')]")
    private WebElement celNexus;

    @FindBy (id = "nava")
    private  WebElement productStore;


    public void agregaPhonesAlCarro() throws InterruptedException {

        /****Agrega Al Carro telefono Samsung*************************************************************/
        boolean menuPhone = metodosGenericos.visualizarObjeto(menuPhones, 200);
        if (menuPhone) {
            Thread.sleep(200);
            menuPhones.click();
            addWebReportImage("Recorrido Menu Phones", "Se Selecciona Menu Categoria Phones", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Se Seleccionar Menu Categoria Phones", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Recorrido Menu Phones", "No es Se Seleccionar Menu Categoria Phones", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Se Seleccionar Menu Categoria Phones", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }


        //Selecciona Celular Samsung
        boolean menuSamsung = metodosGenericos.visualizarObjeto(celSamsungS6, 200);
        if (menuSamsung) {
            Thread.sleep(200);
            celSamsungS6.click();
            addWebReportImage("Recorrido Menu Phones", "Se Selecciona Celular Samsung S6 al Carrito", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Se Selecciona Celular Samsung S6 al Carrito", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Recorrido Menu Phones", "No es Posible Se Selecciona Celular Samsung S6 al Carrito", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Se Selecciona Celular Samsung S6 al Carrito", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

        //Agrega al Carrito Celular Samsung
//        boolean AddSamsung = metodosGenericos.visualizarObjeto(addCellSamsung, 200);
//        if (AddSamsung) {
//            Thread.sleep(200);
//            addCellSamsung.click();
//            addWebReportImage("Recorrido Menu Phones", "Se Agrega Celular Samsung S6 al Carrito", Status.PASS, false);
//            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Se Agrega Celular Samsung S6 al Carrito", false);
//            Assert.assertTrue(true);
//        } else {
//            addWebReportImage("Error! Recorrido Menu Phones", "No es Posible Se Agrega Celular Samsung S6 al Carrito", Status.FAIL, false);
//            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Agregar Celular Samsung S6 al Carrito", false);
//            System.out.println("No es  Posible realizar Click en Page ToolsQA");
//            Assert.assertTrue(false);
//        }

        //Vuelve a Home

        boolean homePrin = metodosGenericos.visualizarObjeto(homePrincipal, 200);
        if (homePrin) {
            Thread.sleep(200);
            homePrincipal.click();
            addWebReportImage("Home Principal", "Regresa al Home Principal", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Regresa al Home Principal", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! al volver al Home Principal", "No es Posible Regresar al Home Principal", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Regresa al Home Principal", false);
            System.out.println("No es Posible Regresa al Home Principal");
            Assert.assertTrue(false);
        }
        /*********************************************************************************************/


        /****Agrega Al Carro telefono Nokia*************************************************************/

        //Click en categoria Phone
        if (menuPhone) {
            Thread.sleep(200);
            menuPhones.click();
            addWebReportImage("Recorrido Menu Phones", "Se Selecciona Menu Categoria Phones", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Se Seleccionar Menu Categoria Phones", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Recorrido Menu Phones", "No es Se Seleccionar Menu Categoria Phones", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Se Seleccionar Menu Categoria Phones", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

        //Selecciona Celular Noxus
        boolean menuNexus = metodosGenericos.visualizarObjeto(celNexus, 200);
        if (menuNexus) {
            Thread.sleep(200);
            celNexus.click();
            addWebReportImage("Recorrido Menu Phones", "Se Selecciona Celular Nexus al Carrito", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Se Selecciona Celular Nexus al Carrito", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Recorrido Menu Phones", "No es Posible Se Selecciona Celular Nexus al Carrito", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Se Selecciona Celular Nexus al Carrito", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

        boolean homePrinNexus = metodosGenericos.visualizarObjeto(homePrincipal, 200);
        if (homePrinNexus) {
            Thread.sleep(200);
            homePrincipal.click();
            addWebReportImage("Home Principal", "Regresa al Home Principal", Status.PASS, false);
            reporteObjetoDesplegado(true, " Recorrido Menu Categorias", "Regresa al Home Principal", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! al volver al Home Principal", "No es Posible Regresar al Home Principal", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Recorrido Menu Categorias", " No es Posible Regresa al Home Principal", false);
            System.out.println("No es Posible Regresa al Home Principal");
            Assert.assertTrue(false);
        }

        /*********************************************************************************************/




    }

}
