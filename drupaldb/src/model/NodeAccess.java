package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NodeAccess generated by hbm2java
 */
@Entity
@Table(name="node_access"
    ,catalog="bitnami_drupal7"
)
public class NodeAccess  implements java.io.Serializable {


     private NodeAccessId id;
     private byte grantView;
     private byte grantUpdate;
     private byte grantDelete;

    public NodeAccess() {
    }

    public NodeAccess(NodeAccessId id, byte grantView, byte grantUpdate, byte grantDelete) {
       this.id = id;
       this.grantView = grantView;
       this.grantUpdate = grantUpdate;
       this.grantDelete = grantDelete;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="nid", column=@Column(name="nid", nullable=false) ), 
        @AttributeOverride(name="gid", column=@Column(name="gid", nullable=false) ), 
        @AttributeOverride(name="realm", column=@Column(name="realm", nullable=false) ) } )
    public NodeAccessId getId() {
        return this.id;
    }
    
    public void setId(NodeAccessId id) {
        this.id = id;
    }
    
    @Column(name="grant_view", nullable=false)
    public byte getGrantView() {
        return this.grantView;
    }
    
    public void setGrantView(byte grantView) {
        this.grantView = grantView;
    }
    
    @Column(name="grant_update", nullable=false)
    public byte getGrantUpdate() {
        return this.grantUpdate;
    }
    
    public void setGrantUpdate(byte grantUpdate) {
        this.grantUpdate = grantUpdate;
    }
    
    @Column(name="grant_delete", nullable=false)
    public byte getGrantDelete() {
        return this.grantDelete;
    }
    
    public void setGrantDelete(byte grantDelete) {
        this.grantDelete = grantDelete;
    }




}


