package info.gigagamer.Entity;

public class EntityCarritoProducto {
    private int idCarrito;
    private int idProducto;
    private int cantidad;

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityCarritoProducto that = (EntityCarritoProducto) o;

        if (idCarrito != that.idCarrito) return false;
        if (idProducto != that.idProducto) return false;
        if (cantidad != that.cantidad) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCarrito;
        result = 31 * result + idProducto;
        result = 31 * result + cantidad;
        return result;
    }
}
