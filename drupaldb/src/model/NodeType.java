package com.incremensa.drupaldb.model;
// Generated May 11, 2011 9:15:58 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NodeType generated by hbm2java
 */
@Entity
@Table(name="node_type"
    ,catalog="bitnami_drupal7"
)
public class NodeType  implements java.io.Serializable {


     private String type;
     private String name;
     private String base;
     private String module;
     private String description;
     private String help;
     private byte hasTitle;
     private String titleLabel;
     private byte custom;
     private byte modified;
     private byte locked;
     private byte disabled;
     private String origType;

    public NodeType() {
    }

    public NodeType(String type, String name, String base, String module, String description, String help, byte hasTitle, String titleLabel, byte custom, byte modified, byte locked, byte disabled, String origType) {
       this.type = type;
       this.name = name;
       this.base = base;
       this.module = module;
       this.description = description;
       this.help = help;
       this.hasTitle = hasTitle;
       this.titleLabel = titleLabel;
       this.custom = custom;
       this.modified = modified;
       this.locked = locked;
       this.disabled = disabled;
       this.origType = origType;
    }
   
     @Id 
    
    @Column(name="type", unique=true, nullable=false, length=32)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="base", nullable=false)
    public String getBase() {
        return this.base;
    }
    
    public void setBase(String base) {
        this.base = base;
    }
    
    @Column(name="module", nullable=false)
    public String getModule() {
        return this.module;
    }
    
    public void setModule(String module) {
        this.module = module;
    }
    
    @Column(name="description", nullable=false, length=16777215)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="help", nullable=false, length=16777215)
    public String getHelp() {
        return this.help;
    }
    
    public void setHelp(String help) {
        this.help = help;
    }
    
    @Column(name="has_title", nullable=false)
    public byte getHasTitle() {
        return this.hasTitle;
    }
    
    public void setHasTitle(byte hasTitle) {
        this.hasTitle = hasTitle;
    }
    
    @Column(name="title_label", nullable=false)
    public String getTitleLabel() {
        return this.titleLabel;
    }
    
    public void setTitleLabel(String titleLabel) {
        this.titleLabel = titleLabel;
    }
    
    @Column(name="custom", nullable=false)
    public byte getCustom() {
        return this.custom;
    }
    
    public void setCustom(byte custom) {
        this.custom = custom;
    }
    
    @Column(name="modified", nullable=false)
    public byte getModified() {
        return this.modified;
    }
    
    public void setModified(byte modified) {
        this.modified = modified;
    }
    
    @Column(name="locked", nullable=false)
    public byte getLocked() {
        return this.locked;
    }
    
    public void setLocked(byte locked) {
        this.locked = locked;
    }
    
    @Column(name="disabled", nullable=false)
    public byte getDisabled() {
        return this.disabled;
    }
    
    public void setDisabled(byte disabled) {
        this.disabled = disabled;
    }
    
    @Column(name="orig_type", nullable=false)
    public String getOrigType() {
        return this.origType;
    }
    
    public void setOrigType(String origType) {
        this.origType = origType;
    }




}


