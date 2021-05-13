package br.com.alura.forum.dto;

import br.com.alura.forum.model.Resposta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class RespostaDto {

    private Long id;
    private String menssagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;

    public RespostaDto(RespostaDto respostaDto){
        this.id = respostaDto.getId();
        this.menssagem = respostaDto.getMenssagem();
        this.dataCriacao = respostaDto.getDataCriacao();
        this.nomeAutor = respostaDto.getNomeAutor();
    }

    public RespostaDto(Resposta resposta) {
    }
}