package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    
    public BeerDto saveBeer(BeerDto beerDto);
    
    public void updateBeer(UUID beerId, BeerDto beerDto);
    
    public void deleteBeerbyId(UUID beerId);
}
