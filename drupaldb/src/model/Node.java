package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Node generated by hbm2java
 */
@Entity
@Table(name="node"
    ,catalog="bitnami_drupal7"
    , uniqueConstraints = @UniqueConstraint(columnNames="vid") 
)
public class Node  implements java.io.Serializable {


     private Integer nid;
     private int vid;
     private String type;
     private String language;
     private String title;
     private int uid;
     private int status;
     private int created;
     private int changed;
     private int comment;
     private int promote;
     private int sticky;
     private int tnid;
     private int translate;

    public Node() {
    }

    public Node(int vid, String type, String language, String title, int uid, int status, int created, int changed, int comment, int promote, int sticky, int tnid, int translate) {
       this.vid = vid;
       this.type = type;
       this.language = language;
       this.title = title;
       this.uid = uid;
       this.status = status;
       this.created = created;
       this.changed = changed;
       this.comment = comment;
       this.promote = promote;
       this.sticky = sticky;
       this.tnid = tnid;
       this.translate = translate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="nid", unique=true, nullable=false)
    public Integer getNid() {
        return this.nid;
    }
    
    public void setNid(Integer nid) {
        this.nid = nid;
    }
    
    @Column(name="vid", unique=true, nullable=false)
    public int getVid() {
        return this.vid;
    }
    
    public void setVid(int vid) {
        this.vid = vid;
    }
    
    @Column(name="type", nullable=false, length=32)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="language", nullable=false, length=12)
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    @Column(name="title", nullable=false)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="uid", nullable=false)
    public int getUid() {
        return this.uid;
    }
    
    public void setUid(int uid) {
        this.uid = uid;
    }
    
    @Column(name="status", nullable=false)
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    @Column(name="created", nullable=false)
    public int getCreated() {
        return this.created;
    }
    
    public void setCreated(int created) {
        this.created = created;
    }
    
    @Column(name="changed", nullable=false)
    public int getChanged() {
        return this.changed;
    }
    
    public void setChanged(int changed) {
        this.changed = changed;
    }
    
    @Column(name="comment", nullable=false)
    public int getComment() {
        return this.comment;
    }
    
    public void setComment(int comment) {
        this.comment = comment;
    }
    
    @Column(name="promote", nullable=false)
    public int getPromote() {
        return this.promote;
    }
    
    public void setPromote(int promote) {
        this.promote = promote;
    }
    
    @Column(name="sticky", nullable=false)
    public int getSticky() {
        return this.sticky;
    }
    
    public void setSticky(int sticky) {
        this.sticky = sticky;
    }
    
    @Column(name="tnid", nullable=false)
    public int getTnid() {
        return this.tnid;
    }
    
    public void setTnid(int tnid) {
        this.tnid = tnid;
    }
    
    @Column(name="translate", nullable=false)
    public int getTranslate() {
        return this.translate;
    }
    
    public void setTranslate(int translate) {
        this.translate = translate;
    }




}


