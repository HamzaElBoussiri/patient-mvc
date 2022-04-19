package ma.emsi.patientmvc.sec.repositories;

import ma.emsi.patientmvc.sec.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRolername(String username);
}