package subway;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaStationRepository extends StationRepository, JpaRepository<Station, Long> {
}
