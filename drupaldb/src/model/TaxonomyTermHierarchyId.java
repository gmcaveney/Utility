package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TaxonomyTermHierarchyId generated by hbm2java
 */
@Embeddable
public class TaxonomyTermHierarchyId  implements java.io.Serializable {


     private int tid;
     private int parent;

    public TaxonomyTermHierarchyId() {
    }

    public TaxonomyTermHierarchyId(int tid, int parent) {
       this.tid = tid;
       this.parent = parent;
    }
   

    @Column(name="tid", nullable=false)
    public int getTid() {
        return this.tid;
    }
    
    public void setTid(int tid) {
        this.tid = tid;
    }

    @Column(name="parent", nullable=false)
    public int getParent() {
        return this.parent;
    }
    
    public void setParent(int parent) {
        this.parent = parent;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TaxonomyTermHierarchyId) ) return false;
		 TaxonomyTermHierarchyId castOther = ( TaxonomyTermHierarchyId ) other; 
         
		 return (this.getTid()==castOther.getTid())
 && (this.getParent()==castOther.getParent());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getTid();
         result = 37 * result + this.getParent();
         return result;
   }   


}


