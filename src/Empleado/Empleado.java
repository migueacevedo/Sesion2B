package Empleado;

public class Empleado {
	public enum tipoEmpleado {
		Vendedor, Encargado
	};

	private tipoEmpleado tipo;
	private float nominaBruta;
	private float nominaNeta;
	private int horasExtra;
	private int ventasMes;

	public Empleado(tipoEmpleado tipo) {
		super();
		this.tipo = tipo;
		this.horasExtra = 0;
		this.nominaBruta = 0;
		this.nominaNeta = 0;
		this.ventasMes = 0;
	}

	public float calculoNominaBruta(tipoEmpleado tipo, float ventasMes, float horasExtra) {
		nominaBruta = 0;
		if (tipo.equals(tipoEmpleado.Vendedor)) {
			nominaBruta = 2000;
			if (ventasMes >= 1000 && ventasMes < 1500) {
				nominaBruta = nominaBruta + 100;
			} else if (ventasMes >= 1500) {
				nominaBruta = nominaBruta + 200;
			}
		} else {
			nominaBruta = 2500;
			if (ventasMes >= 1000 && ventasMes < 1500) {
				nominaBruta = nominaBruta + 100;
			} else if (ventasMes >= 1500) {
				nominaBruta = nominaBruta + 200;
			}
		}

		for (int i = 0; i < horasExtra; i++) {
			nominaBruta = nominaBruta + 30;
		}
		return nominaBruta;
	}

	public float calculoNominaNeta(float nominaBruta) {
		nominaNeta = 0;
		if (nominaBruta >= 2100 && nominaBruta < 2500) {
			nominaNeta = (float) (nominaBruta * (1 - 0.15));
		} else if (nominaBruta >= 2500) {
			nominaNeta = (float) (nominaBruta * (1 - 0.18));
		}
		return nominaNeta;
	}

	/**
	 * @return the tipo
	 */
	public tipoEmpleado getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(tipoEmpleado tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the nominaBruta
	 */
	public float getNominaBruta() {
		return nominaBruta;
	}

	/**
	 * @param nominaBruta the nominaBruta to set
	 */
	public void setNominaBruta(float nominaBruta) {
		this.nominaBruta = nominaBruta;
	}

	/**
	 * @return the nominaNeta
	 */
	public float getNominaNeta() {
		return nominaNeta;
	}

	/**
	 * @param nominaNeta the nominaNeta to set
	 */
	public void setNominaNeta(float nominaNeta) {
		this.nominaNeta = nominaNeta;
	}

	/**
	 * @return the horasExtra
	 */
	public int getHorasExtra() {
		return horasExtra;
	}

	/**
	 * @param horasExtra the horasExtra to set
	 */
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	/**
	 * @return the ventasMes
	 */
	public int getVentasMes() {
		return ventasMes;
	}

	/**
	 * @param ventasMes the ventasMes to set
	 */
	public void setVentasMes(int ventasMes) {
		this.ventasMes = ventasMes;
	}
}
