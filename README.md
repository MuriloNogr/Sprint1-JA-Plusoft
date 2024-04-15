ARGOS AI
Nossa solução é um software que usa inteligência artificial para monitorar e analisar as movimentações financeiras da empresa, identificando riscos e tendências de falência.

Ele emite alertas para a equipe responsável, que pode tomar medidas preventivas para evitar perdas financeiras e garantir a continuidade do negócio.

Além disso, nosso software fornece relatórios com informações valiosas para a tomada de decisões estratégicas.

Vídeo:
https://youtu.be/1yZ4cigPU2A?si=ltE3lBnqUVLI186

Nossa Equipe: 
550531 - Luis Fernando Menezes Zampar: Disruptives Architectures (IOT, IOB & AI) | Compliance, Quality Assurance & Tests

551694 - Diogo Fagioli Bombonatti: DevOps Tools & Cloud Computing

89162 - Murilo Nogueira: JAVA Advanced | Mobile Aplication Development

550711 - Gabriel Galdino da Silva: Relational and Non-relational Databases | .NET

SPRINT 1:

Visão Geral
Durante esta primeira sprint de desenvolvimento em JAVA, priorizamos a implementação do backend responsável pelo cadastro de empresas em nossa aplicação. Planejamos que esta aplicação, em fases posteriores, integrará funcionalidades de inteligência artificial para análise de riscos e consultoria especializada às empresas.

O projeto ChallengeJA é uma aplicação web desenvolvida utilizando o framework Spring Boot. Ele fornece funcionalidades para cadastrar e listar empresas, utilizando um banco de dados para armazenar e recuperar as informações.

Estrutura do Projeto
O projeto está estruturado da seguinte forma:

Controller: Contém as classes responsáveis por receber as requisições HTTP, processar as informações recebidas e retornar as respostas adequadas. Os controllers existentes são:

EmpresaController: Responsável por lidar com as requisições relacionadas às operações de cadastro e listagem de empresas.
HomeController: Responsável por lidar com as requisições relacionadas à página inicial da aplicação.
Model: Contém as classes que representam as entidades do domínio da aplicação. Neste projeto, temos a classe Empresa, que representa uma empresa.

Repository: Contém as interfaces responsáveis pela comunicação com o banco de dados. Neste projeto, temos o EmpresaRepository, que estende a interface JpaRepository do Spring Data JPA para fornecer métodos para salvar e recuperar empresas do banco de dados.

View (Templates Thymeleaf): Contém os templates HTML utilizados para renderizar as páginas da aplicação. Os templates disponíveis são:

cadastrar_empresas.html: Formulário para cadastrar uma nova empresa.
listar_empresas.html: Página para listar todas as empresas cadastradas.
Funcionalidades Principais
Cadastro de Empresas: Através da página cadastrar_empresas.html, o usuário pode preencher um formulário com o nome e a descrição de uma nova empresa e enviar os dados para serem cadastrados no banco de dados.

Listagem de Empresas: A página listar_empresas.html exibe uma lista com todas as empresas cadastradas no banco de dados. As informações são recuperadas do banco de dados através do EmpresaRepository e passadas para o template Thymeleaf para serem renderizadas na página.

Testando os Endpoints
Os endpoints podem ser testados utilizando ferramentas como o Insomnia ou o Postman. Abaixo estão os endpoints disponíveis na aplicação:

GET /empresas/listar: Retorna a página de listagem de empresas.
GET /empresas/cadastrar: Retorna a página de cadastro de empresas.
POST /empresas/cadastrar: Recebe os dados de uma nova empresa e os cadastra no banco de dados.
Executando o Projeto
Para executar o projeto localmente, siga os seguintes passos:

Certifique-se de ter o Java JDK instalado na sua máquina.
Clone o repositório do projeto para o seu ambiente de desenvolvimento.
Abra o projeto na sua IDE de preferência.
Configure as dependências do projeto utilizando o Maven.
Execute a aplicação Spring Boot.
Após seguir esses passos, a aplicação estará rodando localmente e você poderá acessá-la através do navegador web (http://localhost:8080) ou testá-la utilizando uma ferramenta de teste de API como o Insomnia ou o Postman.

Conclusão
A documentação acima fornece uma visão geral do projeto ChallengeJA, descrevendo sua estrutura, funcionalidades principais e como testar os endpoints. Com essa documentação, os desenvolvedores podem entender melhor o funcionamento da aplicação e começar a contribuir para o seu desenvolvimento.

Endpoints:
http://localhost:8080 (Home)
http://localhost:8080/empresas/listar
http://localhost:8080/empresas/cadastrar

Diagrama UML:

![Diagrama UML](https://github.com/MuriloNogr/Sprint1-JA-Plusoft/blob/main/Sprint1UML.jpg)

Modelo do Banco de Dados:

![Modelo do banco de dados](https://github.com/MuriloNogr/Sprint1-JA-Plusoft/blob/main/Relational_1.pdf.png?raw=true)

Artefatos utilizados: 

spring-boot-starter-thymeleaf: Fornece suporte ao Thymeleaf, um mecanismo de template para construir interfaces de usuário baseadas em HTML5.

spring-boot-starter-data-jpa: Inicia o suporte do Spring Data JPA, que facilita o acesso a bancos de dados relacionais com Java Persistence API (JPA).

spring-boot-starter-data-jdbc: Fornece suporte para acessar bancos de dados relacionais usando JDBC (Java Database Connectivity).

spring-boot-starter-data-rest: Fornece suporte para criar APIs RESTful baseadas em repositórios Spring Data.

spring-boot-starter-web: Inicia o suporte básico para desenvolvimento de aplicativos da web com Spring Boot, incluindo o Spring MVC.

spring-boot-starter-webflux: Inicia o suporte básico para desenvolvimento de aplicativos reativos usando Spring WebFlux.

ojdbc8: Driver JDBC para Oracle Database versão 8, permitindo acesso a um banco de dados Oracle.

spring-boot-starter-test: Fornece suporte para testes unitários e de integração em aplicativos Spring Boot.

reactor-test: Fornece suporte para testes em aplicativos reativos usando o Reactor.

hibernate-core: Hibernate é um framework ORM (Object-Relational Mapping) para mapear objetos Java para bancos de dados relacionais.

validation-api: API de validação do Bean Validation para validar objetos Java e definir restrições de validação.

javax.persistence-api: API Java Persistence (JPA) para persistência de dados em aplicativos Java EE e Java SE.
