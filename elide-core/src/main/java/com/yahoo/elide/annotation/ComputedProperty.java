/*
 * Copyright 2015, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package com.yahoo.elide.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Marks a method or field as a computed property that should be exposed via Elide regardless of whether or
 * not it is marked as Transient.
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface ComputedProperty {
}
