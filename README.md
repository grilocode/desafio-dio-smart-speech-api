# Desafio DIO - Smart Speech API

## Sobre o projeto

Este projeto foi desenvolvido durante o desafio de Spring AI da DIO.

A aplicação permite cadastrar e consultar transações financeiras utilizando recursos de Inteligência Artificial. O sistema recebe um áudio enviado pelo usuário, converte esse áudio em texto, interpreta o comando utilizando IA e executa ações reais dentro da aplicação.

## Tecnologias utilizadas

* Java
* Spring Boot
* Spring AI
* Spring Data JPA
* MySQL
* OpenAI
* Gradle

## Melhorias implementadas

Durante o desafio, implementei duas melhorias no projeto original:

### Validação de transações

Adicionei validações para evitar o cadastro de transações inválidas.

Regras adicionadas:

* A descrição não pode estar vazia.
* O valor da transação deve ser maior que zero.

### Consulta de saldo

Foi criado um novo endpoint para consultar o saldo total das transações cadastradas.

Endpoint:

```http
GET /transactions/balance
```

Esse endpoint soma todos os valores armazenados e retorna o saldo atual.

## Como executar

1. Clonar o repositório.
2. Configurar a variável `OPENAI_API_KEY`.
3. Configurar o banco de dados MySQL.
4. Executar a aplicação com:

```bash
./gradlew bootRun
```

## Testando a aplicação

Cadastrar transação:

```http
POST /transactions
```

Consultar por categoria:

```http
GET /transactions/GROCERIES
```

Consultar saldo:

```http
GET /transactions/balance
```

Processar áudio:

```http
POST /transactions/ai
```

## O que aprendi

Com esse projeto consegui ter um primeiro contato com:

* Spring AI
* Tool Calling
* APIs REST
* Spring Data JPA
* Integração com OpenAI
* Organização de projetos em camadas

Além disso, pratiquei a criação de regras de negócio e a implementação de novos endpoints em uma aplicação Spring Boot.
