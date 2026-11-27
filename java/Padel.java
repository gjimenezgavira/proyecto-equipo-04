package ENT_Codigo;

//CODIGO NORMAL
/*UNA TIENDA ONLINE SOBRE PADEL EN LA QUE REALIZAS LAS COMPRAS MEDIANTE SALDO
 *Y PUEDES CREAR CUENTA E INICIAR SESION (+20€ POR REGISTRARSE)
 *RECIBIR DESCUENTOS POR PRECIO DE COMPRA
 */
public class Padel {
	private String usuario;
	private String contraseña;
	private float saldo;
	private int total;

	public Padel() {
		this.usuario = ("");
		this.contraseña = ("");
		this.saldo = 0;
		this.total = 0;
	}

	public Padel(String usuario, String contraseña, float saldo) {
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.saldo = saldo + 20;
	}

	public void removeSaldo(float saldo) {
		this.saldo -= saldo;
	}

	public void addSaldo(float saldo) {
		this.saldo += saldo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String allInf() {
		return "Padel \nUsuario=" + usuario + "\nSaldo=" + saldo + "\nTotal= " + total;
	}

}
