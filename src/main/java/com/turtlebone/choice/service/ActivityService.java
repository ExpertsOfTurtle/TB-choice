
package com.turtlebone.choice.service;

import com.turtlebone.choice.model.ActivityModel;

public interface ActivityService{
	
	public int create(ActivityModel activityModel);
	
	public int createSelective(ActivityModel activityModel);
	
	public ActivityModel findByPrimaryKey(Integer id);
	
	public int updateByPrimaryKey(ActivityModel activityModel);
	
	public int updateByPrimaryKeySelective(ActivityModel activityModel);
	
	public int deleteByPrimaryKey(Integer id);
	

	public int selectCount(ActivityModel activityModel);
	
}