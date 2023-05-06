package com.github.marceloleite2604;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class HashTest {

  @Test
  void shouldGenerateEqualHashesForDifferentObjectsThatImplementsEqualsAndHashMethods() {
    final var fruitBuilder = Fruit.builder()
        .name("banana")
        .color("yellow");

    final var fruitA = fruitBuilder.build();

    final var fruitB = fruitBuilder.build();

    assertThat(fruitA).hasSameHashCodeAs(fruitB);
  }

  @Test
  void shouldGenerateDifferentHashesForDifferentObjectsThatDoesNotImplementEqualsAndHashMethods() {
    final var animalBuilder = Animal.builder()
        .name("spot")
        .type("dog");

    final var animalA = animalBuilder.build();

    final var animalB = animalBuilder.build();

    assertThat(animalA).doesNotHaveSameHashCodeAs(animalB);
  }

  @Test
  void setsShouldGenerateEqualHashesWhenEqualElementsAreIncludedInDifferentOrder() {
    final var animalBuilder = Animal.builder()
        .name("spot")
        .type("dog");

    final var animalA = animalBuilder.build();

    final var animalB = animalBuilder.build();

    final var animalC = animalBuilder.build();

    final var animalD = animalBuilder.build();

    final Collection<Animal> furnitureA = Set.of(animalA, animalB, animalD, animalC);
    final Collection<Animal> furnitureB = Set.of(animalC, animalD, animalA, animalB);

    assertThat(furnitureA).hasSameHashCodeAs(furnitureB);
  }

  @Test
  void listsShouldGenerateDifferentHashesWhenElementsAreInDifferentOrder() {
    final var animalBuilder = Animal.builder()
        .name("spot")
        .type("dog");

    final var animalA = animalBuilder.build();

    final var animalB = animalBuilder.build();

    final Collection<Animal> animalsA = List.of(animalA, animalB);
    final Collection<Animal> animalsB = List.of(animalB, animalA);

    assertThat(animalsA).doesNotHaveSameHashCodeAs(animalsB);
  }

  @Test
  void listsShouldGenerateEqualHashesWhenElementsAreInSameOrder() {
    final var animalBuilder = Animal.builder()
        .name("spot")
        .type("dog");

    final var animalA = animalBuilder.build();

    final var animalB = animalBuilder.build();

    final Collection<Animal> animalsA = List.of(animalA, animalB);
    final Collection<Animal> animalsB = List.of(animalA, animalB);

    assertThat(animalsA).hasSameHashCodeAs(animalsB);
  }

}
