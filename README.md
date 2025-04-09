# 📍 ViaCEP API Lookup Service

A simple and elegant RESTful API built with Spring Boot that fetches address information from Brazilian postal codes (CEP) using the [ViaCEP API](https://viacep.com.br/).
This project was created at Microservices classes.

---

## Features

-  Fetches full address information from a valid Brazilian CEP  
-  Uses `HttpClient` (Java 11+) for external API requests  
-  Exception handling for HTTP client errors  
-  Response returned as a clean DTO  
-  Integrated H2 in-memory database for local testing  
-  Simple H2 console available at `/h2-console`

---

## 📦 Technologies Used

- Java 17+
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Jackson (JSON to POJO mapping)

---

## How to Use

### Run locally

```
git clone https://github.com/your-user/viacep-api-service.git
cd viacep-api-service
./mvnw spring-boot:run
```

The application will start on http://localhost:8080.

---

## Endpoint Example
GET /cep/{cep}

## Request:
http
GET http://localhost:8080/cep/01310930
Response:
json
{
  "cep": "01310-930",
  "logradouro": "Avenida Paulista",
  "complemento": "de 1001 ao fim - lado ímpar",
  "bairro": "Bela Vista",
  "localidade": "São Paulo",
  "uf": "SP"
}


---
## ⚠️ Error Handling
If the CEP is invalid or there's an issue with the ViaCEP API, a ClientHttpException will be thrown with a simple "Erro" message.

---
## Developer Tools
H2 Console: http://localhost:8080/h2-console

### Default Credentials:
User: sa
Password: (empty)
JDBC URL: jdbc:h2:mem:testdb

---
✨ Future Improvements
-  Input validation for CEP format
-  Custom error messages
-  Caching requests
-  Unit and integration tests
-  Docker support

---
## 💚 Author
Made with 💚 by Thiemi

