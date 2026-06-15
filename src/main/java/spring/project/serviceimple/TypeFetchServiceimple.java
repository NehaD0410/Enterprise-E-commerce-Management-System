package spring.project.serviceimple;

import java.util.List;

import spring.project.entity.Tracking;
import spring.project.repository.TrackingRepository;
import spring.project.service.TrackingFetchService;

public class TypeFetchServiceimple implements TrackingFetchService {
	private final TrackingRepository trackingrepository;

	public TypeFetchServiceimple(TrackingRepository trackingrepository) {
		super();
		this.trackingrepository = trackingrepository;
	}

	@Override
	public List<Tracking> getTrackings() {
		// TODO Auto-generated method stub
		return trackingrepository.findAll();
	}

	@Override
	public Tracking getTrackingById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
