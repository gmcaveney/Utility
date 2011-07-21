package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NodeAccessId generated by hbm2java
 */
@Embeddable
public class NodeAccessId  implements java.io.Serializable {


     private int nid;
     private int gid;
     private String realm;

    public NodeAccessId() {
    }

    public NodeAccessId(int nid, int gid, String realm) {
       this.nid = nid;
       this.gid = gid;
       this.realm = realm;
    }
   

    @Column(name="nid", nullable=false)
    public int getNid() {
        return this.nid;
    }
    
    public void setNid(int nid) {
        this.nid = nid;
    }

    @Column(name="gid", nullable=false)
    public int getGid() {
        return this.gid;
    }
    
    public void setGid(int gid) {
        this.gid = gid;
    }

    @Column(name="realm", nullable=false)
    public String getRealm() {
        return this.realm;
    }
    
    public void setRealm(String realm) {
        this.realm = realm;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NodeAccessId) ) return false;
		 NodeAccessId castOther = ( NodeAccessId ) other; 
         
		 return (this.getNid()==castOther.getNid())
 && (this.getGid()==castOther.getGid())
 && ( (this.getRealm()==castOther.getRealm()) || ( this.getRealm()!=null && castOther.getRealm()!=null && this.getRealm().equals(castOther.getRealm()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNid();
         result = 37 * result + this.getGid();
         result = 37 * result + ( getRealm() == null ? 0 : this.getRealm().hashCode() );
         return result;
   }   


}


