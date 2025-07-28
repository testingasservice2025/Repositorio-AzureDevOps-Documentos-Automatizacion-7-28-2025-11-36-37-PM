Feature: Cancelación de carga

  Escenario: Validar opción para cancelar carga en proceso
    Dado que el usuario arrastra y suelta un archivo para cargar
    Cuando el sistema muestra la barra de progreso de carga
    Y el usuario pulsa la opción de cancelar carga mientras el archivo está en proceso
    Entonces el sistema detiene la carga y elimina la información del archivo en proceso
    Y el usuario verifica que la opción de cargar nuevamente esté disponible
    Entonces el sistema permite iniciar otro proceso de carga sin errores