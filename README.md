# 📞 Projeto API Spring Boot - Contatos

Este é um projeto simples de API REST desenvolvido com **Spring Boot** para gerenciar contatos.

## 🚀 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (banco de dados em memória para testes)
- **Maven**

## 📂 Estrutura do Projeto
```
api-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── config/        # Configurações adicionais
│   │   │   ├── controller/    # Controladores REST
│   │   │   ├── model/         # Modelos de dados (Entidades)
│   │   │   ├── repository/    # Repositórios JPA
│   │   │   ├── service/       # Regras de negócio
│   ├── resources/
│   │   ├── application.properties  # Configurações da aplicação
├── pom.xml  # Configuração do Maven
└── README.md
```

## ⚙️ Configuração e Execução

### 1️⃣ Clonar o Repositório
```bash
git clone https://github.com/migueelfr/Spring-Java.git
cd Spring-Java
```

### 2️⃣ Configurar as Dependências
```bash
mvn clean install
```

### 3️⃣ Executar o Projeto
```bash
mvn spring-boot:run
```

A aplicação estará disponível em: **http://localhost:8080**

## 📌 Endpoints da API
| Método | Endpoint       | Descrição |
|--------|--------------|-------------|
| GET    | /contatos    | Lista todos os contatos |
| POST   | /contatos    | Adiciona um novo contato |
| GET    | /contatos/{id} | Busca um contato por ID |
| PUT    | /contatos/{id} | Atualiza um contato |
| DELETE | /contatos/{id} | Remove um contato |

## 🛠 Contribuição
1. Fork o repositório
2. Crie uma branch: `git checkout -b minha-feature`
3. Faça as alterações e commit: `git commit -m 'Minha nova feature'`
4. Push para a branch: `git push origin minha-feature`
5. Abra um Pull Request

