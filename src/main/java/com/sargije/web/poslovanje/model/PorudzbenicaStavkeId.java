package com.sargije.web.poslovanje.model;
// Generated Apr 25, 2017 4:34:49 PM by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PorudzbenicaStavkeId generated by hbm2java
 */
@Embeddable
public class PorudzbenicaStavkeId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3652780329493169383L;
	private int porudzbenicaId;
	private int porudzbenicaStavkaId;

	public PorudzbenicaStavkeId() {
	}

	public PorudzbenicaStavkeId(int porudzbenicaId, int porudzbenicaStavkaId) {
		this.porudzbenicaId = porudzbenicaId;
		this.porudzbenicaStavkaId = porudzbenicaStavkaId;
	}

	@Column(name = "PORUDZBENICA_ID", nullable = false)
	public int getPorudzbenicaId() {
		return this.porudzbenicaId;
	}

	public void setPorudzbenicaId(int porudzbenicaId) {
		this.porudzbenicaId = porudzbenicaId;
	}

	@Column(name = "PORUDZBENICA_STAVKA_ID", nullable = false)
	public int getPorudzbenicaStavkaId() {
		return this.porudzbenicaStavkaId;
	}

	public void setPorudzbenicaStavkaId(int porudzbenicaStavkaId) {
		this.porudzbenicaStavkaId = porudzbenicaStavkaId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PorudzbenicaStavkeId))
			return false;
		PorudzbenicaStavkeId castOther = (PorudzbenicaStavkeId) other;

		return (this.getPorudzbenicaId() == castOther.getPorudzbenicaId())
				&& (this.getPorudzbenicaStavkaId() == castOther.getPorudzbenicaStavkaId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPorudzbenicaId();
		result = 37 * result + this.getPorudzbenicaStavkaId();
		return result;
	}

}
