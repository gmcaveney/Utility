package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TaxonomyIndex generated by hbm2java
 */
@Entity
@Table(name="taxonomy_index"
    ,catalog="bitnami_drupal7"
)
public class TaxonomyIndex  implements java.io.Serializable {


     private TaxonomyIndexId id;

    public TaxonomyIndex() {
    }

    public TaxonomyIndex(TaxonomyIndexId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="nid", column=@Column(name="nid", nullable=false) ), 
        @AttributeOverride(name="tid", column=@Column(name="tid", nullable=false) ), 
        @AttributeOverride(name="sticky", column=@Column(name="sticky") ), 
        @AttributeOverride(name="created", column=@Column(name="created", nullable=false) ) } )
    public TaxonomyIndexId getId() {
        return this.id;
    }
    
    public void setId(TaxonomyIndexId id) {
        this.id = id;
    }




}


