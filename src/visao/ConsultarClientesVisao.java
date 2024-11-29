package visao;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gabriel Fernandes
 */
public class ConsultarClientesVisao extends JFrame {
    private JTable tabelaClientes;
    private DefaultTableModel modeloTabela;
    private JTextField campoBusca;
    private JButton btnBuscar, btnSelecionar, btnFechar;

    public ConsultarClientesVisao() {
        setTitle("CONSULTA DE CLIENTES");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        //Layout Principal da Tela de Consulta
        setLayout(null);
        
        
        //Campo de Busca de Clientes
        JLabel jlBusca = new JLabel("Buscar Cliente:");
        add(jlBusca);
        
        campoBusca = new JTextField();
        campoBusca.setBounds(110, 10, 500, 25);
        add(campoBusca);
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(620, 10, 100, 25);
        add(btnBuscar);
        
        //Tabela de Clientes
        modeloTabela = new DefaultTableModel(new String[]{"ID", "Nome/Razao Social", "Tipo", "Contato"}, 0);
        tabelaClientes = new JTable(modeloTabela);
        JScrollPane scrollTabela = new JScrollPane(tabelaClientes);
        add(scrollTabela);
        
        //Botoes
        btnSelecionar = new JButton("Selecionar");
        btnSelecionar.setBounds(520, 470, 120, 30);
        add(btnSelecionar);
        
        btnFechar = new JButton("Fechar");
        btnFechar.setBounds(650, 470, 120, 30);
        add(btnFechar);
        
        configurarEventos();
        
    }
    
    private void configurarEventos() {
        // Evento de buscar o cliente
        btnBuscar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarClientes(campoBusca.getText());
            }
        });
        
        //Evento para selecionar o cliente
        btnSelecionar.addActionListener(new ActionListener() {
            int selectedRow = tabelaClientes.getSelectedRow();
            if(selectedRow != -1) {
            String clienteSelecionado = modeloTabela.getValueAt(selectedRow, 1).toString();
            JOptionPane.showMess
        }
        });
    }
    
    
    
    
    
}
