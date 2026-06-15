package spring.project.serviceimple;

import org.springframework.stereotype.Service;

import spring.project.repository.RoleRepository;
import spring.project.service.RoleDeleteService;

@Service
public class RoleDeleteServiceimple implements RoleDeleteService {
	private final RoleRepository rolerepository;

	public RoleDeleteServiceimple(RoleRepository rolerepository) {
		super();
		this.rolerepository = rolerepository;
	}

	@Override
	public void DeleteRole(int id) {
		// TODO Auto-generated method stub
		rolerepository.deleteById(id);
	}

}
