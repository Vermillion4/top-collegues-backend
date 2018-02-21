package app.web;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entite.Vote;
import app.repository.VoteRepository;;

/**
 * Liste des votes.
 * @author ETY12
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/votes")
public class VotesController{
	
	@Autowired VoteRepository votes;
	
	@GetMapping("/since?:id")
	protected List<Vote> listerVotes(@PathVariable long id){
		if(id == 0) {
			Optional<Vote> lastId=votes.findAll().stream()
			.collect(Collectors.maxBy(Comparator.comparing(Vote::getId)));
			if(lastId.isPresent()) {
				id=lastId.get().getId();
			}
			else {
				return new ArrayList<Vote>();
			}
		}
		final long realId=id;
		return votes.findAll().stream()
				.filter(vote->vote.getId()>=realId)
				.collect(Collectors.toList());
	}
	
	
	
}
