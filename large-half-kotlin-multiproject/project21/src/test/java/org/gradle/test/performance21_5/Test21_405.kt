package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_405 {
    private val production = Production21_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}