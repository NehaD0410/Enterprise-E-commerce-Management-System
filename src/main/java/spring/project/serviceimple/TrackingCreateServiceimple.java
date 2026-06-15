package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Tracking;
import spring.project.repository.TrackingRepository;
import spring.project.service.TrackingCreateService;

@Service
public class TrackingCreateServiceimple implements TrackingCreateService {
	private final TrackingRepository trackingrepository;

	public TrackingCreateServiceimple(TrackingRepository trackingrepository) {
		super();
		this.trackingrepository = trackingrepository;
	}

	@Override
	public Tracking addTracking(Tracking tracking) {
		// TODO Auto-generated method stub
		return trackingrepository.save(tracking);
	}

}
