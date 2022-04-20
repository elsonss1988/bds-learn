package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;

import java.io.Serializable;
import java.util.Objects;

public class DeliverReviewDTO implements Serializable {
    public static final long serialVersionUID=1;

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    public DeliverReviewDTO(){}

    public DeliverReviewDTO(DeliverStatus status, String feedback, Integer correctCount) {
        this.status = status;
        this.feedback = feedback;
        this.correctCount = correctCount;
    }

    public DeliverReviewDTO(Deliver entity) {
        this.status = entity.getStatus();
        this.feedback = entity.getFeedback();
        this.correctCount = entity.getCorrectCount();
    }

    public DeliverStatus getStatus() {
        return status;
    }

    public void setStatus(DeliverStatus status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(Integer correctCount) {
        this.correctCount = correctCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliverReviewDTO that = (DeliverReviewDTO) o;
        return status == that.status && Objects.equals(feedback, that.feedback) && Objects.equals(correctCount, that.correctCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, feedback, correctCount);
    }
}
