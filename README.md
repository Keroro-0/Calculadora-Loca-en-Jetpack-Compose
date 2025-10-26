# Calculadora Loca en Jetpack Compose

 **Repositorio:** https://github.com/Keroro-0/Calculadora-Loca-en-Jetpack-Compose

---

## Descripción
Este proyecto es una calculadora desarrollada en **Android con Jetpack Compose**.  
Permite realizar operaciones básicas (suma, resta, multiplicación y división)
- Todos los dígitos `5` se transforman automáticamente en `6`.  
- Los botones muestran un número, pero internamente insertan otro distinto (ver tablas más abajo).  

---

Texto mostrado en el botón	Valor que realmente inserta
1 -> 3
2 -> 4
3 -> 6
4 -> 6
0 -> 2
6 -> 8
7 -> 9
8 -> 0
9 -> 1

Símbolo mostrado	Operación real
&	Suma (+)
%	Resta (−)
@	Multiplicación (×)
#	División (÷)
=	Calcula el resultado


## ⚙️ Instrucciones de ejecución
1. **Clonar o descargar el repositorio**
   - Clonar con Git:
     ```bash
     git clone https://github.com/Keroro-0/Calculadora-Loca-en-Jetpack-Compose.git
     ```
   - O descargar el ZIP desde GitHub y descomprimirlo.

2. **Abrir el proyecto en Android Studio**
   - Abrir Android Studio
   - Seleccionar la carpeta raíz del proyecto (`ProyectoCalculadoraLoca`).

3. **Configurar SDK**
  - **Versión mínima de SDK:** 35 (Android 14).  
  - **Versión de compilación/objetivo:** 36 (Android 15).
