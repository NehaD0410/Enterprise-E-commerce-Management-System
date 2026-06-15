package spring.project.service;

import java.util.List;

import spring.project.entity.Tracking;

public interface TrackingFetchService {
	List<Tracking> getTrackings();

	Tracking getTrackingById(int id);

}
