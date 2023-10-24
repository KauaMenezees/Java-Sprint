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
@Table (name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoID;
    private String data;

    @ManyToOne
    @JoinColumn(name = "fornecedorID")
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "pedido")
    private List<Produto> produtos;

    private double total;

    // Construtores, getters e setters
}