package com.vinu.publication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Useee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String publication;
    private String doi;
    private String title;
    private String journal;
    private String pubid;
    private String contribution;
    private String reach;
    private String editionno;
    private String volnum;
    private String isbn;
    private String issn;
    private String pfrom;
    private String pto;
    private String indexing;
    private String issuenum;
    private String impactfactor;

    @ElementCollection
    @CollectionTable(name = "user_coauthors", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "coauthor")
    private List<String> coAuthors;

    @Column(name = "publicationDate")
    private LocalDate publicationDate;

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for publication
    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    // Getter and Setter for doi
    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getPfrom() {
        return pfrom;
    }

    public void setPfrom(String pfrom) {
        this.pfrom = pfrom;
    }

    public String getPto() {
        return pto;
    }

    public void setPto(String pto) {
        this.pto = pto;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for journal
    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    // Getter and Setter for pubid
    public String getPubid() {
        return pubid;
    }

    public void setPubid(String pubid) {
        this.pubid = pubid;
    }

    // Getter and Setter for contribution
    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    // Getter and Setter for reach
    public String getReach() {
        return reach;
    }

    public void setReach(String reach) {
        this.reach = reach;
    }

    // Getter and Setter for editionno
    public String getEditionno() {
        return editionno;
    }

    public void setEditionno(String editionno) {
        this.editionno = editionno;
    }

    // Getter and Setter for volnum
    public String getVolnum() {
        return volnum;
    }

    public void setVolnum(String volnum) {
        this.volnum = volnum;
    }

    // Getter and Setter for isbn
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter and Setter for issn
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    // Getter and Setter for indexing
    public String getIndexing() {
        return indexing;
    }

    public void setIndexing(String indexing) {
        this.indexing = indexing;
    }

    // Getter and Setter for issuenum
    public String getIssuenum() {
        return issuenum;
    }

    public void setIssuenum(String issuenum) {
        this.issuenum = issuenum;
    }

    // Getter and Setter for impactfactor
    public String getImpactfactor() {
        return impactfactor;
    }

    public void setImpactfactor(String impactfactor) {
        this.impactfactor = impactfactor;
    }

    // Getter and Setter for coAuthors
    public List<String> getCoAuthors() {
        return coAuthors;
    }

    public void setCoAuthors(List<String> coAuthors) {
        this.coAuthors = coAuthors;
    }

    // Getter and Setter for publicationDate
    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate date) {
        this.publicationDate = date;
    }

}
