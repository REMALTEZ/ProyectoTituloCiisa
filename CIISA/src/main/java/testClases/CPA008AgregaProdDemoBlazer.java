package testClases;

import Base.BaseWeb_Blazer;
import org.testng.annotations.Test;
import page.AgregaPhonesDemoBlazer;

public class CPA008AgregaProdDemoBlazer extends BaseWeb_Blazer {

    @Test(groups = {"Ingresar Productos a DEMO Blazer Web Shopping"},description = "DEMO BLAZER")

    public void agregaProductoDemoBlazer() throws InterruptedException {

        AgregaPhonesDemoBlazer agregaDemoBlazer = new AgregaPhonesDemoBlazer();
        agregaDemoBlazer.menuCategorias();
        agregaDemoBlazer.agregaPhonesAlCarro();
        agregaDemoBlazer.menuCategorias();
        agregaDemoBlazer.agregaPhonesAlCarro();
    }


}
