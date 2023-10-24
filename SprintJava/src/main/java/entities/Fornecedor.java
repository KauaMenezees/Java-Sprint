package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Fornecedor")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fornecedorID;
    private String nome;
    private String endereco;
    private String contato;

    @OneToMany(mappedBy = "fornecedor")
    private List<Pedido> pedidos;


}
