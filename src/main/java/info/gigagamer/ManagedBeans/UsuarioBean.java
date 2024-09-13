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
public class UsuarioBean implements Serializable {

    private List<EntityUsuario> listaEmpleado;
    private SessionFactory sessionFactory;

    public UsuarioBean() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @PostConstruct
    public void init() {
        Session ses = sessionFactory.openSession();
        listaEmpleado = (ArrayList<EntityUsuario>) ses.createQuery("from EntityUsuario").list();
        ses.close();
    }

    public List<EntityUsuario> getListaEmpleado() {
        return listaEmpleado;
    }
}
