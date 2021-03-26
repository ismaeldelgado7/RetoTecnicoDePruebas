# language: es
# encoding: UTF8
@reto
Característica: Comprar cursos Online
  Yo como Talento del Proyecto
  Quiero entrar la pagina de cursos
  Para obtener algunos

  @tag1
  Escenario: Comprar cursos Online Selenium Ruby y Mastering JavaScript
    Dado ingreso a la pagina
    Cuando Hago Click En los Cursos A Comprar
    Y Hago Click en el Carrito de Compras
    Y Elimino el curso Selenium Ruby
    Entonces Debería Mostrar Curso Elegido
    Pero no el precio debe ser mayor a 400
