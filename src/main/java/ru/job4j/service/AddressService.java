package ru.job4j.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.job4j.domain.Address;
import ru.job4j.repository.AddressRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressService {

    private AddressRepository addressRepository;
    private static final Logger LOG = LoggerFactory.getLogger(AddressService.class.getName());

    public Optional<Address> save(Address address) {
        Optional<Address> rsl = Optional.empty();
        try {
            rsl = Optional.of(addressRepository.save(address));
        } catch (Exception e) {
            LOG.error("Error!", e);
        }
        return rsl;
    }

    public Optional<Address> findByUrl(String url) {
        Optional<Address> rsl = Optional.empty();
        try {
            rsl = Optional.ofNullable(addressRepository.findByUrl(url));
        } catch (Exception e) {
            LOG.error("Error!", e);
        }
        return rsl;
    }

    public boolean update(Address address) {
        if (findByUrl(address.getUrl()).isPresent()) {
            addressRepository.save(address);
            return true;
        }
        return false;
    }

    public Optional<Address> findByCode(String code) {
        Optional<Address> rsl = Optional.empty();
        try {
            rsl = Optional.ofNullable(addressRepository.findByCode(code));
        } catch (Exception e) {
            LOG.error("Error!", e);
        }
        return rsl;
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

}
