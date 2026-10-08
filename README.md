# Test-Dokuman

Staj döneminde (Ağustos 2025) yapılmış, [Deneme](https://github.com/Hazallul/Deneme) reposunun kopyası olan CI/CD deneme projesi. Muhtemelen bu akışın nasıl kurulduğunu dokümante etmek / tekrar denemek için açılmış.

## Ne var?

- **Basit bir Spring Boot uygulaması** (Java 17, Maven):
  - `GET /Deneme/Merhaba` → `"SelammDökümanTestSon"` döner
  - `POST /Deneme/Test` → gönderilen metni `"Geri Mesaj: "` ile başına ekleyip geri döner
- **Dockerfile**: Uygulamayı Docker imajına paketler.
- **GitHub Actions** (`.github/workflows/ci-cd.yaml`): `main`'e push'ta derler, imajı Docker Hub'a `hazallul/spring-boot-app-test` adıyla gönderir ve `Deployment.yaml` içindeki `restartedAt` tarihini güncelleyip geri commit'ler.
- **Deployment.yaml**: Kubernetes Deployment + NodePort Service.

## Deneme'den farkı

Sadece imaj adı (`spring-boot-app-test`), push edilen repo adresi ve `/Merhaba` cevabı farklı. Gerisi aynı.
