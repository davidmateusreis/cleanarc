<h1 align="center">
  Spring Boot Clean Architecture
</h1>

A demo foi apresentada [nesse vídeo](https://www.youtube.com/watch?v=hit0XHGt4WI) e mostra como implementar a arquitetura limpa com Spring Boot.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)

## Como Executar

- Clonar repositório git:
```
git clone https://github.com/davidmateusreis/cleanarc.git
```
- Construir o projeto:
```
./mvnw clean package
```
- Executar:
```
java -jar ./target/cleanarch-0.0.1-SNAPSHOT.jar
```
A ferramenta utilizada nos testes foi o [httpie](https://httpie.io):

- Criar usuário
```
$ http POST :8080/users username=david password=123456 email=david@email.com

HTTP/1.1 200
Connection: keep-alive
Content-Type: application/json
Date: Tue, 29 Aug 2023 10:16:35 GMT
Keep-Alive: timeout=60
Transfer-Encoding: chunked

{
    "email": "david@email.com",
    "username": "david"
}
```