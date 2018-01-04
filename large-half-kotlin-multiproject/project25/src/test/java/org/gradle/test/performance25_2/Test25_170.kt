package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_170 {
    private val production = Production25_170("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}