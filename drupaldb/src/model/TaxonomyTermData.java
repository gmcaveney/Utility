package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxonomyTermData generated by hbm2java
 */
@Entity
@Table(name="taxonomy_term_data"
    ,catalog="bitnami_drupal7"
)
public class TaxonomyTermData  implements java.io.Serializable {


     private Integer tid;
     private int vid;
     private String name;
     private String description;
     private String format;
     private int weight;

    public TaxonomyTermData() {
    }

	
    public TaxonomyTermData(int vid, String name, int weight) {
        this.vid = vid;
        this.name = name;
        this.weight = weight;
    }
    public TaxonomyTermData(int vid, String name, String description, String format, int weight) {
       this.vid = vid;
       this.name = name;
       this.description = description;
       this.format = format;
       this.weight = weight;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="tid", unique=true, nullable=false)
    public Integer getTid() {
        return this.tid;
    }
    
    public void setTid(Integer tid) {
        this.tid = tid;
    }
    
    @Column(name="vid", nullable=false)
    public int getVid() {
        return this.vid;
    }
    
    public void setVid(int vid) {
        this.vid = vid;
    }
    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="description", columnDefinition="longtext")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="format")
    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }
    
    @Column(name="weight", nullable=false)
    public int getWeight() {
        return this.weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }




}


