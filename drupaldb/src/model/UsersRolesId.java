package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsersRolesId generated by hbm2java
 */
@Embeddable
public class UsersRolesId  implements java.io.Serializable {


     private int uid;
     private int rid;

    public UsersRolesId() {
    }

    public UsersRolesId(int uid, int rid) {
       this.uid = uid;
       this.rid = rid;
    }
   

    @Column(name="uid", nullable=false)
    public int getUid() {
        return this.uid;
    }
    
    public void setUid(int uid) {
        this.uid = uid;
    }

    @Column(name="rid", nullable=false)
    public int getRid() {
        return this.rid;
    }
    
    public void setRid(int rid) {
        this.rid = rid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsersRolesId) ) return false;
		 UsersRolesId castOther = ( UsersRolesId ) other; 
         
		 return (this.getUid()==castOther.getUid())
 && (this.getRid()==castOther.getRid());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUid();
         result = 37 * result + this.getRid();
         return result;
   }   


}

