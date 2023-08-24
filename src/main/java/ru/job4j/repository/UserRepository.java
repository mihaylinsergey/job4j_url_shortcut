package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.domain.Site;

public interface UserRepository extends CrudRepository<Site, Integer> {

    Site findBySite(String site);

    Site findByLogin(String login);
}
