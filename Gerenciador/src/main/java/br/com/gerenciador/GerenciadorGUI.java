package br.com.gerenciador;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;


public class GerenciadorGUI {
    
    private static ArrayList<Usuario> listaUsuario = new ArrayList<>();
    private static ArrayList<Projeto> listaProjetos = new ArrayList<>();
    private static ArrayList<Equipe> listaEquipe = new ArrayList<>();
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarEExibirGUI();
        });
    }

    private static void criarEExibirGUI() {
        JFrame frame = new JFrame("Gerenciador de Projetos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Centraliza a janela

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Escolha o tipo de cadastro", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        painelPrincipal.add(titulo, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new GridLayout(4, 1, 10, 10)); // 3 linhas, 1 coluna
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        JButton btnUsuario = new JButton("1 - Cadastro de Usuário");
        JButton btnProjeto = new JButton("2 - Cadastro de Projeto");
        JButton btnEquipe = new JButton("3 - Cadastro de Equipe");
        JButton btnExibir = new JButton("4 - Exibir Cadastros");
        
        painelBotoes.add(btnUsuario);
        painelBotoes.add(btnProjeto);
        painelBotoes.add(btnEquipe);
        painelBotoes.add(btnExibir);

        painelPrincipal.add(painelBotoes, BorderLayout.CENTER);
        frame.setContentPane(painelPrincipal);
        frame.setVisible(true);

        
        btnUsuario.addActionListener(e -> exibirCadastroUsuario());
        btnProjeto.addActionListener(e -> exibirCadastroProjeto());
        btnEquipe.addActionListener(e -> exibirCadastroEquipe());
        btnExibir.addActionListener(e -> exibirDadosCadastrados());
    }

    
    private static void exibirCadastroUsuario() {
        JFrame frame = new JFrame("Cadastro de Usuário");
        frame.setSize(400, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela

        JPanel painel1 = new JPanel();
        painel1.setLayout (new GridLayout(0, 2, 5, 5));
        painel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField nomeField = new JTextField();
        JTextField cpfField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField cargoField = new JTextField();
        JTextField loginField = new JTextField();
        JPasswordField senhaField = new JPasswordField();
        
        painel1.add(new JLabel("Nome completo:"));
        painel1.add(nomeField);
        painel1.add(new JLabel("CPF:"));
        painel1.add(cpfField);
        painel1.add(new JLabel("E-mail:"));
        painel1.add(emailField);
        painel1.add(new JLabel("Cargo:"));
        painel1.add(cargoField);
        painel1.add(new JLabel("Login:"));
        painel1.add(loginField);
        painel1.add(new JLabel("Senha:"));
        painel1.add(senhaField);

        JButton btnSalvar = new JButton("Salvar Usuário");
        JPanel painelBotoes = new JPanel(); 
        painelBotoes.add(btnSalvar);

        frame.setLayout(new BorderLayout()); 
        frame.add(painel1, BorderLayout.CENTER);
        frame.add(painelBotoes, BorderLayout.SOUTH);


    frame.setVisible(true);


        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nome = nomeField.getText();
                String cpf = cpfField.getText();
                String email = emailField.getText();
                String cargo = cargoField.getText();
                String login = loginField.getText();
                String senha = new String(senhaField.getPassword());
                
                
                
                Usuario novoUsuario = new Usuario(nome, cpf, email, cargo, login, senha);
                listaUsuario.add(novoUsuario);
                
                JOptionPane.showMessageDialog(frame, "Usuário cadastrado com sucesso!");
                JOptionPane.showMessageDialog(frame, novoUsuario.toString());
                
                frame.dispose(); 
            }
        });

        frame.add(painel1);
        frame.setVisible(true);
    }

    private static void exibirCadastroProjeto() {
        JFrame frame = new JFrame("Cadastro de Projeto");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel2 = new JPanel();
        painel2.setLayout(new GridLayout(0, 2, 5, 5));
        painel2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField nomeProjetoField = new JTextField();
        JTextArea descricaoArea = new JTextArea(10, 30);
        descricaoArea.setLineWrap(true);
        descricaoArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(descricaoArea);
        
        
        
        JTextField dataInicialField = new JTextField();
        JTextField dataFinalField = new JTextField();
        JTextField statusField = new JTextField();

        painel2.add(new JLabel("Nome do Projeto:"));
        painel2.add(nomeProjetoField);
        painel2.add(new JLabel("Descrição:"));
        painel2.add(scrollPane); // Usa JScrollPane para a área de texto
        painel2.add(new JLabel("Data de Início (DD/MM/AAAA):"));
        painel2.add(dataInicialField);
        painel2.add(new JLabel("Data de Término (DD/MM/AAAA):"));
        painel2.add(dataFinalField);
        painel2.add(new JLabel("Status:"));
        painel2.add(statusField);
        
        JButton btnSalvar = new JButton("Salvar Projeto");
        JPanel painelBotoes = new JPanel(); 
        painelBotoes.add(btnSalvar);

        // Agora, use o BorderLayout no frame para adicionar os painéis
        frame.setLayout(new BorderLayout()); 
        frame.add(painel2, BorderLayout.CENTER);
        frame.add(painelBotoes, BorderLayout.SOUTH);
        
        btnSalvar.addActionListener(e -> {
            String nomeProjeto = nomeProjetoField.getText();
            String descricao = descricaoArea.getText();
            String dataInicial = dataInicialField.getText();
            String dataFinal = dataFinalField.getText();
            String status = statusField.getText();

            Projeto novoProjeto = new Projeto(nomeProjeto, descricao, dataInicial, dataFinal, status);
            listaProjetos.add(novoProjeto);
            JOptionPane.showMessageDialog(frame, "Projeto cadastrado com sucesso!");
            JOptionPane.showMessageDialog(frame, novoProjeto.toString());
            frame.dispose();
        });

        frame.setVisible(true);
    }
    
    private static void exibirCadastroEquipe() {
        JFrame frame = new JFrame("Cadastro de Equipe");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel3 = new JPanel();
        painel3.setLayout (new GridLayout(0, 2, 5, 5));
        painel3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField nomeEquipeField = new JTextField();
        
        JTextArea descricaoArea = new JTextArea(10, 30);
        descricaoArea.setLineWrap(true);
        descricaoArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(descricaoArea);
        
        JTextArea membrosArea = new JTextArea(10, 30);
        membrosArea.setLineWrap(true);
        membrosArea.setWrapStyleWord(true);
        JScrollPane scrollPane1 = new JScrollPane(membrosArea);

        painel3.add(new JLabel("Nome da Equipe:"));
        painel3.add(nomeEquipeField);
        painel3.add(new JLabel("Descrição:"));
        painel3.add(new JScrollPane(descricaoArea));
        painel3.add(new JLabel("Membros (nomes separados por vírgula):"));
        painel3.add(new JScrollPane(membrosArea));
        
        JButton btnSalvar = new JButton("Salvar Equipe");
        JPanel painelBotoes = new JPanel(); 
        painelBotoes.add(btnSalvar);
        frame.setLayout(new BorderLayout()); 
        frame.add(painel3, BorderLayout.CENTER);
        frame.add(painelBotoes, BorderLayout.SOUTH);

        btnSalvar.addActionListener(e -> {
            String nomeEquipe = nomeEquipeField.getText();
            String descricao = descricaoArea.getText();
            String membros = membrosArea.getText();
                  

            Equipe novaEquipe = new Equipe(nomeEquipe, descricao, membros);
            listaEquipe.add(novaEquipe);           
            JOptionPane.showMessageDialog(frame, "Equipe cadastrada com sucesso!");
            JOptionPane.showMessageDialog(frame, novaEquipe.toString());
            frame.dispose();
        });

        frame.setVisible(true);
    }
    
    private static void exibirDadosCadastrados (){
    
    JFrame frameDados = new JFrame("Dados Cadastrados");
    frameDados.setSize(500, 600);
    frameDados.setLocationRelativeTo(null);
    frameDados.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    JTextArea areaTexto = new JTextArea();
    areaTexto.setEditable(false);
    areaTexto.setLineWrap(true);
    areaTexto.setWrapStyleWord(true);
    
    JScrollPane scrollPane = new JScrollPane(areaTexto);
    
    StringBuilder sb = new StringBuilder();
    
    sb.append("Usuario cadastrados\n");
        if (listaUsuario.isEmpty()) {
            sb.append("Nenhum Usuário Cadastrado" + "\n" + 
                    "Efetue o Cadastro de um Usuário na tela inicial");    
        }else{
            for (Usuario u : listaUsuario){
                sb.append(u.toString()).append("\n");
            }
                
        }
        
            
    sb.append("\n\nProjetos Cadastrados\n\n");
    if (listaProjetos.isEmpty()) {
        sb.append("Nenhum Projeto cadastrado" + "\n"+ 
                "Efetue o Cadastro de um Projeto na tela inicial");
    } else {
        for (Projeto p : listaProjetos) {
            sb.append(p.toString()).append("\n");
        }
    }

    sb.append("\n\nEquipes Cadastradas\n\n");
    if (listaEquipe.isEmpty()) {
        sb.append("Nenhuma equipe cadastrada" + "\n"+ 
                "Efetue o Cadastro de uma Equipe na tela inicial");
    } else {
        for (Equipe eq : listaEquipe) {
            sb.append(eq.toString()).append("\n");
        }
    }
    
    areaTexto.setText(sb.toString());

    frameDados.add(scrollPane);
    frameDados.setVisible(true);
        }
       
}