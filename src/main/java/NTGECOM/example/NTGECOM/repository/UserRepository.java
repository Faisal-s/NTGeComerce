package NTGECOM.example.NTGECOM.repository;


import NTGECOM.example.NTGECOM.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,  Long> {
}



