package info.gigagamer.Entity;

public class EntityDetallePedido {
    private int idPedido;
    private int idProducto;
    private int cantidad;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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

        EntityDetallePedido that = (EntityDetallePedido) o;

        if (idPedido != that.idPedido) return false;
        if (idProducto != that.idProducto) return false;
        if (cantidad != that.cantidad) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPedido;
        result = 31 * result + idProducto;
        result = 31 * result + cantidad;
        return result;
    }
}
