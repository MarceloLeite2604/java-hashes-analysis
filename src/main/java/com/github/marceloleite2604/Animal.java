package com.github.marceloleite2604;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Animal {

  private final String name;

  private final String type;
}
