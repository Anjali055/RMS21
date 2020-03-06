package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Feedback;

public interface FeedbackService {

  int createFeedback(Feedback feedback);

 

  int deleteFeedbacks(int user_id);



List<Feedback> getAllFeedback();



Feedback getFeedbackByUserId(int user_id);









}
