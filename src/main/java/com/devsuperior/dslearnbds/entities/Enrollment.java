package com.devsuperior.dslearnbds.entities;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_enrollment")
public class Enrollment  implements Serializable {
    public static final long serialVersionUID=1l;

    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();
    @Column(columnDefinition="TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;
    @Column(columnDefinition="TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private boolean avaliable;
    private boolean onlyUpdate;

    @ManyToMany(mappedBy="enrollmentsDone")
    private Set<Lesson> lessonDone = new HashSet<>();

    public Enrollment(){}

    public Enrollment(User user,Offer offer, Instant enrollMoment, Instant refundMoment, boolean avaliable, boolean onlyUpdate) {
        super();
        id.setUser(user);
        id.setOffer(offer);
        this.id = id;
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.avaliable = avaliable;
        this.onlyUpdate = onlyUpdate;
    }


    public User getStudent(){
        return id.getUser();
    }

    public void setStudent(User user){
        id.setUser(user);
    }

    public Offer getOffer(){
        return id.getOffer();
    }

    public void setOffer(Offer offer){
        id.setOffer(offer);
    }


    public Instant getEnrollMoment() {
        return enrollMoment;
    }

    public void setEnrollMoment(Instant enrollMoment) {
        this.enrollMoment = enrollMoment;
    }

    public Instant getRefundMoment() {
        return refundMoment;
    }

    public void setRefundMoment(Instant refundMoment) {
        this.refundMoment = refundMoment;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean available) {
        this.avaliable = available;
    }

    public boolean isOnlyUpdate() {
        return onlyUpdate;
    }

    public void setOnlyUpdate(boolean onlyUpdate) {
        this.onlyUpdate = onlyUpdate;
    }
}