package info.gigagamer.Util;
import info.gigagamer.Entity.EntityUsuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) { // Clase main de ejecución Java
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        Transaction tra = ses.beginTransaction();

        EntityUsuario datos = new EntityUsuario();
        datos.setNombre("Juancho");
        datos.setEmail("Juancho@gmail.com");
        datos.setContraseña("OneToTri");
        datos.setTipoUsuario("admin"); // Ajusta aquí según el nombre del enum

        ses.save(datos);
        tra.commit();
        ses.close();
    }
}
