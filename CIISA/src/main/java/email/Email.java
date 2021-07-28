package email;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

import static email.CredencialesEmail.PASS_EMAIL;
import static email.CredencialesEmail.USER_EMAIL;

public class Email {
    private Session session;
    private String destinatario = "ninguno@gmail.com";
    private String asunto = "Predeterminado";
    private String tipoTexto = "Ejecucion terminada con exito";
    private String fileFolder = "";
    private String fileName ="";
    private Message mensaje;
//    private String fileName = "Estimados, Colaboradores(as) \n +" +
//            "            \n +" +
//            "Se acaban de ejecutar satisfactoriamente los casos de prueba Automatizados \n +" +
//            "En el laboratorio de pruebas unitarias y de regresion \n +"+
//            "Se adjunta evidencia de cada ejecucion mediante Reporte PDF";



//    String cuerpoMsg= "Estimados, Colaboradores(as) \n +" +
//            "            \n +" +
//            "Se acaban de ejecutar satisfactoriamente los casos de prueba Automatizados \n +" +
//            "En el laboratorio de pruebas unitarias y de regresion \n +"+
//            "Se adjunta evidencia de cada ejecucion mediante Reporte PDF";


    public Email(){
        SessionProperties sessionProperties = new SessionProperties();
        this.session = sessionProperties.getSession();
        mensaje = new MimeMessage(this.session);
    }

    public void setDestinatario(String dest){
        this.destinatario = dest;
    }
    public void setAsunto(String asunto){
        this.asunto = asunto;
    }
    public void setText(String tipoTexto){
        this.tipoTexto = tipoTexto;
    }
    public void configurarCabeceraEmail(){
        try {
            this.mensaje.setFrom(new InternetAddress(USER_EMAIL));
            this.mensaje.setRecipients(Message.RecipientType.TO,InternetAddress.parse(this.destinatario));
            this.mensaje.setSubject(this.asunto);
            this.mensaje.setText(this.tipoTexto);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    public void setFileFolder(String fileFolder){
        this.fileFolder = fileFolder;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public void configurarCuerpoEmail(){
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();
        DataSource source = new FileDataSource(this.fileFolder + "\\" + this.fileName);
        System.out.println(source);
        try {
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName);
            multipart.addBodyPart(messageBodyPart);
            this.mensaje.setContent(multipart);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

    public void enviarMensaje(){
        try {
            System.out.println("Enviando...");
            Transport.send(mensaje);
            System.out.println("Mensaje enviado correctamente.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
