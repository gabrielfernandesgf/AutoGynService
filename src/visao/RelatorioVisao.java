package visao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

public class RelatorioVisao extends FormPadrao {

    // Componentes para Filtros
    JLabel jlPeriodoInicio, jlPeriodoFim, jlTipoRelatorio;
    JTextField jtfPeriodoInicio, jtfPeriodoFim;
    JComboBox<String> jcbTipoRelatorio;
    JButton jbGerarRelatorio, jbExportar, jbFechar;

    // Tabela
    JTable tabelaRelatorios;
    DefaultTableModel modeloTabela;

    public RelatorioVisao() {
        setTitle("Relat�rios");

        // Filtros
        jlPeriodoInicio = new JLabel("Per�odo In�cio:");
        jlPeriodoInicio.setBounds(10, 10, 100, 25);
        jpCamposDados.add(jlPeriodoInicio);

        jtfPeriodoInicio = new JTextField();
        jtfPeriodoInicio.setBounds(120, 10, 120, 25);
        jpCamposDados.add(jtfPeriodoInicio);

        jlPeriodoFim = new JLabel("Per�odo Fim:");
        jlPeriodoFim.setBounds(250, 10, 100, 25);
        jpCamposDados.add(jlPeriodoFim);

        jtfPeriodoFim = new JTextField();
        jtfPeriodoFim.setBounds(340, 10, 120, 25);
        jpCamposDados.add(jtfPeriodoFim);

        jlTipoRelatorio = new JLabel("Tipo de Relat�rio:");
        jlTipoRelatorio.setBounds(10, 50, 120, 25);
        jpCamposDados.add(jlTipoRelatorio);

        jcbTipoRelatorio = new JComboBox<>(new String[]{"Selecione", "Relat�rio de OS", "Relat�rio de Pe�as", "Relat�rio de Servi�os"});
        jcbTipoRelatorio.setBounds(120, 50, 200, 25);
        jpCamposDados.add(jcbTipoRelatorio);

        // Bot�es
        jbGerarRelatorio = new JButton("Gerar Relat�rio");
        jbGerarRelatorio.setBounds(10, 90, 150, 30);
        jpCamposDados.add(jbGerarRelatorio);

        jbExportar = new JButton("Exportar");
        jbExportar.setBounds(170, 90, 150, 30);
        jpCamposDados.add(jbExportar);

        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(330, 90, 150, 30);
        jpCamposDados.add(jbFechar);

        // Tabela no jspListagem
        modeloTabela = new DefaultTableModel(new String[]{"ID", "Descri��o", "Data", "Valor"}, 0);
        tabelaRelatorios = new JTable(modeloTabela);
        jspListagem.setViewportView(tabelaRelatorios);

        // Eventos
        configurarEventos();
    }

    private void configurarEventos() {
        // Evento para Gerar Relat�rio
        jbGerarRelatorio.addActionListener(e -> gerarRelatorio());

        // Evento para Exportar Relat�rio
        jbExportar.addActionListener(e -> exportarRelatorio());

        // Evento para Fechar a Tela
        jbFechar.addActionListener(e -> dispose());
    }

    private void gerarRelatorio() {
        String periodoInicio = jtfPeriodoInicio.getText();
        String periodoFim = jtfPeriodoFim.getText();
        String tipoRelatorio = (String) jcbTipoRelatorio.getSelectedItem();

        modeloTabela.setRowCount(0); // Limpar a tabela antes de gerar

        // Simula��o de dados (l�gica real ser� baseada no banco de dados)
        if (tipoRelatorio.equals("Relat�rio de OS")) {
            modeloTabela.addRow(new Object[]{1, "Ordem de Servi�o 001", "2024-11-01", "500.00"});
            modeloTabela.addRow(new Object[]{2, "Ordem de Servi�o 002", "2024-11-10", "300.00"});
        } else if (tipoRelatorio.equals("Relat�rio de Pe�as")) {
            modeloTabela.addRow(new Object[]{1, "Pe�a A", "2024-11-05", "50.00"});
            modeloTabela.addRow(new Object[]{2, "Pe�a B", "2024-11-15", "100.00"});
        } else if (tipoRelatorio.equals("Relat�rio de Servi�os")) {
            modeloTabela.addRow(new Object[]{1, "Servi�o X", "2024-11-07", "200.00"});
            modeloTabela.addRow(new Object[]{2, "Servi�o Y", "2024-11-12", "150.00"});
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de relat�rio.", "Aten��o", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void exportarRelatorio() {
        JOptionPane.showMessageDialog(this, "Exporta��o de relat�rios ainda n�o implementada.", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
        // Implementa��o futura para exportar para PDF/Excel
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RelatorioVisao tela = new RelatorioVisao();
            tela.setVisible(true);
        });
    }
}
