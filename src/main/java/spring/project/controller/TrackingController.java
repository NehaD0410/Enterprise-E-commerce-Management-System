package spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.project.entity.Tracking;
import spring.project.service.TrackingCreateService;
import spring.project.service.TrackingDeleteService;
import spring.project.service.TrackingFetchAllService;
import spring.project.service.TrackingFetchService;
import spring.project.service.TrackingUpdateService;

@RestController
@RequestMapping("/tracking")
public class TrackingController {
	@Autowired
	private final TrackingCreateService trackingcreateservice;
	@Autowired
	private final TrackingDeleteService trackingdeleteservice;
	@Autowired
	private final TrackingUpdateService trackingupdateservice;
	@Autowired
	private final TrackingFetchService trackingfetchservice;
	@Autowired
	private final TrackingFetchAllService trackingcfetchAllservice;

	public TrackingController(TrackingCreateService trackingcreateservice, TrackingDeleteService trackingdeleteservice,
			TrackingUpdateService trackingupdateservice, TrackingFetchService trackingfetchservice,
			TrackingFetchAllService trackingcfetchAllservice) {
		super();
		this.trackingcreateservice = trackingcreateservice;
		this.trackingdeleteservice = trackingdeleteservice;
		this.trackingupdateservice = trackingupdateservice;
		this.trackingfetchservice = trackingfetchservice;
		this.trackingcfetchAllservice = trackingcfetchAllservice;
	}

	@PostMapping
	public ResponseEntity<Tracking> createTracking(@RequestBody Tracking tracking) {
		Tracking savedTaluka = trackingcreateservice.addTracking(tracking);

		return new ResponseEntity<>(savedTaluka, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Tracking>> getAllTracking() {
		List<Tracking> tracking = trackingcfetchAllservice.getAllTrackings();

		return ResponseEntity.ok(tracking);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tracking> getTalukaById(@PathVariable int id) {
		Tracking tracking = trackingfetchservice.getTrackingById(id);

		return ResponseEntity.ok(tracking);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Tracking> updateTaluka(@PathVariable int id, @RequestBody Tracking trackingDetails) {

		Tracking updatedTaluka = trackingupdateservice.UpdateTracking(id, trackingDetails);

		return ResponseEntity.ok(updatedTaluka);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTaluka(@PathVariable int id) {

		trackingdeleteservice.DeleteTracking(id);

		return ResponseEntity.ok("Taluka with ID " + id + " was deleted successfully.");
	}
}
