package org.gradle.test.performance21_1

import org.junit.Assert.*

class Test21_40 {
    private val production = Production21_40("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}