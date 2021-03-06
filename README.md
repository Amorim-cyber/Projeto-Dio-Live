# Projeto Live DIO :rocket:

> Este repositório contém a evolução do projeto disponibilizado pela Digital Innovation One que elabora um sistema de controle de ponto e acesso com Spring Boot. Ao longo dos próximos dias irei commitar minha jornada na elaboração deste projeto.
>
> A ideia é aprender ao máximo com os conceitos aplicados no projeto :muscle:
>
> Agradeço a todos por essa oportunidade! :smile:

#### Trilha:

<p style="background-color: lightsalmon; border-radius: 3px;">
<strong>PRIMEIRO COMMIT</strong><br><br>
<strong>Parte 1:</strong><br>
Criando o arquivo, instalando as dependencias e configuração do projeto.<br><br><strong>Parte 2:</strong><br>
 Foi criado a classe satélite "JornadaTrabalho" e aprendi um pouco mais sobre o uso do lombok.<br>
<br><strong>Parte 3:</strong><br>
Foram criadas as classes satélites "CategoriaUsuario","Empresa","NivelAcesso" e "Localidade".<br>
<br><strong>Parte 4:</strong><br>
 Foi criada a classe "Usuario", aprendi um pouco sobre relacionamento entre classes utilizando a notação @OneToMany.<br><br>
</p>


<p style="background-color: lightyellow; border-radius: 3px;">
<strong>SEGUNDO COMMIT</strong><br><br>
<strong>Parte 5:</strong><br>
Atribuindo mais relacionamentos e criação das classes satélites "Ocorrencia", "TipoData" e "Calendario".
<br><br><strong>Parte 6:</strong><br>
Criado a classe "Movimentacao", aprendi o uso das anotações @Embeddable e @EmbeddedId para casos de chaves compostas.<br>
<br><strong>Parte 7:</strong><br>
Criado a classe "BancoHoras" e primeira tentativa de execução do programa.<br>
<br><strong>Parte 8:</strong><br>
 As classes foram conectadas para dentro do banco H2 como entidades, aprendi sobre a importância das anotações @Id e @Entity.<br>
<br><strong>Parte 9:</strong><br>
Criamos um controller, um repository e um service para a classe "JornadaTrabalho".<br>
<br><strong>Parte 10:</strong><br>
Desenvolvemos um pouco mais os componentes controller, repository e services de "JornadaTrabalho" adicionando um metodo post à classe.
<br><br>
</p>


<p style="background-color: lightgreen; border-radius: 3px;">
<strong>TERCEIRO COMMIT</strong><br><br>
<strong>Parte 11:</strong><br>
Foi introduzido os metodos GET findAll e findByID na classe "JornadaTrabalho" passando as anotações parametros @RequestBody e @PathVariable além de aprender um pouco mais sobre tratamento de exceção com a classe ResponseEntity.
<br><br><strong>Parte 12:</strong><br>
Foi introduzidos o metodo PUT e DELETE para a classe "JornadaTrabalho".<br>
<br><strong>Parte 13:</strong><br>
Realizado a configuração do Swagger no projeto.<br>
<br><strong>Parte 14:</strong><br>
Realizando uns testes dos metodos API da classe "JornadaTrabalho" no postman, aprendi um pouco mais sobre a anotação @GeneretedValue.<br>
<br><strong>Parte 15:</strong><br>
Aprendi o uso da notação @Audited e da configuração spring.jpa.show-sql = true para visualizar os comandos sql.<br>
<br><strong>Parte 16:</strong><br>
Subindo o projeto no Swagger. Coloquei os metodos do CRUD nas demais classes.
<br><br>
</p>



> :exclamation: TERMINADO ESTA ETAPA DO PROJETO :exclamation:
