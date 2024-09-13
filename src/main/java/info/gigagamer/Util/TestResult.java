package info.gigagamer.Util;
import info.gigagamer.Entity.EntityUsuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.ArrayList;

public class TestResult {
    public static void main(String[] args) {
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        ArrayList<EntityUsuario> listaEmpleado = new ArrayList<>();

        // Utiliza el nombre de la clase de entidad en lugar del nombre de la tabla
        String sql = "from EntityUsuario";
        listaEmpleado = (ArrayList<EntityUsuario>) ses.createQuery(sql).list();

        for (EntityUsuario empleado : listaEmpleado) {
            System.out.println(empleado.getNombre() + " " + empleado.getTipoUsuario() + " " + empleado.getEmail());
        }

        ses.close();
    }
}
