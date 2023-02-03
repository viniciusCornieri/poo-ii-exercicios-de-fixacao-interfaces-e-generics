package cornieri.vinicius.poo.solucoes.ex2.forma3D;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

class Exercicio2Test {

    @Test
    void deveSomarAAreaDosCubos() {
        Cubo cuboDeLado1 = new Cubo(BigDecimal.ONE);
        BigDecimal cinco = BigDecimal.valueOf(5);
        Cubo cuboDeLado5 = new Cubo(cinco);

        List<Cubo> cubos = List.of(cuboDeLado1, cuboDeLado5);

        BigDecimal areaDoCuboDeLado1 = cuboDeLado1.area();
        BigDecimal areaDoCuboDeLado5 = cuboDeLado5.area();

        Assertions.assertThat(Exercicio2.somaDasAreas(cubos)).isEqualByComparingTo(areaDoCuboDeLado1.add(areaDoCuboDeLado5));
    }

    @Test
    void deveSomarOVolumeDosCubos() {
        Cubo cuboDeLado1 = new Cubo(BigDecimal.ONE);
        BigDecimal cinco = BigDecimal.valueOf(5);
        Cubo cuboDeLado5 = new Cubo(cinco);

        List<Cubo> cubos = List.of(cuboDeLado1, cuboDeLado5);

        BigDecimal volumeDoCuboDeLado1 = cuboDeLado1.volume();
        BigDecimal volumeDoCuboDeLado5 = cuboDeLado5.volume();

        Assertions.assertThat(Exercicio2.somaDosVolumes(cubos)).isEqualByComparingTo(volumeDoCuboDeLado1.add(volumeDoCuboDeLado5));
    }

    @Test
    void deveSomarAAreaDosCilindros() {
        BigDecimal dois = BigDecimal.valueOf(2);
        Cilindro cilindroDeRaio1eAltura2 = new Cilindro(BigDecimal.ONE, dois);
        Cilindro cilindroDeRaio2eAltura10 = new Cilindro(dois, BigDecimal.TEN);

        List<Cilindro> cilindros = List.of(cilindroDeRaio1eAltura2, cilindroDeRaio2eAltura10);

        BigDecimal areaDoCilindroDeRaio1eAltura2 = cilindroDeRaio1eAltura2.area();
        BigDecimal areaDoCilindroDeRaio2eAltura10 = cilindroDeRaio2eAltura10.area();

        BigDecimal somaEsperadaDasAreas = areaDoCilindroDeRaio1eAltura2.add(areaDoCilindroDeRaio2eAltura10);
        Assertions.assertThat(Exercicio2.somaDasAreas(cilindros)).isEqualByComparingTo(somaEsperadaDasAreas);
    }

    @Test
    void deveSomarOVolumeDosCilindros() {
        BigDecimal dois = BigDecimal.valueOf(2);
        Cilindro cilindroDeRaio1eAltura2 = new Cilindro(BigDecimal.ONE, dois);
        Cilindro cilindroDeRaio2eAltura10 = new Cilindro(dois, BigDecimal.TEN);

        List<Cilindro> cilindros = List.of(cilindroDeRaio1eAltura2, cilindroDeRaio2eAltura10);

        BigDecimal volumeDoCilindroDeRaio1eAltura2 = cilindroDeRaio1eAltura2.volume();
        BigDecimal volumeDoCilindroDeRaio2eAltura10 = cilindroDeRaio2eAltura10.volume();

        BigDecimal somaEsperadaDosVolumes = volumeDoCilindroDeRaio1eAltura2.add(volumeDoCilindroDeRaio2eAltura10);
        Assertions.assertThat(Exercicio2.somaDosVolumes(cilindros)).isEqualByComparingTo(somaEsperadaDosVolumes);
    }

    @Test
    void deveSomarAAreaDasEsferas() {
        Esfera esferaDeRaio1 = new Esfera(BigDecimal.ONE);
        Esfera esferaDeRaio4 = new Esfera(BigDecimal.valueOf(4));

        List<Esfera> esferas = List.of(esferaDeRaio1, esferaDeRaio4);

        BigDecimal areaDaEsferaDeRaio1 = esferaDeRaio1.area();
        BigDecimal areaDaEsferaDeRaio4 = esferaDeRaio4.area();

        BigDecimal somaEsperadaDasAreas = areaDaEsferaDeRaio1.add(areaDaEsferaDeRaio4);
        Assertions.assertThat(Exercicio2.somaDasAreas(esferas)).isEqualByComparingTo(somaEsperadaDasAreas);
    }

    @Test
    void deveSomarOVolumeDasEsferas() {
        Esfera esferaDeRaio1 = new Esfera(BigDecimal.ONE);
        Esfera esferaDeRaio4 = new Esfera(BigDecimal.valueOf(4));

        List<Esfera> esferas = List.of(esferaDeRaio1, esferaDeRaio4);

        BigDecimal volumeDaEsferaDeRaio1 = esferaDeRaio1.volume();
        BigDecimal volumeDaEsferaDeRaio4 = esferaDeRaio4.volume();

        BigDecimal somaEsperadaDosVolumes = volumeDaEsferaDeRaio1.add(volumeDaEsferaDeRaio4);
        Assertions.assertThat(Exercicio2.somaDosVolumes(esferas)).isEqualByComparingTo(somaEsperadaDosVolumes);
    }

    @Test
    void deveSomarAAreaDeFormasDistintas() {
        Cubo cuboDeLado1 = new Cubo(BigDecimal.ONE);
        Esfera esferaDeRaio4 = new Esfera(BigDecimal.valueOf(4));
        Cilindro cilindroDeRaio2eAltura10 = new Cilindro(BigDecimal.valueOf(2), BigDecimal.TEN);

        List<Forma3D> formas = List.of(cuboDeLado1, esferaDeRaio4, cilindroDeRaio2eAltura10);

        BigDecimal areaDoCuboDeLado1 = cuboDeLado1.area();
        BigDecimal areaDaEsferaDeRaio4 = esferaDeRaio4.area();
        BigDecimal areaDoCilindroDeRaio2eAltura10 = cilindroDeRaio2eAltura10.area();

        BigDecimal somaEsperadaDasAreas = areaDoCuboDeLado1.add(areaDaEsferaDeRaio4).add(areaDoCilindroDeRaio2eAltura10);
        Assertions.assertThat(Exercicio2.somaDasAreas(formas)).isEqualByComparingTo(somaEsperadaDasAreas);
    }

    @Test
    void deveSomarOVolumeDeFormasDistintas() {
        Cubo cuboDeLado1 = new Cubo(BigDecimal.ONE);
        Esfera esferaDeRaio4 = new Esfera(BigDecimal.valueOf(4));
        Cilindro cilindroDeRaio2eAltura10 = new Cilindro(BigDecimal.valueOf(2), BigDecimal.TEN);

        List<Forma3D> formas = List.of(cuboDeLado1, esferaDeRaio4, cilindroDeRaio2eAltura10);

        BigDecimal volumeDoCuboDeLado1 = cuboDeLado1.volume();
        BigDecimal volumeDaEsferaDeRaio4 = esferaDeRaio4.volume();
        BigDecimal volumeDoCilindroDeRaio2eAltura10 = cilindroDeRaio2eAltura10.volume();

        BigDecimal somaEsperadaDosVolumes = volumeDoCuboDeLado1.add(volumeDaEsferaDeRaio4).add(volumeDoCilindroDeRaio2eAltura10);
        Assertions.assertThat(Exercicio2.somaDosVolumes(formas)).isEqualByComparingTo(somaEsperadaDosVolumes);
    }

}