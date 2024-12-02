package visao;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Fernandes
 */
public class CadastroServicoVisao extends FormPadrao {
    
    JLabel jlIdServico, jlNomeServico, jlDescricaServico, jlValorUnitario;
    JTextField jtfServico, jtfNomeServico, jtfDescricaoServico, jtfValorUnitario;
    
    JTable tabelaServicos;
    DefaultTableModel modeloTabela;
    

    public CadastroServicoVisao() {
        setTitle("CADASTRO DE SERVI�OS");   
    }

    @Override
    public void inicializarComponentes() {
        jlIdServico = new JLabel("ID SERVI�O:");
        jlIdServico.setBounds(2, 20, 100, 25);
        jpCamposDados.add(jlIdServico);
        
        jtfServico = new JTextField();
        jtfServico.setBounds(80, 20, 50, 25);
        jpCamposDados.add(jtfServico);
        jtfServico.setEditable(false);
        
        jlNomeServico = new JLabel("Servi�o:");
        jlNomeServico.setBounds(150, 20, 100, 25);
        jpCamposDados.add(jlNomeServico);
        
        jtfNomeServico = new JTextField();
        jtfNomeServico.setBounds(200, 20, 550, 25);
        jpCamposDados.add(jtfNomeServico);
        
        jlDescricaServico = new JLabel("Descri��o:");
        jlDescricaServico.setBounds(2, 60, 100, 25);
        jpCamposDados.add(jlDescricaServico);
        
        jtfDescricaoServico = new JTextField();
        jtfDescricaoServico.setBounds(2, 80, 750, 70);
        jpCamposDados.add(jtfDescricaoServico);
        
        jlValorUnitario = new JLabel("Valor:");
        jlValorUnitario.setBounds(2, 160, 100, 25);
        jpCamposDados.add(jlValorUnitario);
        
        jtfValorUnitario = new JTextField();
        jtfValorUnitario.setBounds(2, 180, 200, 30);
        jpCamposDados.add(jtfValorUnitario);
        
        //Configura��o da Tabela no jspListagem do FormPadrao
        modeloTabela = new DefaultTableModel(new String[]{"ID", "Servi�o", "Descri��o", "Valor"}, 0);
        tabelaServicos = new JTable(modeloTabela);
        jspListagem.setViewportView(tabelaServicos);
    }
    
    
}
