import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class Hospital extends JFrame {
    private int contador = 1; // Contador para gerar senhas sequenciais
    private Queue<Integer> filaSenhas = new LinkedList<>(); // Fila de senhas a serem chamadas
    private DefaultListModel<String> historicoModel = new DefaultListModel<>(); // Modelo para armazenar o histórico
    private JLabel lblSenhaAtual; // Label para exibir a senha atual
    private JList<String> historicoList; // Lista para exibir o histórico de chamadas
    
    public Hospital() {
        setTitle("Gerador de Senhas - Hospital");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JButton btnGerarSenha = new JButton("Gerar Senha");
        JButton btnChamarProximo = new JButton("Chamar Próximo");
        lblSenhaAtual = new JLabel("Senha Atual: Nenhuma");
        historicoList = new JList<>(historicoModel);
        
        // Evento para gerar uma nova senha e adicioná-la à fila
        btnGerarSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filaSenhas.add(contador);
                historicoModel.addElement("Senha gerada: " + contador);
                contador++;
            }
        });
        
        // Evento para chamar a próxima senha da fila, caso exista
        btnChamarProximo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!filaSenhas.isEmpty()) {
                    int senhaChamada = filaSenhas.poll(); // Remove a primeira senha da fila
                    lblSenhaAtual.setText("Senha Atual: " + senhaChamada);
                    historicoModel.addElement("Senha chamada: " + senhaChamada);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma senha na fila.");
                }
            }
        });
        
        // Adiciona os componentes à interface gráfica
        add(btnGerarSenha);
        add(btnChamarProximo);
        add(lblSenhaAtual);
        add(new JScrollPane(historicoList));
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Hospital(); // Inicializa a interface gráfica
    }
}