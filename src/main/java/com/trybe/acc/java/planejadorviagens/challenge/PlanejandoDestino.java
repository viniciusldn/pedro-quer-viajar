package com.trybe.acc.java.planejadorviagens.challenge;

import com.trybe.acc.java.planejadorviagens.model.Country;
import com.trybe.acc.java.planejadorviagens.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanejandoDestino {

  @Autowired
  private CountryRepository countryRepository;

  /**
   * Implemente a inserção.
   */
  public void inserir() {
    countryRepository.save(new Country("BRASIL", "BRASILIA", null));
    countryRepository.save(new Country("ARGENTINA", "BUENOS AIRES", null));
    countryRepository.save(new Country("URUGUAI", "MONTEVIDEO", null));
    countryRepository.save(new Country("PANAMA", "CIDADE DO PANAMA", null));
  }

  /**
   * Implemente a atualização.
   */
  public void corrigir() {
    Country brasil = countryRepository.findByName("BRASIL").stream().findFirst()
        .orElse(null);
    brasil.setDdi("+55");
    countryRepository.save(brasil);
    Country argentina = countryRepository.findByName("ARGENTINA").stream()
        .findFirst().orElse(null);
    argentina.setDdi("+54");
    countryRepository.save(argentina);
    Country uruguai = countryRepository.findByName("URUGUAI").stream()
        .findFirst().orElse(null);
    uruguai.setDdi("+598");
    countryRepository.save(uruguai);
    Country panama = countryRepository.findByName("PANAMA").stream().findFirst()
        .orElse(null);
    panama.setDdi("+507");
    countryRepository.save(panama);
  }

  /**
   * Implemente a exclusão.
   */
  public void excluir() {
    Country panama = countryRepository.findByName("PANAMA").stream().findFirst()
        .orElse(null);
    countryRepository.delete(panama);
  }
}
