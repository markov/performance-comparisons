package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_404 {
    private val production = Production21_404("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}