package spring.project.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.project.entity.Role;
import spring.project.repository.RoleRepository;
import spring.project.service.RoleFetchService;

@Service
public class RoleFetchServiceimple implements RoleFetchService {
	private final RoleRepository rolerepository;

	public RoleFetchServiceimple(RoleRepository rolerepository) {
		super();
		this.rolerepository = rolerepository;
	}

	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return rolerepository.findAll();
	}

	@Override
	public Role getRoleByid(int id) {
		// TODO Auto-generated method stub
		return rolerepository.findById(id).orElseThrow(() -> new RuntimeException("Role not found with id: " + id));
	}

}
