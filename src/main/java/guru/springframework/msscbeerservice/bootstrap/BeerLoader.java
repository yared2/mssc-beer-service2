package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private  BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango bobs")
                    .beerStyle("IPA")
                    .quantityToBreaw(200)
                    .minOnHand(12)
                    .upc(3152211114L)
                    .price(new BigDecimal(12.95))
                    .build());


            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBreaw(200)
                    .minOnHand(12)
                    .upc(315221111L)
                    .price(new BigDecimal(11.95))
                    .build());
        }
        System.out.println(beerRepository.count());
    }

}
