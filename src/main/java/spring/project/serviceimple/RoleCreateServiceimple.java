package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.entity.Role;
import spring.project.repository.RoleRepository;
import spring.project.service.RoleCreateService;

@Service
public class RoleCreateServiceimple implements RoleCreateService {
	private final RoleRepository rolerepository;

	public RoleCreateServiceimple(RoleRepository rolerepository) {
		super();
		this.rolerepository = rolerepository;
	}

	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return rolerepository.save(role);
	}

}
