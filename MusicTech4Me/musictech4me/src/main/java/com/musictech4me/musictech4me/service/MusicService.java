package com.musictech4me.service;

import java.util.List;
import java.util.Optional;

import com.musictech4me.shared.MusicDTO;

import org.springframework.expression.spel.support.ReflectivePropertyAccessor.OptimalPropertyAccessor;
import org.springframework.stereotype.Service;

@Service
public interface MusicService {

    List<MusicDTO> obterTodos();

    Optional<MusicDTO> obterPorId(Spring idMusic);

    MusicDTO obterPorId(String idMusic);

    MusicDTO adicionar(MusicDTO MusicDTO);

    MusicDTO atualizar(String id, MusicDTO musicDto);

    void delete(String idMusic);

}
