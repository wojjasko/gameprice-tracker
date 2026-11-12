# GamePrice Tracker

Aplikacja backendowa w Spring Boot do śledzenia i wyszukiwania cen gier w różnych sklepach cyfrowych (integracja z API CheapShark).

## Technologie

* **Java 23** & **Spring Boot 4** (Spring Web, Spring Data JPA, Actuator)
* **PostgreSQL 16** (uruchamiany w kontenerze **Docker**)
* **Flyway** (zarządzanie migracjami bazy danych)
* **RestClient** (komunikacja z zewnętrznym REST API)
* **Maven** & **Lombok**

## Uruchomienie lokalne

1. **Uruchom bazę danych w Dockerze:**
   ```bash
   docker compose up -d
