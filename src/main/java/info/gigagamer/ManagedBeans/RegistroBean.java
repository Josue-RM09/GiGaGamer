package info.gigagamer.ManagedBeans;
import info.gigagamer.Entity.EntityUsuario;
import info.gigagamer.Util.HibernateUtil;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.annotation.PostConstruct;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class RegistroBean implements Serializable{

    private String NombreRegistro;
    private SessionFactory sessionFactory;
    private String EmailRegistro;
    private String PasswordRegistro;

    public String getNombreRegistro() {
        return NombreRegistro;
    }

    public void setNombreRegistro(String nombreRegistro) {
        NombreRegistro = nombreRegistro;
    }

    public String getEmailRegistro() {
        return EmailRegistro;
    }

    public void setEmailRegistro(String emailRegistro) {
        EmailRegistro = emailRegistro;
    }

    public String getPasswordRegistro() {
        return PasswordRegistro;
    }

    public void setPasswordRegistro(String passwordRegistro) {
        PasswordRegistro = passwordRegistro;
    }

    public RegistroBean(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void registro(){
        try{
            EntityUsuario datos = new EntityUsuario();
            datos.setTipoUsuario("cliente");
            datos.setNombre(getNombreRegistro());
            datos.setContraseña(getPasswordRegistro());
            datos.setEmail(getEmailRegistro());

            Session ses = sessionFactory.openSession();
            Transaction tra = ses.beginTransaction();
            ses.save(datos);
            tra.commit();
            ses.close();
        } catch (Exception e){
            System.out.println("error");
        }
    }

}
