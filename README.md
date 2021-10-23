# INFORMAÇÕES DO PROJETO

**COMO RODAR EM LOCAL HOST:** 

É preciso criar um servidor local com as seguintes informações:

**Password:** _123456_  
**Auto:** _update_  
**Url:** _jdbc:postgresql://localhost:5432/postgres_  
**Username:** _postgres_  
**Database:** _POSTGRESQL_  




**DESCRIÇÃO DO PROJETO:**  


O projeto foi construido em 3 pacotes diferentes, onde:  

O pacote "molds" possui a classe AgendaTelefone, que irá conter os métodos Get e Set. Além destes métodos, esta classe também conta com dois construtores em sobrecarga, onde o primeiro vai ser um construtor vazio e o outro irá retornar os atributos da classe.

O pacote "repository" vai ser um repositório da entidade agenda. Ela é uma interface que estende uma classe chamada JpaRository, e dentro foi passado os argumentos da entidade e também do tipo de id. Achei importante estender esta classe “Jpa” pois ele já contém diversos métodos prontos para fazer a persistência no banco de dados.  




Bem vindo visitante! :technologist:
