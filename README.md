# 🎓 Congreso2026FR
### Sistema de Gestión de Congreso Estudiantil

Sistema de escritorio desarrollado en Java para la administración integral de un congreso estudiantil. Permite gestionar participantes, expositores, conferencias, asistencia y reportes desde una interfaz gráfica.

El proyecto aplica los principios de la programación orientada a objetos y utiliza archivos de texto estructurados en formato CSV para el almacenamiento y persistencia de información.

---

## 📸 Vista del sistema

<!-- Agregar aquí una captura de pantalla de la interfaz principal -->

## ✨ Funcionalidades

| Módulo | Descripción |
|:---|:---|
| 👥 **Registro de estudiantes** | Registro y administración de los participantes del congreso. |
| 🎤 **Gestión de expositores** | Administración de la información de los expositores. |
| 📚 **Conferencias** | Gestión de las conferencias disponibles. |
| ✅ **Control de asistencia** | Registro y seguimiento de la asistencia de los estudiantes. |
| 📊 **Reportes** | Consulta y generación de información relacionada con el congreso. |

## 🛠️ Tecnologías utilizadas

- **Java 25 LTS:** lenguaje de programación principal.
- **Java Swing:** desarrollo de la interfaz gráfica.
- **Apache NetBeans:** entorno de desarrollo y diseñador de interfaces.
- **Apache Maven:** gestión y configuración del proyecto.
- **CSV:** almacenamiento de información mediante archivos de texto.
- **Git y GitHub:** control de versiones y alojamiento del código fuente.

## 📂 Estructura del proyecto

```text
Congreso2026FR/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── umg/congreso2026fr/
│   │           ├── Conferencia.java
│   │           ├── Estudiante.java
│   │           ├── Expositor.java
│   │           │
│   │           ├── MenuCongreso.java
│   │           ├── MenuCongreso.form
│   │           │
│   │           ├── PanelAsistencia.java
│   │           ├── PanelConferencias.java
│   │           ├── PanelExpositores.java
│   │           ├── PanelRegistro.java
│   │           ├── PanelReporte.java
│   │           │
│   │           └── Pruebas.java
│   │
│   └── test/
│
├── temp/
│   ├── Conferencias.txt
│   ├── Estudiantes.txt
│   └── Expositores.txt
│
├── pom.xml
└── README.md
```

### Organización del código

- **Modelos:** las clases `Estudiante`, `Expositor` y `Conferencia` representan las principales entidades del sistema.
- **Menú principal:** `MenuCongreso` centraliza la navegación y constituye el punto de entrada de la aplicación.
- **Paneles:** cada panel contiene la interfaz y las funcionalidades correspondientes a un módulo específico.
- **Archivos `.form`:** contienen los diseños visuales de los formularios creados mediante NetBeans GUI Builder.
- **Carpeta `temp`:** almacena los archivos de texto utilizados para conservar los registros.

## 💾 Almacenamiento de información

El sistema implementa persistencia de datos mediante archivos de texto con estructura CSV (Comma-Separated Values).

Los registros se organizan en archivos independientes:

| Archivo | Contenido |
|:---|:---|
| `Estudiantes.txt` | Información de los estudiantes registrados. |
| `Expositores.txt` | Información de los expositores. |
| `Conferencias.txt` | Información de las conferencias. |

La aplicación se encarga de leer, procesar y actualizar estos archivos, permitiendo conservar la información entre diferentes ejecuciones.

## ⚙️ Requisitos del sistema

Para trabajar con el proyecto se necesita:

- Java Development Kit (JDK) 25.
- Apache NetBeans.
- Apache Maven.

## 🚀 Instalación y ejecución

**1. Clonar el repositorio**

```bash
git clone <URL_DEL_REPOSITORIO>
```

**2. Abrir el proyecto**

Desde Apache NetBeans, seleccionar:

`File → Open Project`

Localizar y abrir la carpeta `Congreso2026FR`.

**3. Verificar la configuración**

Comprobar que Maven reconoce correctamente el proyecto y que se encuentra configurado el JDK 25.

**4. Ejecutar la aplicación**

Ejecutar la clase principal:

```text
umg.congreso2026fr.MenuCongreso
```

También puede ejecutarse directamente desde NetBeans utilizando la configuración del proyecto.

> **Importante:** La carpeta `temp` y sus archivos deben mantenerse en la ubicación esperada por la aplicación para garantizar el correcto funcionamiento de la lectura y escritura de información.

## 🎯 Objetivo académico

Este proyecto busca poner en práctica los conocimientos adquiridos en Ingeniería en Sistemas, especialmente en:

- Programación orientada a objetos.
- Diseño y organización de clases.
- Desarrollo de interfaces gráficas con Java Swing.
- Arquitectura modular de aplicaciones.
- Manipulación de archivos y persistencia de datos.
- Lectura, escritura y procesamiento de registros.
- Validación y administración de información.

## 👨‍💻 Autor

**Fernando Isaac Reynoso Candelero**

Estudiante de Ingeniería en Sistemas.

Proyecto desarrollado con fines académicos.

---

<p align="center">
  <b>Congreso2026FR</b><br>
  Sistema de Gestión de Congreso Estudiantil
</p>