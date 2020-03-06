package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.FeedbackRepository;
import com.assimilate.matrimony.domain.Feedback;
import com.assimilate.matrimony.domain.Personal_Details;
import com.assimilate.matrimony.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{
     @Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public int createFeedback(Feedback feedback) {
		Feedback feedbackFromDb = feedbackRepository.save(feedback);
		return feedbackFromDb.getFeedback_id();
	}


	@Override
	public int deleteFeedbacks(int user_id) {
		feedbackRepository.deleteByUser_id(user_id);
		return 1;
	}


	@Override
	public List<Feedback> getAllFeedback() {
		// TODO Auto-generated method stub
		return feedbackRepository.findAll();
	}


	@Override
	public Feedback getFeedbackByUserId(int user_id) {
		// TODO Auto-generated method stub
		return feedbackRepository.getByUserId(user_id);
	}

	

	
}
