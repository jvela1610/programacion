import java.util.Objects;

public class Producto {
	private double codigo;
	private double retirada=0;
	private double precio= 0;

	public Producto() {
		super();
		this.codigo= 1;

	}

	public double getSaldo() {
		return codigo;
	}

	public boolean setSaldo(double saldoinicial) {
		boolean resultado = false;
		if (precio> 0) {
			this.codigo= precio;
			resultado = true;
		}
		return resultado;
	}


	public double getRetirada() {
		return retirada;
	}

	public boolean setRetirada(double retirada) {
		boolean resultado = false;
		double saldoinicial = this.precio - retirada;
		
		if (retirada > 0 && precio > 0) {
			precio -= retirada;
			this.retirada++;
			resultado = true;
		}
		return resultado;

	}

	public Producto(double codigo, double retirada, double precio) {
		super();
		this.codigo = codigo;
		this.retirada = retirada;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", retirada=" + retirada + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, precio, retirada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Double.doubleToLongBits(codigo) == Double.doubleToLongBits(other.codigo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Double.doubleToLongBits(retirada) == Double.doubleToLongBits(other.retirada);
	}
}
