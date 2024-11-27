package visao;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel Fernandes
 */
public class AcessoriosVisao extends FormPadrao {
    
    JLabel jlNome, jlDescricao, jlValor, jlQuantidade;
    JTextField jtfNome, jtfDescricao, jtfValor, jtfQuantidade;
    
    public AcessoriosVisao() {
        setTitle("CADASTRO DE ACESSORIOS");
        
        jlNome = new JLabel("Nome:");
        jlNome.setBounds(9, 5, 50, 25);
        jpCamposDados.add(jlNome);
        
        jtfNome = new JTextField();
        jtfNome.setBounds(9, 30, 650, 25);
        jpCamposDados.add(jtfNome);
        
        jlDescricao = new JLabel("Descrição:");
        jlDescricao.setBounds(9, 60, 150, 25);
        jpCamposDados.add(jlDescricao);
        
        jtfDescricao = new JTextField();
        jtfDescricao.setBounds(9, 85, 650, 30);
        jpCamposDados.add(jtfDescricao);
        
        jlValor = new JLabel("Valor:");
        jlValor.setBounds(9, 115, 50, 25);
        jpCamposDados.add(jlValor);
        
        jtfValor = new JTextField();
        jtfValor.setBounds(9, 135, 150, 25);
        jpCamposDados.add(jtfValor);
        
        jlQuantidade = new JLabel("Quantidade:");
        jlQuantidade.setBounds(170, 115, 100, 25);
        jpCamposDados.add(jlQuantidade);
        
        jtfQuantidade = new JTextField();
        jtfQuantidade.setBounds(170, 135, 250, 25);
        jpCamposDados.add(jtfQuantidade);
        
   }
}
