# QRCode-back

QRCode-back est une application backend développée en Java avec Spring Boot, permettant la gestion, la génération et l'authentification autour de QR Codes.

## Fonctionnalités
- Authentification JWT (connexion, inscription)
- Gestion des utilisateurs et des rôles
- Création, récupération et suppression de QR Codes
- Gestion des codes personnalisés
- API REST sécurisée

## Prérequis
- Java 17 ou supérieur
- Maven 3.6+
- Base de données compatible (H2, MySQL, etc.)

## Installation
1. Clonez le dépôt :
   ```bash
   git clone <url-du-repo>
   ```
2. Placez-vous dans le dossier du projet :
   ```bash
   cd QRCode-back
   ```
3. Configurez la base de données dans `src/main/resources/application.properties`.
4. Lancez l'application :
   ```bash
   ./mvnw spring-boot:run
   ```

## Structure du projet
- `src/main/java/com/qrcode/qrcode/` : code source principal
  - `bo/` : entités métier (User, Role, QRCode, etc.)
  - `controllers/` : contrôleurs REST
  - `repository/` : interfaces JPA
  - `security/` : configuration de la sécurité et JWT
  - `Payload/` : objets de requête/réponse
  - `Exceptions/` : gestion des exceptions personnalisées
  - `config/` : configuration Spring
- `src/main/resources/` : ressources (application.properties, scripts SQL)
- `src/test/java/` : tests unitaires

## API
L'API expose plusieurs endpoints pour l'authentification, la gestion des utilisateurs et des QR Codes. Consultez les contrôleurs dans `controllers/` pour plus de détails.

## Tests
Pour lancer les tests :
```bash
./mvnw test
```

## Auteur
- Samuel BABO
- Justin GENDRON
- Martin LEMEE

## Licence
Ce projet est sous licence MIT.
