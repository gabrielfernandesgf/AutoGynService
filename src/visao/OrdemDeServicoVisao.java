/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel Fernandes
 */
public class OrdemDeServicoVisao extends FormPadrao {
    
    JComboBox<String> jcbStatus, jcbCliente, jcbVeiculo, jcbServicos, jcbPecas;
    JLabel jlStatus, jlVeiculo, jlDataInicio, jlDataFim, jlValorServicos, jlValorPecas, jlValorTotal, jlValorPago, jlCliente, jlId, jlCodigoOs, jlModelo, jlServicos,
           jlPecas;
    JTextField jtfVeiculo, jtfDataInicio, jtfDataFim, jtfValorServico, jtfValorPecas, jtfValorTotal, jtfValorPago, jtfId, jtfModelo;
    
    public OrdemDeServicoVisao() {
        setTitle("ORDEM DE SERVI�O");
        
        jlStatus = new JLabel("Status:");
        jlStatus.setBounds(2, 20, 100, 25);
        jpCamposDados.add(jlStatus);
        
        jcbStatus = new JComboBox<>(new String[]{"Or�amento", "Aprova��o", "Execu��o", "Finaliza��o", "Paga"});
        jcbStatus.setBounds(45, 20, 150, 25);
        jpCamposDados.add(jcbStatus);
        
        jcbCliente = new JComboBox<>();
        jcbCliente.setBounds(260, 20, 400, 25);
        jpCamposDados.add(jcbCliente);
        
        jlCliente = new JLabel("Cliente:");
        jlCliente.setBounds(210, 20, 50, 25);
        jpCamposDados.add(jlCliente);
        
        jlId = new JLabel("Cliente ID:");
        jlId.setBounds(2, 50, 100, 25);
        jpCamposDados.add(jlId);
        
        jtfId = new JTextField();
        jtfId.setBounds(60, 50, 50, 25);
        jpCamposDados.add(jtfId);
        jtfId.setEditable(false);
        
        jlVeiculo = new JLabel("Ve�culo:");
        jlVeiculo.setBounds(120, 50, 100, 25);
        jpCamposDados.add(jlVeiculo);
        
        jcbVeiculo = new JComboBox<>();
        jcbVeiculo.setBounds(170, 50, 250, 25);
        jpCamposDados.add(jcbVeiculo);
        
        jlModelo = new JLabel("Modelo:");
        jlModelo.setBounds(440, 50, 150, 25);
        jpCamposDados.add(jlModelo);
        
        jtfModelo = new JTextField();
        jtfModelo.setBounds(490, 50, 170, 25);
        jpCamposDados.add(jtfModelo);
        jtfModelo.setEditable(false);
        
        jlDataInicio = new JLabel("Data de inicio:");
        jlDataInicio.setBounds(2, 80, 100, 25);
        jpCamposDados.add(jlDataInicio);
        
        jtfDataInicio = new JTextField();
        jtfDataInicio.setBounds(80, 80, 150, 25);
        jpCamposDados.add(jtfDataInicio);
        
        jlDataFim = new JLabel("Data Fim:");
        jlDataFim.setBounds(240, 80, 100, 25);
        jpCamposDados.add(jlDataFim);
        
        jtfDataInicio = new JTextField();
        jtfDataInicio.setBounds(300, 80, 150, 25);
        jpCamposDados.add(jtfDataInicio);
        
        jlServicos = new JLabel("Servi�os:");
        jlServicos.setBounds(2, 110, 100, 25);
        jpCamposDados.add(jlServicos);
        
        jcbServicos = new JComboBox<>();
        jcbServicos.setBounds(60, 110, 600, 25);
        jpCamposDados.add(jcbServicos);
        
        jlPecas = new JLabel("Pe�as:");
        jlPecas.setBounds(2, 140, 100, 25);
        jpCamposDados.add(jlPecas);
        
        jcbPecas = new JComboBox<>();
        jcbPecas.setBounds(60, 140, 600, 25);
        jpCamposDados.add(jcbPecas);
        
        jlValorServicos = new JLabel("Total Servi�os:");
        jlValorServicos.setBounds(50, 10, 100, 25);
        jpValores.add(jlValorServicos);
        
        jtfValorServico = new JTextField();
        jtfValorServico.setBounds(20, 30, 150, 25);
        jpValores.add(jtfValorServico);
        
        jlValorPecas = new JLabel("Total Pe�as:");
        jlValorPecas.setBounds(210, 10, 100, 25);
        jpValores.add(jlValorPecas);
        
        jtfValorPecas = new JTextField();
        jtfValorPecas.setBounds(180, 30, 150, 25);
        jpValores.add(jtfValorPecas);
        
        jlValorTotal = new JLabel("Valor Total:");
        jlValorTotal.setBounds(400, 10, 100, 25);
        jpValores.add(jlValorTotal);
        
        jtfValorTotal = new JTextField();
        jtfValorTotal.setBounds(360, 30, 150, 25);
        jpValores.add(jtfValorTotal);
        
        
    }
    
}
