package med.voll.api.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosPaciente(@NotBlank String nome, @NotBlank @Email String email) {

}
