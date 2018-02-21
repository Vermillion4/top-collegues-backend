package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entite.Vote;

public interface VoteRepository extends JpaRepository<Vote, Integer> {

}
