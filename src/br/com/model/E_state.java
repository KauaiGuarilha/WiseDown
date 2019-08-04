package br.com.model;

/**
 *
 * @author Kauai Guarilha
 */
public class E_state {
    
    private int id;
    private String descricao;
    
    public E_state(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }   

    @Override // Troca da seleção para a descrição do Estado
    public String toString() {
        return getDescricao();
    }
    
    
}
