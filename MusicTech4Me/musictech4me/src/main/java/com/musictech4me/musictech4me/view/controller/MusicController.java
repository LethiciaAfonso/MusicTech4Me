package com.musictech4me.controller;

import java.util.List;
import java.util.Optional;

import com.musictech4me.service.MusicService;
import com.musictech4me.shared.MusicDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Music")
public class MusicController {

    @Autowired
    MusicService ServicoMusic;

    @GetMapping
    public ResponseEntity<List<MusicDTO>> obterTodos() {
        List<MusicDTO> usuario = servicoMusic.obterTodos();

        return new ResponseEntity<>(Music, HttStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicDTO> obterPorId(@PathVariable String id) {

        MusicDTO musicDto = servicoMusic.obterPorId(id);

        return new ResponseEntity<>(musicDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MusicDTO> adicionar(@RequestBody @Valid MuicDTO musicDto) {
        musicDto = servicoMusic.adicionar(musicDto);

        return new ResponseENtity<>(musicDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public responseEntity<?> deletar(@PathVariable String id) {
        servicoMusic.delete(id);
        return new responseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MusicDTO> atualizar(@PathVariable String id, @RequestBody @Valid JogoDTO jogoDto) {

        MusicDTO dto = ServicoMusic.tualizar(id, musicDto);
        return new ResponseEntity<>(dto, HttpStatus.OK);

    }
}
