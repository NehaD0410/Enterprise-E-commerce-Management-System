package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.TrackingRepository;
import spring.project.service.TrackingDeleteService;

@Service
public class TrackingDeleteServiceimple implements TrackingDeleteService {
	private final TrackingRepository trackingrepository;

	public TrackingDeleteServiceimple(TrackingRepository trackingrepository) {
		super();
		this.trackingrepository = trackingrepository;
	}

	@Override
	public void DeleteTracking(int id) {
		// TODO Auto-generated method stub
		trackingrepository.deleteById(id);
	}

}
