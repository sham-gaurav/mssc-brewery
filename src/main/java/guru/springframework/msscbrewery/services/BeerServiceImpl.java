package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

	@Override
	public BeerDto saveBeer(BeerDto beerDto) {
		log.info(beerDto.toString());
		return BeerDto.builder().id(UUID.randomUUID()).build();
		
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		
		log.info("updated the beer {}" ,beerId);
		log.info(beerDto.toString());
		
	}

	@Override
	public void deleteBeerbyId(UUID beerId) {
		log.info("deleted the beer {}" ,beerId);
		
	}
}
