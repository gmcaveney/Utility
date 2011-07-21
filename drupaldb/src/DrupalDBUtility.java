package com.incremensa.drupaldb;

import com.incremensa.drupaldb.model.*;

/*
General classes to manipulate the drupal database directly (through hibernate classes)
Uses reverse engineering utility to create
*/

public class DrupalDBUtility {

    static public Node copyNode (Node node) {
    	Node newNode = new Node();
        newNode.setVid(node.getVid());
        newNode.setType(node.getType());
        newNode.setLanguage(node.getLanguage());
        newNode.setTitle(node.getTitle());
        newNode.setUid(node.getUid());
        newNode.setStatus(node.getStatus());
        newNode.setCreated(node.getCreated());
        newNode.setChanged(node.getChanged());
        newNode.setComment(node.getComment());
        newNode.setPromote(node.getPromote());
        newNode.setSticky(node.getSticky());
        newNode.setTnid(node.getTnid());
        newNode.setTranslate(node.getTranslate());
        return newNode;
    }

    static public NodeRevision copyNodeRevision (NodeRevision nodeRevision) {
    	NodeRevision newNodeRevision = new NodeRevision();

    	newNodeRevision.setComment(nodeRevision.getComment());
    	newNodeRevision.setLog(nodeRevision.getLog());
    	newNodeRevision.setNid(nodeRevision.getNid());
    	newNodeRevision.setPromote(nodeRevision.getPromote());
    	newNodeRevision.setStatus(nodeRevision.getStatus());
    	newNodeRevision.setSticky(nodeRevision.getSticky());
    	newNodeRevision.setTimestamp(nodeRevision.getTimestamp());
    	newNodeRevision.setTitle(nodeRevision.getTitle());
    	newNodeRevision.setUid(nodeRevision.getUid());
    	newNodeRevision.setVid(nodeRevision.getVid());
        return newNodeRevision;
    }

}
