package testClases;

import Base.BaseWeb_Shopping;
import org.testng.annotations.Test;
import page.AgregarProductoShoppingDemoQA;
import page.loginShoppingDemoQA;

public class CPA007AgregaProductoShopping extends BaseWeb_Shopping {

    @Test(groups = {"Ingresar A SHOPPING AGREGA PRODUCTOS A CARRO DE COMPRAS"},description = "TOOLSQA ")

    public void agregaProductos() throws InterruptedException {
        AgregarProductoShoppingDemoQA agregaProd= new AgregarProductoShoppingDemoQA();
        loginShoppingDemoQA loginShoppingDemoQA = new loginShoppingDemoQA();
        loginShoppingDemoQA.loginShopping();
        agregaProd.agregaAudifonos();

    }
}
