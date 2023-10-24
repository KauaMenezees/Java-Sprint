package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "Produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produtoID;
    private String nome;
    private double preco;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "pedidoID")
    private Pedido pedido;

}
