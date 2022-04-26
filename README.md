# Prueba Técnica (Desarrollador Junior)

## ⚙️ Requirements   

- [✅] Ordenador, cámara, micrófono.

- [✅] Git instalado y saber manejarlo.

- [✅] Cuenta en GitHub y saber hacer un fork y pull requests.

- [✅] Intellij instalado con un jdk, el 11 esta bien. Puedes utilizar el IDE que prefieras y que sueles utilizar habitualmente para programar en Java: Netbeans, Eclipse, etc. Si no utilizas Intellij, igual tienes que adaptar el proyecto a tu IDE. 

- [✅] Desactiva si tienes algún complemento como Github Copilot.   

- [✅] Ten preparado Google o Stackoverflow, te dejaremos navegar por internet, con la condición que nos enseñes en la llamada por Teams cómo buscar, qué buscas o si vas directamente a por la solución. Te recomendamos no ir a por la solución directamente en la búsqueda.   

- [✅] Nos podrás compartir la pantalla para enseñarnos los proyectos que has hecho hasta el momento, si tienes.  



## 🙌 Hands on!
1. Accede a este repo: [https://github.com/adrianpisabarrogarcia/prueba-tecnica](https://github.com/adrianpisabarrogarcia/prueba-tecnica)
2. Haz un fork del repositorio
3. Descarga el proyecto con Git.
4. Abrelo con tu ide
5. Comienza el ejercicio
6. Cuando hayas terminado sube el proyecto a Git.
7. Haz una pull request con tu fork.

## 🎲 Ahora sí! Comenzamos!

### Contar ovejas
Considera una lista/array de ovejas. Cada oveja tiene un nombre y un color. Haz una función que devuelva una lista con todas las ovejas que sean de color `rojo` y que además su nombre contenga tanto las letras `n` Y `a`, sin importar el orden, las mayúsculas o espacios.

Por ejemplo, si tenemos las ovejas:

```json
[
  { name: 'Noa', color: 'azul' },
  { name: 'Euge', color: 'rojo' },
  { name: 'Navidad', color: 'rojo' },
  { name: 'Ki Na Ma', color: 'rojo'},
  { name: 'AAAAAaaaaa', color: 'rojo' },
  { name: 'Nnnnnnnn', color: 'rojo'}
]
```
Al ejecutar el método debería devolver lo siguiente:

```json
[
  { name: 'Navidad', color: 'rojo' },
  { name: 'Ki Na Ma', color: 'rojo' }
]
```

> Recuerda. Debe contener las dos letras 'a' y 'n' en el nombre. No cuentes ovejas que sólo tenga una de las letras, debe tener ambas.    



### Shape Solid Program 

Crea una aplicación que calcule el área de:   
   
* Un circulo. `Área circulo = Pi * radio^2`
* Un rectángulo.  `Área rectángulo = base * altura`
* Un cuadrado.  `Área cuadrado = lado^2`

> Recuerda utilizar arquitectura y principios solid. Utiliza clases.   
> Ten en cuenta que este programa, después será modificado para añadir nuevas funcionalidades, como la del cárculo del perímetro de cada figura que nos ha pedido el cliente.
