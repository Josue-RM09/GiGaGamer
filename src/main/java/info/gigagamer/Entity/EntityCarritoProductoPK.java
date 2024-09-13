package info.gigagamer.Entity;

import java.io.Serializable;

public class EntityCarritoProductoPK implements Serializable {
    private int idCarrito;
    private int idProducto;

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityCarritoProductoPK that = (EntityCarritoProductoPK) o;

        if (idCarrito != that.idCarrito) return false;
        if (idProducto != that.idProducto) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCarrito;
        result = 31 * result + idProducto;
        return result;
    }
}
