package com.javaunit3.springmvc;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name="maturity_rating")
    private String maturityRating;

    @Column(name="genre")
    private String genre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    public List<VoteEntity> votes;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<VoteEntity> getVotes() {
        return votes;
    }

    public void setVotes(List<VoteEntity> votes) {
        this.votes = votes;
    }

    public void addVote(VoteEntity vote) {
        this.votes.add(vote);
    }
}
