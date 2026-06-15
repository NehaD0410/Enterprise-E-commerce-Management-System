package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Role;
import spring.project.repository.RoleRepository;
import spring.project.service.RoleFetchAllService;

@Service
public class RoleFetchAllServiceImple implements RoleFetchAllService {
	private final RoleRepository rolerepository;

	public RoleFetchAllServiceImple(RoleRepository rolerepository) {
		super();
		this.rolerepository = rolerepository;
	}

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return rolerepository.findAll();
	}

}
