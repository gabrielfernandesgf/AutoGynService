
package visao;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel Fernandes
 */
public class EstoqueVisao extends FormPadrao {
    
    JLabel jlCodigo, jlNomeDaPeca, jlFabricante, jlQuantidade, jlValorCusto, jlValorVenda;
    JTextField jtfCodigo, jtfNomeDaPeca, jtfFabricante, jtfQuantidade, jtfValorCusto, jtfValorVenda;
    
    public EstoqueVisao(){
        setTitle("Gestao de Estoque");
        
        jlCodigo = new JLabel("Codigo:");
        jlCodigo.setBounds(9, 5, 50, 25);
        jpCamposDados.add(jlCodigo);
        
        jtfCodigo = new JTextField();
        jtfCodigo.setBounds(60, 5, 50, 25);
        jpCamposDados.add(jtfCodigo);
        jtfCodigo.setEditable(false);
        
        jlNomeDaPeca = new JLabel("Nome da Peça:");
        jlNomeDaPeca.setBounds(125, 0, 100, 25);
        jpCamposDados.add(jlNomeDaPeca);
        
        jtfNomeDaPeca = new JTextField();
        jtfNomeDaPeca.setBounds(120, 25, 520, 25);
        jpCamposDados.add(jtfNomeDaPeca);
        
        jlFabricante = new JLabel("Fabricante:");
        jlFabricante.setBounds(9, 45, 150, 25);
        jpCamposDados.add(jlFabricante);
        
        jtfFabricante = new JTextField();
        jtfFabricante.setBounds(9, 65, 250, 25);
        jpCamposDados.add(jtfFabricante);
        
        jlQuantidade = new JLabel("Quantidade em Estoque:");
        jlQuantidade.setBounds(280, 45, 150, 25);
        jpCamposDados.add(jlQuantidade);
        
        jtfQuantidade = new JTextField();
        jtfQuantidade.setBounds(280, 65, 250, 25);
        jpCamposDados.add(jtfQuantidade);
        
        jlValorCusto = new JLabel("Valor de Custo:");
        jlValorCusto.setBounds(9, 90, 150, 25);
        jpCamposDados.add(jlValorCusto);
        
        jtfValorCusto = new JTextField();
        jtfValorCusto.setBounds(9, 110, 250, 25);
        jpCamposDados.add(jtfValorCusto);
        
        jlValorVenda = new JLabel("Valor de Venda:");
        jlValorVenda.setBounds(280, 90, 250, 25);
        jpCamposDados.add(jlValorVenda);
        
        jtfValorVenda = new JTextField();
        jtfValorVenda.setBounds(280, 110, 250, 25);
        jpCamposDados.add(jtfValorVenda);
        
        
        
    }
    
}
