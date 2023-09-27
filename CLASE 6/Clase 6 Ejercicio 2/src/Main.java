public class Main {
    public static void main(String[] args) {
        Futbolista jugador1 = new Futbolista("Diego Armando Maradona", 24, "Delantero", "Titular");
        Futbolista jugador2 = new Futbolista("Pelé", 29, "Delantero", "Titular");
        Futbolista jugador3 = new Futbolista("David Bekham", 28, "Medio Campo", "Titular");
        Futbolista jugador4 = new Futbolista("Lionel Messi", 20, "Delantero", "Titular");
        Futbolista jugador5 = new Futbolista("Cristiano Ronaldo", 22, "Delantero", "Titular");
        Futbolista jugador6 = new Futbolista("Kun Aguero", 21, "Medio Campo", "Titular");
        Futbolista jugador7 = new Futbolista("Kylian Mbappé", 18, "Delantero", "Titular");
        Futbolista jugador8 = new Futbolista("Neymar Jr", 21, "Delantero", "Titular");
        Futbolista jugador9 = new Futbolista("Luka Modrik", 22, "Medio Campo", "Titular");
        Futbolista jugador10 = new Futbolista("Julian Alvarez", 18, "Delantero", "Titular");

        Presidente presidente1 = new Presidente("Mauricio Macri", 45);
        Presidente presidente2 = new Presidente("Alberto Fernández", 51);

        Entrenador entrenador1 = new Entrenador("Pepe Roca", 141);
        Entrenador entrenador2 = new Entrenador("San Martín", 281);

        Fisioterapeuta fisioterapeuta1 = new Fisioterapeuta("Ricardo Sosa", 24);
        Fisioterapeuta fisioterapeuta2 = new Fisioterapeuta("Miranda Sosa", 29);
        Fisioterapeuta fisioterapeuta3 = new Fisioterapeuta("José Sosa", 41);
        Fisioterapeuta fisioterapeuta4 = new Fisioterapeuta("Martín Sosa", 34);

        Manager manager1 = new Manager("Rata Rateri", 87);
        Manager manager2 = new Manager("Rojo Pojo", 74);

        Equipo equipo1 = new Equipo("PSG", new Futbolista[]{jugador1, jugador3, jugador5, jugador7, jugador9}, presidente1, new Entrenador[]{entrenador1}, new Fisioterapeuta[]{fisioterapeuta1, fisioterapeuta2}, manager1);
        Equipo equipo2 = new Equipo("INTER MIAMI", new Futbolista[]{jugador2, jugador4, jugador6, jugador8, jugador10}, presidente2, new Entrenador[]{entrenador2}, new Fisioterapeuta[]{fisioterapeuta3, fisioterapeuta4}, manager2);

        Partido partido1 = new Partido(12.00, "Italia", new Equipo[]{equipo1, equipo2});
        Partido partido2 = new Partido(18.00, "Russia", new Equipo[]{equipo1, equipo2});
        Partido partido3 = new Partido(8.30, "Argentina", new Equipo[]{equipo1, equipo2});
        Partido partido4 = new Partido(21.00, "Brazil", new Equipo[]{equipo1, equipo2});

        equipo1.entrenar(entrenador1, equipo1);
        System.out.println();
        equipo2.entrenar(entrenador2, equipo2);
        System.out.println();

        equipo1.jugarPartido(partido1, equipo1, equipo2);
        System.out.println();
        equipo2.jugarPartido(partido2, equipo2, equipo1);
        System.out.println();
        equipo1.jugarPartido(partido3, equipo1, equipo2);
        System.out.println();
        equipo2.jugarPartido(partido4, equipo2, equipo1);
        System.out.println();

        manager1.compararEstadisticas(equipo1, equipo2);
        System.out.println();

        manager2.compararEstadisticas(equipo2, equipo1);
        System.out.println();
    }
}