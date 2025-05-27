# 💱 Money Conversor - Challenge ONE

Este proyecto es parte del Challenge del programa **Oracle Next Education - Alura Latam**. Se trata de una aplicación Java que permite convertir valores entre diferentes monedas utilizando la **ExchangeRate API**.

## 📌 Descripción

La aplicación se conecta a una API pública de tipo de cambio y permite al usuario obtener tasas de conversión de monedas en tiempo real. Actualmente, está implementado con una interfaz de consola simple, pero se puede extender a una interfaz gráfica (Swing o JavaFX).

## 🚀 Características

- Conexión a la API de ExchangeRate con clave propia.
- Conversión de valores desde una moneda base (por defecto: USD) a otra (por ejemplo, CLP).
- Uso de la librería Gson para parsear JSON.
- Estructura modular con clases separadas para lógica y API.

## 🧪 Ejemplo de uso

```bash
Conversor de Moneda
Ingrese cantidad en USD: 100
Equivale a: 91520.0 CLP
