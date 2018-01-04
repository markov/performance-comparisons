package org.gradle.test.performance21_1

import org.junit.Assert.*

class Test21_88 {
    private val production = Production21_88("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}