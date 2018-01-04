package org.gradle.test.performance25_3

import org.junit.Assert.*

class Test25_281 {
    private val production = Production25_281("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}