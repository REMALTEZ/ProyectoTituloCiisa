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

public class AlmacenAgregaProductoEasy {

    private WebDriver driver;

    public AlmacenAgregaProductoEasy() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath= "//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
    private WebElement menuAlmacen;

    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[4]/a[1]")
    private WebElement menuProducto;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")
    private WebElement btonAgregaProd;

    @FindBy(id = "txtProducto")
    private WebElement txtProd;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/span[4]/button[1]")
    private WebElement masStock;

    @FindBy(id = "txtPCompra")
    private WebElement txtPecioCompra;

    @FindBy(id = "txtPVenta")
    private WebElement txtPecio1;

    @FindBy(id = "txtPVentaM")
    private WebElement txtPecio2;

    @FindBy(id = "txtPVenta3")
    private WebElement txtPecio3;

    @FindBy(id = "txtSMin")
    private WebElement txtStockMinimo;

    @FindBy(id = "select2-cbCategoria-container")
    private WebElement comboBoxCategoria;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]")
    private WebElement comboBoxMarca;

    @FindBy(id = "select2-cbPresentacion-container")
    private WebElement comboBoxPresentacion;

    @FindBy(id = "btnGuardar")
    private WebElement botonGuardar;

    private void AgregaProductos() throws InterruptedException {

        boolean almacen = metodosGenericos.visualizarObjeto(menuAlmacen, 200);
        if (almacen) {
            Thread.sleep(200);
            menuAlmacen.click();
            addWebReportImage("Ingresa Almacen", "Clik en Almacen agrega Producto", Status.PASS, false);
            reporteObjetoDesplegado(true, " Ingresa Almacen", "Clik en Almacen agrega Producto", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Ingresa Almacen", "No es Posible realizar Clik en Almacen agrega Producto", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! Ingresa Almacen", " No es Posible realizar Clik en Almacen agrega Producto", false);
            System.out.println("No es Posible realizar Clik en Almacen agrega Producto");
            Assert.assertTrue(false);
        }



    }














}
