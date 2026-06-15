package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Role;
import spring.project.repository.RoleRepository;
import spring.project.service.RoleUpdateService;

@Service
public class RoleUpdateServiceimple implements RoleUpdateService {
	private final RoleRepository rolerepository;

	public RoleUpdateServiceimple(RoleRepository rolerepository) {
		super();
		this.rolerepository = rolerepository;
	}

	@Override
	public Role updateRole(int id, Role role) {
		// TODO Auto-generated method stub
		Role existingRole = rolerepository.findById(id)
				.orElseThrow(() -> new RuntimeException("role not found with id: " + id));
		existingRole.setName(role.getName());
		return rolerepository.save(existingRole);
	}

}
