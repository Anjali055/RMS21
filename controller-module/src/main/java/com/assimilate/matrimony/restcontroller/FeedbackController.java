package com.assimilate.matrimony.restcontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.assimilate.matrimony.dao.FeedbackRepository;
import com.assimilate.matrimony.domain.Complexion;
import com.assimilate.matrimony.domain.Feedback;
import com.assimilate.matrimony.service.FeedbackService;

@RestController
@CrossOrigin("*")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@PostMapping("/api/feedback/create")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		feedbackService.createFeedback(feedback);
		return feedback;
	}
	
	@GetMapping("/feedback/getAll")
	public List<Feedback> getAll(){
		return feedbackService.getAllFeedback();
	}
	
	@GetMapping("/feedback/getByUserId/{user_id}")
	public Feedback getByUsetId(@PathVariable int user_id) {
		return feedbackService.getFeedbackByUserId(user_id);
	}
	
	@DeleteMapping("/api/feedback/deletefeedback/{user_id}")
	public String deleteFeedback(@PathVariable int user_id) {
		feedbackService.deleteFeedbacks(user_id);
		return "feedback deleted successfully";
	}
}
