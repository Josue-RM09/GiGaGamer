package info.gigagamer.ManagedBeans;

import info.gigagamer.Entity.EntityUsuario;
import info.gigagamer.Util.HibernateUtil;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.annotation.PostConstruct;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class LoginBean implements Serializable {

    private List<EntityUsuario> LoguearUsuario;
    private SessionFactory sessionFactory;
    private String EmailLogin;  // Se utilizará para capturar el email ingresado en el formulario
    private String PasswordLogin;  // Se utilizará para capturar la contraseña ingresada en el formulario

    public LoginBean(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @PostConstruct
    public void init() {
        Session ses = sessionFactory.openSession();
        LoguearUsuario = (ArrayList<EntityUsuario>) ses.createQuery("from EntityUsuario").list();
        ses.close();
    }

    public String login() {
        for (EntityUsuario usuario : LoguearUsuario) {
            if (usuario.getEmail().equals(EmailLogin) && usuario.getContraseña().equals(PasswordLogin)) {
                return "/IngresoWeb/bienvenido.xhtml";  // Redirigir a la página de bienvenida si el login es exitoso
            }
        }
        return "Login.xhtml";  // Permanecer en la página de login si las credenciales son incorrectas
    }

    public String getEmailLogin() {
        return EmailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.EmailLogin = emailLogin;
    }

    public String getPasswordLogin() {
        return PasswordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.PasswordLogin = passwordLogin;
    }
}
