package com.aurora_lyhnn.rpg_life.controller;

import com.aurora_lyhnn.rpg_life.dto.HeroInputDto;
import com.aurora_lyhnn.rpg_life.dto.HeroOutputDto;
import com.aurora_lyhnn.rpg_life.service.HeroService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @PostMapping
    public ResponseEntity<HeroOutputDto> createHero(@Valid @RequestBody HeroInputDto heroInputDto) {
        HeroOutputDto heroOutputDto = this.heroService.createHero(heroInputDto);

        URI uri = URI.create(ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + heroOutputDto.id).toUriString());

        return ResponseEntity.created(uri).body(heroOutputDto);
    }

    @GetMapping
    public ResponseEntity<HeroOutputDto> getHeroById(@PathVariable long id) {
        return ResponseEntity.ok(heroService.getHeroById(id));
    }







//
//    public ResponseEntity<Hero> createHero(@RequestBody Hero hero) {
//        this.heroRepository.save(hero);
//
//
////        Hij wil het pad naar de nieuwe resource terugkrijgen >
//        return ResponseEntity.created(CreateIdUri.getUri(hero.getId())).body(hero);
//
//        // this. ... .put(hero.getId, person); > return new ResponseEntity<>(hero, HttpStatus.CREATED);
//    }

//    @GetMapping("/id")
////    @PathVariable koppelt de parameter aan het pad
//    public ResponseEntity<Hero> getHeroById(@PathVariable long id) {
//
//        if (this. ... containsKey(id)) {
//            return ResponseEntity.ok(service.getHeroById(id));
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}
