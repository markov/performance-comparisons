package org.gradle.test.performance25_5

import org.junit.Assert.*

class Test25_500 {
    private val production = Production25_500("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}