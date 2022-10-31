package mrs.domain.repository.user;

import mrs.domain.model.*;
import mrs.domain.service.user.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.security.access.AccessDeniedException;//追加

public interface ResisterRepository extends JpaRepository<User, String> {
}