package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.domain.Address;
import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Integer> {

    Address findByUrl(String url);

    Address findByCode(String code);

    List<Address> findAll();
}
