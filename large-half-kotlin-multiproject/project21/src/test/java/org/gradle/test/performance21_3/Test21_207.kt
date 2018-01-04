package org.gradle.test.performance21_3

import org.junit.Assert.*

class Test21_207 {
    private val production = Production21_207("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}