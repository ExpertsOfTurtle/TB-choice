
package com.turtlebone.choice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.turtlebone.choice.entity.Activity;
import com.turtlebone.choice.repository.ActivityRepository;
import com.turtlebone.choice.model.ActivityModel;
import com.turtlebone.choice.service.ActivityService;
import com.turtlebone.core.util.BeanCopyUtils;

@Service
public class ActivityServiceImpl implements ActivityService {


	@Autowired
	private ActivityRepository activityRepo;
	

	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return activityRepo.deleteByPrimaryKey(id);
	}
	

    /*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public ActivityModel findByPrimaryKey(Integer id) {
		Activity activity = activityRepo.selectByPrimaryKey(id);
		return BeanCopyUtils.map(activity, ActivityModel.class);
	}
	
	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int updateByPrimaryKey(ActivityModel activityModel) {
		return activityRepo.updateByPrimaryKey(BeanCopyUtils.map(activityModel, Activity.class));
	}
	
	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int updateByPrimaryKeySelective(ActivityModel activityModel) {
		return activityRepo.updateByPrimaryKeySelective(BeanCopyUtils.map(activityModel, Activity.class));
	}
	

	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int create(ActivityModel activityModel) {
		return activityRepo.insert(BeanCopyUtils.map(activityModel, Activity.class));
	}

	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int createSelective(ActivityModel activityModel) {
		return activityRepo.insertSelective(BeanCopyUtils.map(activityModel, Activity.class));
	}

	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int selectCount(ActivityModel activityModel) {
		return activityRepo.selectCount(BeanCopyUtils.map(activityModel, Activity.class));
	}



}