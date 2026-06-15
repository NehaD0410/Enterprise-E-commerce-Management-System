package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Tracking;
import spring.project.repository.TrackingRepository;
import spring.project.service.TrackingFetchService;

@Service
public class TrackingFetchServiceimple implements TrackingFetchService {
	private final TrackingRepository trackingrepository;

	public TrackingFetchServiceimple(TrackingRepository trackingrepository) {
		super();
		this.trackingrepository = trackingrepository;
	}

	@Override
	public List<Tracking> getTrackings() {
		// TODO Auto-generated method stub
		return trackingrepository.findAll();
	}

	public Tracking getTrackingById(int id) {
		// TODO Auto-generated method stub
		return trackingrepository.findById(id)
				.orElseThrow(() -> new RuntimeException("tracking not found with id: " + id));
	}

}
