package de.phototrip.planner.table;

import javax.persistence.*;
import java.util.Date;

@Table
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
