package com.sargije.web.poslovanje.model;
// Generated Apr 25, 2017 4:34:49 PM by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Porudzbenica generated by hbm2java
 */
@Entity
@Table(name = "PORUDZBENICA",  schema = "PUBLIC", catalog = "POSLOVANJE")
public class Porudzbenica implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1823600191714514579L;
	private Long porudzbenicaId;
	private Korisnik korisnik;
	private Date datumPorudzbenice;
	private Boolean otvorena;
	private Boolean placena;
	private Date datumZatvaranja;
	private BigDecimal cena;
	private BigDecimal popust;
	private Set<PorudzbenicaStavke> porudzbenicaStavkes = new HashSet<PorudzbenicaStavke>(0);

	public Porudzbenica() {
	}

	public Porudzbenica(Korisnik korisnik, Date datumPorudzbenice, Boolean otvorena, Boolean placena,  Date datumZatvaranja, BigDecimal cena,
			BigDecimal popust,	Set<PorudzbenicaStavke> porudzbenicaStavkes) {
		this.korisnik = korisnik;
		this.datumPorudzbenice = datumPorudzbenice;
		this.otvorena = otvorena;
		this.placena = placena;
		this.datumZatvaranja = datumZatvaranja;
		this.cena = cena;
		this.popust = popust;
		this.porudzbenicaStavkes = porudzbenicaStavkes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "PORUDZBENICA_ID", unique = true, nullable = false)
	public Long getPorudzbenicaId() {
		return this.porudzbenicaId;
	}

	public void setPorudzbenicaId(Long porudzbenicaId) {
		this.porudzbenicaId = porudzbenicaId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "KORISNIK_ID")
	public Korisnik getKorisnik() {
		return this.korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATUM_PORUDZBENICE", length = 8)
	public Date getDatumPorudzbenice() {
		return this.datumPorudzbenice;
	}

	public void setDatumPorudzbenice(Date datumPorudzbenice) {
		this.datumPorudzbenice = datumPorudzbenice;
	}

	@Column(name = "OTVORENA")
	public Boolean getOtvorena() {
		return this.otvorena;
	}
	
	public void setOtvorena(Boolean otvorena) {
		this.otvorena = otvorena;
	}
	
	@Column(name = "PLACENA")
	public Boolean getPlacena() {
		return placena;
	}

	public void setPlacena(Boolean placena) {
		this.placena = placena;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATUM_ZATVARANJA", length = 8)
	public Date getDatumZatvaranja() {
		return this.datumZatvaranja;
	}

	public void setDatumZatvaranja(Date datumZatvaranja) {
		this.datumZatvaranja = datumZatvaranja;
	}

	@Column(name = "CENA", precision = 20, scale = 2)
	public BigDecimal getCena() {
		return this.cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	@Column(name = "POPUST", precision = 2)
	public BigDecimal getPopust() {
		return this.popust;
	}

	public void setPopust(BigDecimal popust) {
		this.popust = popust;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "porudzbenica", cascade = CascadeType.REMOVE)
	@OrderBy("id")
	public Set<PorudzbenicaStavke> getPorudzbenicaStavkes() {
		return this.porudzbenicaStavkes;
	}

	public void setPorudzbenicaStavkes(Set<PorudzbenicaStavke> porudzbenicaStavkes) {
		this.porudzbenicaStavkes = porudzbenicaStavkes;
	}

}
