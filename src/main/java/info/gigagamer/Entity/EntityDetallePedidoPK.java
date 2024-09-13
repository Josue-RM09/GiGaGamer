package info.gigagamer.Entity;

import java.io.Serializable;

public class EntityDetallePedidoPK implements Serializable {
    private int idPedido;
    private int idProducto;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityDetallePedidoPK that = (EntityDetallePedidoPK) o;

        if (idPedido != that.idPedido) return false;
        if (idProducto != that.idProducto) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPedido;
        result = 31 * result + idProducto;
        return result;
    }
}
