
package visao;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel Fernandes
 */
public class EstoqueVisao extends FormPadrao {
    
    JLabel jlId, jlNomeDaPeca, jlFabricante, jlQuantidade, jlValorCusto, jlValorVenda, jlVolumeTamanho;
    JTextField jtfId, jtfNomeDaPeca, jtfFabricante, jtfQuantidade, jtfValorCusto, jtfValorVenda, jtfVolumeTamanho;
    
    public EstoqueVisao(){
        setTitle("Gestao de Estoque");
        
        jlId = new JLabel("ID:");
        jlId.setBounds(9, 5, 50, 25);
        jpCamposDados.add(jlId);
        
        jtfId = new JTextField();
        jtfId.setBounds(50, 5, 50, 25);
        jpCamposDados.add(jtfId);
        jtfId.setEditable(false);
        
        jlNomeDaPeca = new JLabel("Nome da Peça:");
        jlNomeDaPeca.setBounds(125, 5, 100, 25);
        jpCamposDados.add(jlNomeDaPeca);
        
        jtfNomeDaPeca = new JTextField();
        jtfNomeDaPeca.setBounds(210, 5, 550, 25);
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
        
        jlVolumeTamanho = new JLabel("Volume / Tamanho:");
        jlVolumeTamanho.setBounds(550, 90, 150, 25);
        jpCamposDados.add(jlVolumeTamanho);
        
        jtfValorVenda = new JTextField();
        jtfValorVenda.setBounds(550, 110, 200, 25);
        jpCamposDados.add(jtfValorVenda);
        
        
        
    }
    
}
