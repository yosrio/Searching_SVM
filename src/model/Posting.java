/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yosrio
 */
public class Posting implements Comparable<Posting> {

    private String term;
    private Document document;
    private int numberOfTerm = 1;
    private double weight=0.0;

    public Posting() {
    }

    
    public Posting(Document document) {
        this.document = document;
    }

    public Posting(String term, Document document) {
        this.term = term;
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public int compareTo(Posting posting) {
        int result = 0;
        result = term.compareToIgnoreCase(posting.getTerm());
        if (result == 0) {
            if(posting.getDocument()!=null){
                result = getDocument().getId() - 
                        posting.getDocument().getId();
                return result;
            } else{
                return result;
            }
        } else {
            return result;
        }
    }

    public int getNumberOfTerm() {
        return numberOfTerm;
    }

    public void setNumberOfTerm(int numberOfTerm) {
        this.numberOfTerm = numberOfTerm;
    }

    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Posting{" + "term=" + term + ", numberOfTerm=" + numberOfTerm + ", weight=" + weight + '}';
    }
    
}
