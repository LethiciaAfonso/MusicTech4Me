package com.musictech4me.service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

import com.musictech4me.model;
import com.musictech4me.repository;
import com.musictech4me.shared.MusicDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicserviceImpl implements MusicService {

    @Autowired
    MusicRepository repositorymusic;

    @Override
    public List<MusicDTO> obterTodos() {
        List<Music> Music = repositorymusic.findALL();

        ModelMapper mapper = new ModelMapper();

        return jogas.stream().map(jogo -> mapper.map(Music, MusicDTO.class)).collet(colletors.toList());

    }

    @Override
    public MusicDTo adicionar(MusicDtO musicDTO) {

        ModelMapper mapper = new MOdelMapper();

        Music music = mapper.map(MusicDTo, music.class);

        Music.setId(null);

        Music = repositorymusic.save(Music);

        return mapper.map(music.MusicDTO.class);
    }

    @Override
    public Optional<MusicDTO> obterPorId(String idmusic) {

        Optional<music> OptionalMusic = MusicRepository.findById(idMusic);

        if (optionalMusic.isEmpty()) {
            throw new InputMismatchException("Não foi encontrada a musica com o id: " + idMusic);
        }
        MusicDTO musicDto = new ModelMapper().map(optionalMusic.get(), MusicDTO.class);

        return Optional.of(MusicDto);
    }

    @Override
    public void delete(String idMusic) {

        repositorymusic.deleteById(idMusic);
    }

    @Override
    public MusicDTO atualizar(String id, MusicDTO MusicDto) {

        MusicDto.setId(id);

        Music music = new ModelMapper().map(MusicDto, Music.class);
        repositorioMusic.save(music);

        return MusicDto;
    }

}