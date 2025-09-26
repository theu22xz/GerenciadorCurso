Gerenciador de Cursos e Equipes
Este é um sistema de gerenciamento básico desenvolvido em Java, utilizando Swing para a interface gráfica (GUI) e Maven para o gerenciamento de dependências. O projeto foi concebido para auxiliar um professor na organização de cursos de informática básica infantil, gerenciando desenvolvedores terceirizados, projetos (cursos) e equipes.

Requisitos e Funcionalidades
O sistema atende aos seguintes requisitos iniciais:

1. Cadastro de Usuários/Desenvolvedores (Usuario.java)
Permite cadastrar desenvolvedores que atuarão no projeto.

Campos: Nome Completo, CPF, E-mail, Cargo, Login, Senha.

Perfis Necessários (Requisito): Administrador da Plataforma, Gerente do Curso, Professor.

2. Cadastro de Projetos/Cursos (Projeto.java)
Permite registrar os cursos que serão desenvolvidos.

Campos: Nome do Projeto/Curso, Descrição, Data de Início, Data de Término Prevista, Status (iniciado, em andamento, concluído, cancelado).

Regra de Negócio (Requisito): Cada projeto deve ter um gerente do curso.

3. Cadastro de Equipes (Equipe.java)
Permite agrupar os usuários em equipes de trabalho.

Campos: Nome da Equipe, Descrição, Membros (usuários vinculados).

Regra de Negócio (Requisito): Uma equipe/professores pode atuar em vários projetos/cursos.

4. Exibição de Dados (Novo Recurso GUI)
Permite visualizar todos os Usuários, Projetos e Equipes cadastrados durante a sessão atual.

Estrutura e Tecnologia
O projeto foi construído com as seguintes tecnologias e estruturas:

Linguagem: Java (JDK 17 ou superior)

Gerenciador de Dependências: Maven

Interface Gráfica: Swing

Estrutura de Dados: ArrayList (para armazenamento temporário dos cadastros em memória).

Classes Principais
Classe	Descrição
Usuario.java	Modelo de dados para armazenar informações de um usuário.
Projeto.java	Modelo de dados para armazenar informações de um projeto/curso.
Equipe.java	Modelo de dados para armazenar informações de uma equipe.
GerenciadorGUI.java	Classe principal com o método main() que inicia a interface e toda a lógica de exibição, coleta e armazenamento dos dados.
