package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){

        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);


@PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@Validated  @RequestBody BeerDto beerDto){
//todo impl

    return  new ResponseEntity<>(BeerDto.builder().build(),HttpStatus.CREATED);

    }
    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId") UUID beerId,@Validated  @RequestBody BeerDto beerDto){
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(),HttpStatus.NO_CONTENT);
    }


}
