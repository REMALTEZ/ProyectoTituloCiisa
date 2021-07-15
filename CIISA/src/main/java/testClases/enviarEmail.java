package testClases;


import email.Email;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class enviarEmail {
    private static String fecha;



    @Test()
    public void enviarEmail(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
        Date date = new Date();
        fecha = dateFormat.format(date);
        String cuerpo= "Estimados, Colaboradores(as) \n +" +
                       "            \n +" +
                       "Se acaban de ejecutar satisfactoriamente los casos de prueba Automatizados \n +" +
                       "En el laboratorio de pruebas unitarias y de regresion \n +"+
                       "Se adjunta evidencia de cada ejecucion mediante Reporte PDF";

       System.out.println(cuerpo);

        Email email = new Email();
        email.setDestinatario("rodrigo.e.maltez@gmail.com");
        email.setAsunto("Reporte Ejecucion de Pruebas Automatizadas");
        email.configurarCuerpoEmail();
        email.setText(cuerpo);
        email.configurarCabeceraEmail();
        email.setFileFolder("C:\\jenkins");
        email.setFileName("report"+"_"+fecha+".zip");
        email.enviarMensaje();

    }


}
