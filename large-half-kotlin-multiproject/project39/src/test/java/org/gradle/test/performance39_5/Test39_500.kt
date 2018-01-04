package org.gradle.test.performance39_5

import org.junit.Assert.*

class Test39_500 {
    private val production = Production39_500("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}