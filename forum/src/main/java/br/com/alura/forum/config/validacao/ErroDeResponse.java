package br.com.alura.forum.config.validacao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErroDeResponse {

    private String campo;
    private String erro;

}
