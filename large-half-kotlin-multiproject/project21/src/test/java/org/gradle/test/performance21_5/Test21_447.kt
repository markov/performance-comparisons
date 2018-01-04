package org.gradle.test.performance21_5

import org.junit.Assert.*

class Test21_447 {
    private val production = Production21_447("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}