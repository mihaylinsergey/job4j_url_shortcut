package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.domain.Address;
import java.util.List;
import java.util.Optional;

public interface AddressRepository extends CrudRepository<Address, Integer> {

    Optional<Address> findByUrl(String url);

    Address findByCode(String code);

    List<Address> findAll();
}
