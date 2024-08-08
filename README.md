### Descrição do Projeto: Web Services com Spring Boot e JPA/Hibernate

Este projeto tem como objetivo o desenvolvimento de um sistema de gerenciamento de pedidos utilizando **Spring Boot** com **JPA/Hibernate** para o mapeamento objeto-relacional e **H2** como banco de dados de teste. O sistema simula um e-commerce básico, onde é possível gerenciar produtos, categorias, usuários, pedidos e pagamentos.

#### **Objetivos e Funcionalidades**
- **Criar o Projeto com Spring Boot**: Configuração inicial utilizando o Spring Initializr com as dependências essenciais (Spring Web, JPA, H2).
- **Implementação do Modelo de Domínio**: Criação das entidades `User`, `Order`, `Product`, `Category`, `OrderItem`, `Payment` e o enum `OrderStatus`, conforme o modelo de domínio fornecido.
- **Estruturação das Camadas Lógicas**: Divisão do projeto em camadas de resource (controladores REST), service (lógica de negócios), e repository (acesso ao banco de dados).
- **Configuração do Banco de Dados de Teste**: Uso do banco H2 em ambiente de teste, com configuração para persistir dados na memória durante a execução dos testes.
- **CRUD Completo**: Implementação das operações de CRUD (Create, Retrieve, Update, Delete) para as entidades do sistema, possibilitando a manipulação dos dados através de APIs RESTful.
- **Tratamento de Exceções**: Desenvolvimento de mecanismos de tratamento de exceções para fornecer respostas claras e consistentes em caso de erros durante as operações.

#### **Camadas do Sistema**

1. **Entidades e Relacionamentos**:
   - **User**: Representa os usuários do sistema, contendo informações básicas como nome, email, telefone e senha.
   - **Order**: Representa um pedido feito por um usuário, armazenando a data do pedido, status (aguardando pagamento, pago, enviado, entregue, cancelado) e o valor total.
   - **Product**: Define os produtos disponíveis para compra, com nome, descrição, preço e imagem.
   - **Category**: Classificação dos produtos, podendo um produto pertencer a várias categorias.
   - **OrderItem**: Representa os itens de um pedido, relacionando um produto ao pedido, com quantidade e preço.
   - **Payment**: Registra o pagamento de um pedido, com data e identificação única.

2. **Banco de Dados e Configurações**:
   - Utilização do banco de dados H2 para testes locais, com perfil de configuração específico para este ambiente.
   - Scripts de seed para popular o banco de dados com dados iniciais de usuários, produtos, categorias e pedidos.

3. **Operações CRUD**:
   - **User**: API REST para criação, atualização, deleção e consulta de usuários.
   - **Order**: API REST para criação e consulta de pedidos.
   - **Product** e **Category**: APIs REST para manipulação dos produtos e suas categorias.

4. **Serviços e Repositórios**:
   - Implementação da camada de serviços para encapsular a lógica de negócios e interagir com a camada de repositório, que faz o mapeamento das entidades JPA e executa as operações de persistência.

#### **Deploy e Ambiente de Produção**
- **Deploy no Heroku**: O projeto está configurado para deploy na plataforma Heroku, utilizando PostgreSQL como banco de dados em produção.
- **Configurações de Perfil**: Criação de perfis diferentes para desenvolvimento, teste e produção, com propriedades específicas em cada ambiente.
- **Autenticação JWT**: Implementação de segurança utilizando tokens JWT para proteger as APIs do sistema.

Este projeto é uma base robusta para sistemas de e-commerce e pode ser expandido para incluir funcionalidades mais avançadas, como carrinhos de compras, integração com gateways de pagamento e dashboards de administração.
