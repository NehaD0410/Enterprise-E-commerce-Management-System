package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Tracking;
import spring.project.repository.TrackingRepository;
import spring.project.service.TrackingUpdateService;

@Service
public class TrackingUpdateServiceimple implements TrackingUpdateService {
	private final TrackingRepository trackingrepository;

	public TrackingUpdateServiceimple(TrackingRepository trackingrepository) {
		super();
		this.trackingrepository = trackingrepository;
	}

	@Override
	public Tracking UpdateTracking(int id, Tracking tracking) {
		// TODO Auto-generated method stub
		Tracking existingTracking = trackingrepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Tracking not found with id: " + id));
		existingTracking.setId(tracking.getId());
		return trackingrepository.save(existingTracking);
	}

}
