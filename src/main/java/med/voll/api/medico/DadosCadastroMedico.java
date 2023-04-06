package med.voll.api.medico;

import med.voll.api.endereco.dadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, dadosEndereco endereco) {
}
