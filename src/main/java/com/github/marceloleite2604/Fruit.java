package com.github.marceloleite2604;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Fruit {

  private final String name;

  private final String color;

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Fruit)) return false;
    final Fruit other = (Fruit) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$name = this.name;
    final Object other$name = other.name;
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final Object this$color = this.color;
    final Object other$color = other.color;
    if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Fruit;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $name = this.name;
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final Object $color = this.color;
    result = result * PRIME + ($color == null ? 43 : $color.hashCode());
    return result;
  }
}
