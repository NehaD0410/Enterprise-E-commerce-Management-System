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

import spring.project.entity.Role;
import spring.project.service.RoleCreateService;
import spring.project.service.RoleDeleteService;
import spring.project.service.RoleFetchAllService;
import spring.project.service.RoleFetchService;
import spring.project.service.RoleUpdateService;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private final RoleCreateService rolecreateservice;
	@Autowired
	private final RoleDeleteService roledeleteservice;
	@Autowired
	private final RoleUpdateService roleupdateservice;
	@Autowired
	private final RoleFetchService rolefetchservice;
	@Autowired
	private final RoleFetchAllService rolecfetchallservice;

	public RoleController(RoleCreateService rolecreateservice, RoleDeleteService roledeleteservice,
			RoleUpdateService roleupdateservice, RoleFetchService rolefetchservice,
			RoleFetchAllService rolecfetchallservice) {
		super();
		this.rolecreateservice = rolecreateservice;
		this.roledeleteservice = roledeleteservice;
		this.roleupdateservice = roleupdateservice;
		this.rolefetchservice = rolefetchservice;
		this.rolecfetchallservice = rolecfetchallservice;
	}

	@PostMapping
	public ResponseEntity<Role> createRole(@RequestBody Role role) {
		Role savedRole = rolecreateservice.addRole(role);

		return new ResponseEntity<>(savedRole, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Role>> getAllRoles() {
		List<Role> roles = rolecfetchallservice.getAllRoles();

		return ResponseEntity.ok(roles);
	}

	@GetMapping("/{rid}")
	public ResponseEntity<Role> getRoleById(@PathVariable int rid) {
		Role role = rolefetchservice.getRoleByid(rid);

		return ResponseEntity.ok(role);
	}

	@PutMapping("/{rid}")
	public ResponseEntity<Role> updateRole(@PathVariable int rid, @RequestBody Role role) {

		Role updatedRole = roleupdateservice.updateRole(rid, role);

		return ResponseEntity.ok(updatedRole);
	}

	@DeleteMapping("/{rid}")
	public ResponseEntity<String> deleteRole(@PathVariable int rid) {

		return ResponseEntity.ok("Role with ID " + rid + " deleted successfully");
	}
}