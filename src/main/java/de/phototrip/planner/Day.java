package de.phototrip.planner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Day {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;

    @Column(name = "Date")
    private Date date;

    public Day(Date date) {
        this.date = date;
    }

    /**********************
     * GETTER AND SETTERS
     *********************/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
