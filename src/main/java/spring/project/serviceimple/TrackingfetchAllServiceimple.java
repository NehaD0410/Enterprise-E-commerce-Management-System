package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Tracking;
import spring.project.repository.TrackingRepository;
import spring.project.service.TrackingFetchAllService;

@Service
public class TrackingfetchAllServiceimple implements TrackingFetchAllService {
	private final TrackingRepository trackingrepository;

	public TrackingfetchAllServiceimple(TrackingRepository trackingrepository) {
		super();
		this.trackingrepository = trackingrepository;
	}

	@Override
	public List<Tracking> getAllTrackings() {
		// TODO Auto-generated method stub
		return trackingrepository.findAll();
	}

}
