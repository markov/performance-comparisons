package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_338 {
    private val production = Production21_338("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}