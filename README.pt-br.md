# Desafio: API para empréstimos

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/joão-santos-1115a5304/)
![GPL License](https://img.shields.io/badge/License-GPL-blue) [![LinkedIn](https://img.shields.io/badge/Type-Challenge-purple)](https://github.com/backend-br/desafios/blob/master/points-of-interest/PROBLEM.md)

Essa é a minha solução para o desafio backend **API para empréstimos**. Acesse o [desafio](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md) para obter mais informações do problema.  

## Tabela de conteúdos

- [Introdução](#introdução)
- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Iniciando](#iniciando)
- [Endpoints](#endpoints)
- [Contribuições](#contribuições)
- [Contato](#contato)

## Introdução

O desafio consiste em implementar um serviço que determine quais modalidades de empréstimo uma pessoa tem acesso.

## Funcionalidades

- Método POST para informações da pessoa.
- Visualização das modalidades de empréstimo.

## Tecnologias

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Linguagem de programação.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework usado para a construção de aplicações voltadas à produção.

## Iniciando

Siga esses passos para executar o projeto na sua máquina:

1. Clone o repositório: `git clone https://github.com/gabrieudev/loans.git`
2. Navegue para o diretório do projeto: `cd <caminho>`
3. Construa a aplicação: `./mvnw clean install` (para Windows: `mvnw.cmd clean install`)
4. Execute a aplicação: `./mvnw spring-boot:run` (para Windows: `mvnw.cmd spring-boot:run`)

## Endpoints

- `POST /customer-loans`: Registra informações da pessoa e recebe as modalidades de empréstimo no corpo da resposta.

Acesse a documentação completa no endpoint `/swagger-ui.html`

## Contribuições

Contribuições são muito bem vindas! Caso queira contribuir, faça um fork do repositório e crie um pull request.

## Contato

Caso tenha alguma sugestão ou dúvida, entre em contato comigo em [LinkedIn](https://www.linkedin.com/in/joão-santos-1115a5304/)

---

**Licença:** Esse projeto é licenciado sob os termos da [GNU General Public License (GPL)](LICENSE).
