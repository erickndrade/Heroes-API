## Projeto Heroes API-REST

Criação de uma API reativa com Spring boot, utilizando Spring WebFlux, juntamente com a biblioteca reativa Reactor e o banco de dados DynamoDB.

Nessa API, também foram incluídos testes unitários para os Endpoints Locais.

## Informações: 

- Baixe a biblioteca do DynamoBD local : [DynamoDB local](https://docs.aws.amazon.com/pt_br/amazondynamodb/latest/developerguide/DynamoDBLocal.DownloadingAndRunning.html)

- Para executar, acesses pasta de Donwload e execute:  java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb

- Listando tabelas criadas: aws dynamodb list-tables --endpoint-url http://localhost:8000

- Listagem local da doc pelo Swagger: http://localhost:8080/swagger-ui-heroes-reactive-api.html

