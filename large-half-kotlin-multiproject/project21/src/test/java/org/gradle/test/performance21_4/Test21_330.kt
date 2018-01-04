package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_330 {
    private val production = Production21_330("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}