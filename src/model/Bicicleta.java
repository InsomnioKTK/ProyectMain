package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Bicicleta implements Serializable {

	private static final long serialVersionUID = -4303574284668195103L;

	private Long idBicicleta;

	private String grupo;

	private String marca;

	@XmlElement(name = "grupoCambio")
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@XmlElement(name = "marcaBici")
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@XmlAttribute
	public Long getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(Long idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	@Override
	public String toString() {
		return "Bicicleta [idBicicleta=" + idBicicleta + ", grupo=" + grupo + ", marca=" + marca + "]";
	}

}
