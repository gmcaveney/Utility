package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TaxonomyIndexId generated by hbm2java
 */
@Embeddable
public class TaxonomyIndexId  implements java.io.Serializable {


     private int nid;
     private int tid;
     private Byte sticky;
     private int created;

    public TaxonomyIndexId() {
    }

	
    public TaxonomyIndexId(int nid, int tid, int created) {
        this.nid = nid;
        this.tid = tid;
        this.created = created;
    }
    public TaxonomyIndexId(int nid, int tid, Byte sticky, int created) {
       this.nid = nid;
       this.tid = tid;
       this.sticky = sticky;
       this.created = created;
    }
   

    @Column(name="nid", nullable=false)
    public int getNid() {
        return this.nid;
    }
    
    public void setNid(int nid) {
        this.nid = nid;
    }

    @Column(name="tid", nullable=false)
    public int getTid() {
        return this.tid;
    }
    
    public void setTid(int tid) {
        this.tid = tid;
    }

    @Column(name="sticky")
    public Byte getSticky() {
        return this.sticky;
    }
    
    public void setSticky(Byte sticky) {
        this.sticky = sticky;
    }

    @Column(name="created", nullable=false)
    public int getCreated() {
        return this.created;
    }
    
    public void setCreated(int created) {
        this.created = created;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TaxonomyIndexId) ) return false;
		 TaxonomyIndexId castOther = ( TaxonomyIndexId ) other; 
         
		 return (this.getNid()==castOther.getNid())
 && (this.getTid()==castOther.getTid())
 && ( (this.getSticky()==castOther.getSticky()) || ( this.getSticky()!=null && castOther.getSticky()!=null && this.getSticky().equals(castOther.getSticky()) ) )
 && (this.getCreated()==castOther.getCreated());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNid();
         result = 37 * result + this.getTid();
         result = 37 * result + ( getSticky() == null ? 0 : this.getSticky().hashCode() );
         result = 37 * result + this.getCreated();
         return result;
   }   


}


