/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "show")
@NamedQueries({
    @NamedQuery(name = "Show.findAll", query = "SELECT s FROM Show s"),
    @NamedQuery(name = "Show.findByShowId", query = "SELECT s FROM Show s WHERE s.showId = :showId"),
    @NamedQuery(name = "Show.findByShowTime", query = "SELECT s FROM Show s WHERE s.showTime = :showTime"),
    @NamedQuery(name = "Show.findByShowLocation", query = "SELECT s FROM Show s WHERE s.showLocation = :showLocation"),
    @NamedQuery(name = "Show.findByAvaliableSeats", query = "SELECT s FROM Show s WHERE s.avaliableSeats = :avaliableSeats")})
public class Show implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "show_id")
    private Integer showId;
    
    @Column(name = "show_time")
    @Temporal(TemporalType.TIME)
    private Date showTime;
    
    @Basic(optional = false)
    @Column(name = "show_location")
    private String showLocation;
    
    @Column(name = "avaliable_seats")
    private Integer avaliableSeats;
    
    @JoinColumn(name = "art_name", referencedColumnName = "artist_name")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Art_Name")
    private Artist artName;

    public Show() {
    }

    public Show(Integer showId) {
        this.showId = showId;
    }

    public Show(Integer showId, String showLocation) {
        this.showId = showId;
        this.showLocation = showLocation;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public String getShowLocation() {
        return showLocation;
    }

    public void setShowLocation(String showLocation) {
        this.showLocation = showLocation;
    }

    public Integer getAvaliableSeats() {
        return avaliableSeats;
    }

    public void setAvaliableSeats(Integer avaliableSeats) {
        this.avaliableSeats = avaliableSeats;
    }

    public Artist getArtName() {
        return artName;
    }

    public void setArtName(Artist artName) {
        this.artName = artName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (showId != null ? showId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Show)) {
            return false;
        }
        Show other = (Show) object;
        if ((this.showId == null && other.showId != null) || (this.showId != null && !this.showId.equals(other.showId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demo.db.Show[ showId=" + showId + " ]";
    }
    
}
